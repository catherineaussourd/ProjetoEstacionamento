package SistemaEstacionamento;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner (System.in);
    public static void main (String[]args) {
        Estacionamento E = new Estacionamento();
        char r; //resposta
        int M; //matrícula
        int S; //senha
        boolean L = false;
        
        do{
            System.out.println(
                      "< E S T A C I O N A M E N T O >\n"
                    + "Digite - 0 (Para acessar vagas disponiveis)\n"            
                    + "Digite - 1 (Para registrar-se)\n"       
                    + "Digite - 2 (Para sair do Menu)\n");
            System.out.print("Resposta: ");
            r = in.next().charAt(0);
            System.out.println("\n");
            
            switch(r) {
                case '0':
                    int v; //vagas
                    System.out.print("Informe sua Matricula: ");
                    M = in.nextInt();
                    System.out.print("Informe sua Senha: ");
                    S = in.nextInt();
                    v = E.acessarRegistro(M,S);
                    if(v == 0){
                        System.out.println("Aluno não registrado");
                    }else if(v == 1){
                        int v0;
                        v0 = E.verificarVaga(v);
                        if(v0 == -1){
                            System.out.println("Não há vagas Especiais disponíveis");
                        }else{
                            System.out.println("Estacione na vaga Especial Nº " + v0);
                        }
                    }else if(v == 2){
                        int v0;
                        v0 = E.verificarVaga(v);
                        if(v0 == -1){
                            System.out.println("Não há vagas para Moto disponíveis");
                        }else{
                            System.out.println("Estacione na vaga de Moto Nº " + v0);
                        }
                    }else if(v == 3){
                        int v0;
                        v0 = E.verificarVaga(v);
                        if(v0 == -1){
                            System.out.println("Não há vagas para Carro disponíveis");
                        }else{
                            System.out.println("Estacione na vaga de Carro Nº " + v0);
                        }
                    }else{
                        System.out.println("Senha incorreta");
                    }
                    break;
                
                case '1':
                    String N; //Nome
                    int I; //idade
                    boolean e; //especial ou n
                    int te;
                    String AM; //aluno marca automovel
                    String AP; //aluno placa automovel
                    boolean Ab; //variavel "?"
                    int tAb; //moto?
                
                    System.out.print("Informe seu Nome: ");
                    N = in.nextLine();
                    System.out.print("Informe sua Idade: ");
                    I = in.nextInt();
                    System.out.print("Informe sua Matricula: ");
                    M = in.nextInt();
                    System.out.print("Informe sua Senha: ");
                    S = in.nextInt();
                    System.out.print("Você é um aluno especial? (0 - Sim) / (1 - Não) ");
                    te = in.nextInt();
                    if(te == 0){ e = true; }
                    else{ e = false; }
                    System.out.print("Informe a Marca do Automovel: ");
                    AM = in.nextLine();
                    System.out.print("Informe a Placa do Automovel: ");
                    AP = in.nextLine();
                    System.out.print("Seu automovel é uma moto? (0 - Sim) / (1 - Não) ");
                    tAb = in.nextInt();
                    if(tAb == 0){ Ab = true; }
                    else{ Ab = false; }
              
                    Registro R = new Registro(N, I, M, S, e, AM, AP, Ab);
                    E.registrar(R);
                    L = true;
                    break;
                case '2':
                   break;
            }
        }while(L);  
    }
}
