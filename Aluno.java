
public class Aluno {
    private static final int IDADE_MIN = 16;
    private static final int MATRICULA_MIN = 100000;
    private static final int MATRICULA_MAX = 999999;
    private static final int SENHA_MIN = 1000;
    private static final int SENHA_MAX = 9999;
    private String aNome;
    private int aIdade;
    private int aMatricula;
    private int aSenha;
    private boolean aEspecial;
    
    public Aluno(String pNome, int pIdade, int pMatricula, int pSenha, boolean pEspecial){
        if(pNome != null){
            this.aNome = pNome;
        }
        
        if(pIdade >= IDADE_MIN){
            this.aIdade = pIdade;
        }
        
        if(pMatricula >= MATRICULA_MIN && pMatricula <= MATRICULA_MAX){
            this.aMatricula = pMatricula;
        }
        
        if(pSenha >= SENHA_MIN && pSenha <= SENHA_MAX){
            this.aSenha = pSenha;
        }
        
        this.aEspecial = pEspecial;
    }
    
    public String getNome(){
        return this.aNome;
    }
    
    public void setNome(String nome){
        if(nome != null){
            this.aNome = nome;
        }
    }
    
    public int getIdade(){
        return this.aIdade;
    }
    
    public void setIdade(int idade){
        if(idade >= IDADE_MIN){
            this.aIdade = idade;
        }
    }
    
    public int getMatricula(){
        return this.aMatricula;
    }
    
    public void setMatricula(int pMatricula){
        if(pMatricula >= MATRICULA_MIN && pMatricula <= MATRICULA_MAX){
            this.aMatricula = pMatricula;
        }
    }
    
    public boolean validaSenha(int pSenha){
        return this.aSenha == pSenha;
    }
    
    public void setSenha(int pSenha){
        if(pSenha >= SENHA_MIN && pSenha <= SENHA_MAX){
            this.aSenha = pSenha;
        }
    }
    
    public boolean getEspecial(){
        return this.aEspecial;
    }
    
    public void setEspecial(boolean pEspecial){
        this.aEspecial = pEspecial;
    }
    
}
