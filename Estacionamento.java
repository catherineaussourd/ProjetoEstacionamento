package SistemaEstacionamento;

public class Estacionamento { // 50 vagas
    int[]carro    =  new int[25];
    int[]moto     =  new int[15];
    int[]especial =  new int[10];
    Registro[]Banco = new Registro[900000];
    
    public int verificarVaga(int v){
        int v0;
        if(v == 1){
            int i;
            for (i = 0 ; i < especial.length ; i = i + 1) {
                if(especial[i] == 0){
                    v0 = i;
                }
            }v0 = -1; // Sem vagas
        }
        else if(v == 2){
            int i;
            for (i = 0 ; i < moto.length ; i = i + 1) {
                if(moto[i] == 0){
                    v0 = i;
                }
            }v0 = -1; // Sem vagas
        }else{
            int i;
            for (i = 0 ; i < carro.length ; i = i + 1) {
                if(carro[i] == 0){
                    v0 = i;
                }
            }v0 = -1; // Sem vagas
        }
        return v0;
    }
    
    public int TipoVaga(Registro r){
        int R;
        if(r.especial()) { R = 1; }
        
        else if(r.moto()) { R = 2; }

        else { R = 3; }

        return R;
    }
    
    
    
    public int acessarRegistro(int M, int S){
        Registro aluno;
        int R = 0;
        if(verificarRegistro(M)){
            int i;
            for (i = 0 ; i < Banco.length ; i = i + 1) {
                if(Banco[i].matricula() == M){
                    if(Banco[i].senha() == S){
                        aluno = getRegistro(M);
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
    
    public Registro getRegistro(int M){
        Registro R = Banco[0];
        int i;
        for (i = 0 ; i < Banco.length ; i = i + 1) {
            if(Banco[i].matricula() == M){
                R = Banco[i];
            }
        }
        return R;
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