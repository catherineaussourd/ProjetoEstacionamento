package br.com.unicap.repositorio;

import br.com.unicap.estacionamento.Aluno;
import br.com.unicap.estacionamento.Automovel;
import br.com.unicap.exception.InvalidDataException;
import br.com.unicap.tipo.TipoVeiculo;

public class Registro extends Aluno {

    /*Registro extende de aluno pois ele ultiliza os atributos
      da classe aluno para compor o perfil do aluno no Registro do estacionamento*/

    private Automovel aAutomovel;
    private TipoVeiculo aTipo;

    public Registro(String pNome, int pIdade, int pMatricula, int pSenha, boolean pEspecial,
            String pMarcaAutomovel,
            String pPlacaAutomovel, boolean isMoto) throws InvalidDataException {

        super(pNome, pIdade, pMatricula, pSenha, pEspecial);

        aAutomovel = new Automovel(pMarcaAutomovel, pPlacaAutomovel, isMoto);

        this.getaAutomovel().setMarca(pMarcaAutomovel);
        this.getaAutomovel().setPlaca(pPlacaAutomovel);
        this.getaAutomovel().setMoto(isMoto);

        if (pEspecial) {
            this.setaTipo(TipoVeiculo.ESPECIAL);
        } else if (isMoto) {
            this.setaTipo(TipoVeiculo.MOTO);
        } else {
            this.setaTipo(TipoVeiculo.CARRO);
        }
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

    public boolean isMoto() {
        return getaAutomovel().isMoto();
    }

    public TipoVeiculo getaTipo() {
        return aTipo;
    }

    public void setaTipo(TipoVeiculo aTipo) {
        this.aTipo = aTipo;
    }

    public Automovel getaAutomovel() {
        return aAutomovel;
    }

    public void setaAutomovel(Automovel aAutomovel) {
        this.aAutomovel = aAutomovel;
    }
}
