package SistemaEstacionamento;

public class Estacionamento { // 50 vagas
    int[]carro    =  new int[25];
    int[]moto     =  new int[15];
    int[]especial =  new int[10];
    Registro[]Banco = new Registro[900000];
    
    public int verificarVaga(Registro r){
        int R;
        if(r.especial()){
            int i;
            for (i = 0 ; i < especial.length ; i = i + 1) {
                if(especial[i] == 0){
                    R = 3;
                }
            }R = 30;
        }
        else if(r.moto()){
            int i;
            for (i = 0 ; i < moto.length ; i = i + 1) {
                if(moto[i] == 0){
                    R = 2;
                }
            }R = 20;
        }else{
            int i;
            for (i = 0 ; i < carro.length ; i = i + 1) {
                if(carro[i] == 0){
                    R = 1;
                }
            }R = 10;
        }
        return R;
    }
    
    public void acessarRegistro(int M, int S){
        if(verificarRegistro(M)){
            int i;
            for (i = 0 ; i < Banco.length ; i = i + 1) {
                if(Banco[i].matricula() == M){
                    if(Banco[i].senha() == S){
                        verificarVaga(Banco[i]);
                        break;
                    }else{
                        System.out.println("Senha incorreta");
                        break;
                    }
                }
            }
        }else{ System.out.println("Aluno não registrado"); }
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
    
    public boolean verificarRegistro(Registro r){
        int i;
        for (i = 0 ; i < Banco.length ; i = i + 1) {
            if(Banco[i].matricula() == r.matricula()){
                return true;
            }
        }
        return false;
    }
    
    public boolean verificarRegistro(int M){
        int i;
        for (i = 0 ; i < Banco.length ; i = i + 1) {
            if(Banco[i].matricula() == M){
                return true;
            }
        }
        return false;
    }

    

}