package SistemaEstacionamento;

public class Aluno {
    private static final int IDADE_MIN = 16;
    private static final int MATRICULA_MIN = 100000;
    private static final int MATRICULA_MAX = 999999;
    private static final int SENHA_MIN = 1000;
    private static final int SENHA_MAX = 9999;
    private String nome;
    private int idade;
    private int matricula;
    private int senha;
    private boolean especial;
    
    
    public Aluno(String N, int I, int M, int S, boolean E){
        if(N != null){
            this.nome = N;
        }
        
        if(I >= IDADE_MIN){
            this.idade = I;
        }
        
        if(M >= MATRICULA_MIN && M <= MATRICULA_MAX){
            this.matricula = M;
        }
        
        if(S >= SENHA_MIN && S <= SENHA_MAX){
            this.senha = S;
        }
        
        this.especial = E;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String N){
        if(N != null){
            this.nome = N;
        }
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int I){
        if(I >= IDADE_MIN){
            this.idade = I;
        }
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(int M){
        if(M >= MATRICULA_MIN && M <= MATRICULA_MAX){
            this.matricula = M;
        }
    }
    
    public int getSenha(){
        return this.senha;
    }
    
    public void setSenha(int S){
        if(S >= SENHA_MIN && S <= SENHA_MAX){
            this.senha = S;
        }
    }
    
    public boolean getEspecial(){
        return this.especial;
    }
    
    public void setEspecial(boolean E){
        this.especial = E;
    }
}
