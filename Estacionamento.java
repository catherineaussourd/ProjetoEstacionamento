package SistemaEstacionamento;

import SistemaEstacionamento.repositorio.Registro;

public class Estacionamento { // 50 vagas
        
    int[]carro    =  new int[25];
    int[]moto     =  new int[15];
    int[]especial =  new int[10];
    Registro[]Banco = new Registro[900000];
    
    public int verificarVaga(TipoVeiculo veiculo){
        int vagaEspecial;
        switch (veiculo) {
            case ESPECIAL:
                {
                    int i;
                    for (i = 0 ; i < especial.length ; i = i + 1) {
                        if(especial[i] == 0){
                            vagaEspecial = i;
                        }
                    }       vagaEspecial = -1; // Sem vagas
                    break;
                }
            case MOTO:
                {
                    int i;
                    for (i = 0 ; i < moto.length ; i = i + 1) {
                        if(moto[i] == 0){
                            vagaEspecial = i;
                        }
                    }       vagaEspecial = -1; // Sem vagas
                    break;
                }
            default:
                {
                    int i;
                    for (i = 0 ; i < carro.length ; i = i + 1) {
                        if(carro[i] == 0){
                            vagaEspecial = i;
                        }
                    }       vagaEspecial = -1; // Sem vagas
                    break;
                }
        }
        return vagaEspecial;
    }
    
    public int TipoVaga(Registro registro){
        int r;
        if(registro.especial()) { r = 1; }
        
        else if(registro.moto()) { r = 2; }

        else { r = 3; }

        return r;
    }
    
    
    
    public int acessarRegistro(int matricula, int senha){
        Registro aluno;
        int R = 0;
        if(verificarRegistro(matricula)){
            int i;
            for (i = 0 ; i < Banco.length ; i = i + 1) {
                if(Banco[i].matricula() == matricula){
                    if(Banco[i].senha() == senha){
                        aluno = getRegistro(matricula);
                        R = TipoVaga(aluno);
                    }else{ R = 4;} // 4 Senha incorreta
                }
            }
        }else{ } // 0 Aluno não registrado
        return R;
    }
    
    public void registrar(Registro r){
        if(verificarRegistro(r)){
            System.out.println("Aluno já está matriculado");
        }else{
            int i;
            for (i = 0 ; i < Banco.length ; i = i + 1) {
                if(Banco[i] == null){
                Banco[i] = r;
                }
            }
        }
    }
    
    public Registro getRegistro(int matricula){
        Registro R = Banco[0];
        int i;
        for (i = 0 ; i < Banco.length ; i = i + 1) {
            if(Banco[i].matricula() == matricula){
                R = Banco[i];
            }
        }
        return R;
    }
    
    public boolean verificarRegistro(Registro registro){
        int i;
        for (i = 0 ; i < Banco.length ; i = i + 1) {
            if(Banco[i].matricula() == registro.matricula()){
                return true;
            }
        }
        return false;
    }
    
    public boolean verificarRegistro(int matricula){
        int i;
        for (i = 0 ; i < Banco.length ; i = i + 1) {
            if(Banco[i].matricula() == matricula){
                return true;
            }
        }
        return false;
    }

    

}