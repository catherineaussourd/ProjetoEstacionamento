/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unicap.estrutura;

import br.com.unicap.estacionamento.Estacionamento;
import static br.com.unicap.estrutura.Main.in;
import br.com.unicap.exception.InvalidDataException;
import br.com.unicap.repositorio.Registro;

/**
 *
 * @author Catatau
 */

//IMPLEMENTANDO O FACADE
public class Facade {
    
    //SINGLETON DENTRO DO FACADE
    private static Facade instancia;
    
    public static Facade getInstancia() {

        if (instancia == null) {
            instancia = new Facade();
        }
        return instancia;
    }
    
    private Facade(){
    
    }

    public static void acessarVagasDisponiveis(Estacionamento estacionamento) {

        int matricula;

        int senha;

        Registro reg;

        System.out.print("Informe sua Matricula:  ");
        matricula = in.nextInt();

        System.out.print("Informe sua Senha: ");
        senha = in.nextInt();

        reg = estacionamento.acessarRegistro(matricula, senha);

        if (reg == null) {
            System.out.println("\nAluno não registrado");
        } else if (reg.getaTipo() != null) {
            boolean v0;
            v0 = estacionamento.verificarVaga(reg);
            if (!v0) {
                System.out.println("\nNão há vagas Especiais disponíveis");
            } else {
                System.out.println("\n Carro estacionado! ");
            }
        } else {
            System.out.println("\nSenha incorreta");
        }
    }

    public static void cadastrarAluno(Estacionamento estacionamento) throws InvalidDataException {

        String nome;
        int idade;
        boolean especial;
        int ehEspecial;
        String marcaAutomovel;
        String placaAutomovel;
        boolean isMoto;
        int moto;
        int matricula;
        int senha;

        System.out.print("Informe seu Nome: ");
        nome = in.nextLine();

        System.out.print("Informe sua Idade (idade >= 18): ");
        idade = in.nextInt();

        // Buffer cls
        in.nextLine();

        System.out.print("Informe sua Matricula (ex: 2010108670): ");
        matricula = in.nextInt();

        // Buffer cls
        in.nextLine();

        System.out.print("Informe sua Senha (Senha com 6 dígitos): ");
        senha = in.nextInt();

        // Buffer cls
        in.nextLine();

        System.out.print("Você é um aluno especial? (0 - Sim) / (1 - Não) ");
        ehEspecial = in.nextInt();

        // Buffer cls
        in.nextLine();

        if (ehEspecial == 0) {
            especial = true;
        } else {
            especial = false;
        }

        System.out.print("Informe a Marca do Automovel: ");
        marcaAutomovel = in.next();

        // Buffer cls
        in.nextLine();

        System.out.print("Informe a Placa do Automovel: ");
        placaAutomovel = in.next();

        System.out.print("Seu automovel é uma moto? (0 - Sim) / (1 - Não) ");
        moto = in.nextInt();

        if (moto == 0) {
            isMoto = true;
        } else {
            isMoto = false;
        }

        Registro R = new Registro(nome, idade, matricula, senha, especial, marcaAutomovel, placaAutomovel, isMoto);
        estacionamento.registrar(R);
    }
    
    public static void saidaVeiculo(Estacionamento estacionamento) throws InvalidDataException { //**
        String placaAutomovel;
        boolean sai;
        System.out.print("Informe a Placa do Automovel: ");
        placaAutomovel = in.next();

        sai = estacionamento.retiraVeiculoGaragem(placaAutomovel);

        if (sai == true) {
            System.out.println("\nVeículo Removido");
        }

    }
    public static void listarCarros(Estacionamento estacionamento) throws InvalidDataException {
        estacionamento.listarVeiculosGaragem();
    }

}
