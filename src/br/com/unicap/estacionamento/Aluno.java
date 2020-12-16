package br.com.unicap.estacionamento;

import br.com.unicap.exception.InvalidDataException;
/**
 *
 * @author Catatau
 */
public class Aluno {

    private static final int IDADE_MIN = 18;
    private static final int MATRICULA_MIN = 1000000000; //para entrar na validação da Matricula como se fosse a matricula da UNICAP
    private static final int MATRICULA_MAX = 2099999999;
    private static final int SENHA_MIN = 100000;
    private static final int SENHA_MAX = 999999;
    private String aNome;
    private int aIdade;
    private int aMatricula;
    private int aSenha;
    private boolean aEspecial;

    public Aluno(String pNome, int pIdade, int pMatricula, int pSenha, boolean pEspecial) throws InvalidDataException {
        if (pNome != null) {
            this.aNome = pNome;
        } else {
            throw new InvalidDataException("\nNome não pode ser vazio");
        }

        if (pIdade >= IDADE_MIN) {
            this.aIdade = pIdade;
        } else {
            throw new InvalidDataException("\nIdade não pode ser menor do que " + IDADE_MIN + " anos");
        }

        if (pMatricula >= MATRICULA_MIN && pMatricula <= MATRICULA_MAX) {
            this.aMatricula = pMatricula;
        } else {
            throw new InvalidDataException("\nMatrícula tem que estar entre " + MATRICULA_MIN + " e " + MATRICULA_MAX);
        }

        if (pSenha >= SENHA_MIN && pSenha <= SENHA_MAX) {
            this.aSenha = pSenha;
        } else {
            throw new InvalidDataException("\nSenha tem que estar entre " + SENHA_MIN + " e " + SENHA_MAX);
        }

        this.aEspecial = pEspecial;
    }

    public String getNome() {
        return this.aNome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.aNome = nome;
        }
    }

    public int getIdade() {
        return this.aIdade;
    }

    public void setIdade(int idade) {
        if (idade >= IDADE_MIN) {
            this.aIdade = idade;
        }
    }

    public int getMatricula() {
        return this.aMatricula;
    }

    public void setMatricula(int pMatricula) {
        if (pMatricula >= MATRICULA_MIN && pMatricula <= MATRICULA_MAX) {
            this.aMatricula = pMatricula;
        }
    }

    public boolean validaSenha(int pSenha) {
        return this.aSenha == pSenha;
    }

    public void setSenha(int pSenha) {
        if (pSenha >= SENHA_MIN && pSenha <= SENHA_MAX) {
            this.aSenha = pSenha;
        }
    }

    public boolean getEspecial() {
        return this.aEspecial;
    }

    public void setEspecial(boolean pEspecial) {
        this.aEspecial = pEspecial;
    }

}
