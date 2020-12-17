package br.com.unicap.estacionamento;
import br.com.unicap.repositorio.EstacionamentoRepositorio;
import br.com.unicap.repositorio.IEstacionamentoRepositorio;
import br.com.unicap.repositorio.IRegistroRepositorio;
import br.com.unicap.repositorio.Registro;
import br.com.unicap.repositorio.RegistroRepositorio;
import br.com.unicap.tipo.TipoVaga;
import br.com.unicap.tipo.TipoVeiculo;

/**
 *
 * @author Catatau
 */
public final class Estacionamento { // 50 vagas
    private IEstacionamentoRepositorio estacionamentoRepositorio;
    private IRegistroRepositorio registroRepositorio;
    
    public Estacionamento() {
       estacionamentoRepositorio = new EstacionamentoRepositorio();
       registroRepositorio = new RegistroRepositorio();
    }
    
    public boolean verificarVaga(Registro veiculo) {
        
        Automovel auto = veiculo.getaAutomovel();
        boolean hasVaga = false;

        if (veiculo.getEspecial()) {
            hasVaga = estacionamentoRepositorio.addVeiculoGaragem(auto, TipoVaga.ESPECIAL);
        }  
        else {
            switch (veiculo.getaTipo()) {
                case MOTO: {
                    hasVaga = estacionamentoRepositorio.addVeiculoGaragem(auto, TipoVaga.MOTO);
                    break;
                }
                default: {
                    hasVaga = estacionamentoRepositorio.addVeiculoGaragem(auto, TipoVaga.CARRO);
                    break;
                }
            }
        }
        
        return hasVaga;
    }

    public boolean retiraVeiculoGaragem(String placa) {
        return estacionamentoRepositorio.retiraVeiculoGaragem(placa);
    }

    public void listarVeiculosGaragem() {
        estacionamentoRepositorio.listarVeiculosGaragem();
    }

    public TipoVeiculo TipoVaga(Registro registro) {
        return registro.getaTipo();
    }

    public Registro acessarRegistro(int pMatricula, int pSenha) {
        return registroRepositorio.acessarRegistro(pMatricula, pSenha);
    }

    public void registrar(Registro pRegistro) {
        registroRepositorio.registrar(pRegistro);
    }

    public Registro getRegistro(int pMatricula) {
        return registroRepositorio.getRegistro(pMatricula);
    }

    public boolean verificarRegistro(Registro pRegistro) {
        return registroRepositorio.verificarRegistro(pRegistro);
    }

    public boolean verificarRegistro(int pMatricula) {
        return registroRepositorio.verificarRegistro(pMatricula);
    }

}
