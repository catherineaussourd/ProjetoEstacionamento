package br.com.unicap.estrutura;

import br.com.unicap.estacionamento.Estacionamento;
import br.com.unicap.exception.InvalidDataException;
import br.com.unicap.repositorio.Registro;

import java.util.Scanner;
/**
 *
 * @author Catatau
 */
public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento();
        int resposta;
        boolean L = true;

        do {
            try {
                System.out.println("\n< E S T A C I O N A M E N T O >\n" + "0 - Cadastrar um veículo\n" + "1 - Estacionar em uma vaga\n"
                        +"2 - Listar Carro\n" + "3 - Remover veículo\n" + "4 - Sair da aplicação\n");
                System.out.print("Opção: ");
                resposta = in.next().charAt(0);
                System.out.println("\n");

                // Buffer cls
                in.nextLine();

                switch (resposta) {
                    case '0':
                        Facade.getInstancia().cadastrarAluno(estacionamento);
                        break;
                    case '1':
                        Facade.getInstancia().acessarVagasDisponiveis(estacionamento);
                        break;
                    case '2':
                        Facade.getInstancia().listarCarros(estacionamento);
                        break;
                    case '3':
                        Facade.getInstancia().saidaVeiculo(estacionamento);
                        break;
                    case '4':
                        L = false;
                    default:
                        break;
                }
            } catch (InvalidDataException e) {
                System.out.println(e.getMessage());
                L = true;
            }
        } while (L);

    }

    
}
