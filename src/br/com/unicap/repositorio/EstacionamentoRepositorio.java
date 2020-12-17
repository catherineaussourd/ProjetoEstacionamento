/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unicap.repositorio;

import br.com.unicap.estacionamento.Automovel;
import br.com.unicap.estacionamento.Garagem;
import br.com.unicap.tipo.TipoVaga;

/**
 *
 * @author Catatau
 */
public class EstacionamentoRepositorio implements IEstacionamentoRepositorio {
    private Garagem vagasCarro = new Garagem(25);
    private Garagem vagasMoto = new Garagem(15);
    private Garagem vagasEspeciais = new Garagem(10);
    
    @Override
    public boolean addVeiculoGaragem(Automovel veiculo, TipoVaga tipoVaga) {
        Garagem garagem = null;
        switch(tipoVaga){
            case CARRO:
                garagem = vagasCarro;
                break;
            case MOTO:
                garagem = vagasMoto;
                break;
            case ESPECIAL:
                garagem = vagasEspeciais;
                break;
        }
        if (garagem.hasVaga()) {
            garagem.add(veiculo);
            return true;
        }
        return false;
    }

    @Override
    public boolean retiraVeiculoGaragem(String placa) {
        if (vagasCarro.busca(placa) != null) {
            vagasCarro.remover(placa);
            return true;
        } else if (vagasMoto.busca(placa) != null) {
            vagasMoto.remover(placa);
            return true;
        } else if (vagasEspeciais.busca(placa) != null) {
            vagasEspeciais.remover(placa);
            return true;
        }
        return false;
    }

    @Override
    public void listarVeiculosGaragem() {
        vagasCarro.listar();
        System.out.println();
        vagasMoto.listar();
        System.out.println();
        vagasEspeciais.listar();
        System.out.println();
    }
    
}
