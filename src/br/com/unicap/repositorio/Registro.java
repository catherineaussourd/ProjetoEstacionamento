package br.com.unicap.repositorio;

import br.com.unicap.estacionamento.Aluno;
import br.com.unicap.estacionamento.Automovel;
import br.com.unicap.estacionamento.AutomovelFactory;
import br.com.unicap.estacionamento.Moto;
import br.com.unicap.exception.InvalidDataException;
import br.com.unicap.tipo.TipoVeiculo;
/**
 *
 * @author Catatau
 */
public class Registro extends Aluno {

    /*Registro extende de aluno pois ele ultiliza os atributos
      da classe aluno para compor o perfil do aluno no Registro do estacionamento*/

    private Automovel aAutomovel;

    public Registro(String pNome, int pIdade, int pMatricula, int pSenha, boolean pEspecial,
            String pMarcaAutomovel,
            String pPlacaAutomovel, boolean isMoto) throws InvalidDataException {

        super(pNome, pIdade, pMatricula, pSenha, pEspecial);
        
        TipoVeiculo tipo = (isMoto) ? TipoVeiculo.MOTO : TipoVeiculo.CARRO;
        aAutomovel = AutomovelFactory.preencheAutomovel(tipo, pMarcaAutomovel, pPlacaAutomovel);    
    }

    public int getMatricula() {
        return super.getMatricula();
    }

    public boolean getEspecial() {
        return super.getEspecial();
    }

    public String getPlaca() {
        return getaAutomovel().getPlaca();
    }

    public String getMarca() {
        return getaAutomovel().getMarca();
    }

    public TipoVeiculo getaTipo() {
        TipoVeiculo tipo;
        if (aAutomovel instanceof Moto){
            tipo = TipoVeiculo.MOTO;
        } else {
            tipo = TipoVeiculo.CARRO;
        }
        return tipo;
    }

    public Automovel getaAutomovel() {
        return aAutomovel;
    }

    public void setaAutomovel(Automovel aAutomovel) {
        this.aAutomovel = aAutomovel;
    }
}
