/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unicap.repositorio;

import br.com.unicap.estacionamento.Automovel;
import br.com.unicap.tipo.TipoVaga;

/**
 *
 * @author Catatau
 */
public interface IEstacionamentoRepositorio {
    
    public boolean addVeiculoGaragem(Automovel veiculo, TipoVaga tipoVaga) ;
    
    public boolean retiraVeiculoGaragem(String placa);
    
    public void listarVeiculosGaragem();
    
}
