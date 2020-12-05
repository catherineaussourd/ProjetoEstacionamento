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
    private int especial;
    
    
    public Aluno(String nome, int idade, int matricula, int senha, int especial){
        if(nome != null){
            this.nome = nome;
        }
        
        if(idade >= IDADE_MIN){
            this.idade = idade;
        }
        
        if(matricula >= MATRICULA_MIN && matricula <= MATRICULA_MAX){
            this.matricula = matricula;
        }
        
        if(senha >= SENHA_MIN && senha <= SENHA_MAX){
            this.senha = senha;
        }
        
        this.especial = especial;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        if(nome != null){
            this.nome = nome;
        }
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        if(idade >= IDADE_MIN){
            this.idade = idade;
        }
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(int matricula){
        if(matricula >= MATRICULA_MIN && matricula <= MATRICULA_MAX){
            this.matricula = matricula;
        }
    }
    
    public int getSenha(){
        return this.senha;
    }
    
    public void setSenha(int senha){
        if(senha >= SENHA_MIN && senha <= SENHA_MAX){
            this.senha = senha;
        }
    }
    
    public int getEspecial(){
        return this.especial;
    }
    
    public void setEspecial(int especial){
        this.especial = especial;
    }
}
