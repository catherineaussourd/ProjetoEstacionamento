package SistemaEstacionamento;

public class Registro extends Aluno{
    Automovel A;
    
    
    public Registro(String N, int I, int M, int S, boolean E, String AM, String AP, boolean Ab){
        super(N,I,M,S,E);
        this.A.setMarca(AM);
        this.A.setPlaca(AP);
        this.A.setMoto(Ab);
    }
    
    public int matricula(){
        return super.getMatricula();
    }
    
    public int senha(){
        return super.getSenha();
    }
    
    public boolean especial(){
        return super.getEspecial();
    }
    
    public String placa(){
        return A.getPlaca();
    }
    
    public String marca(){
        return A.getMarca();
    }
    
    public boolean moto(){
        return A.getMoto();
    }
    
}
