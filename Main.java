package SistemaEstacionamento;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner (System.in);
    public static void main (String[]args) {
        Estacionamento E = new Estacionamento();
        char r;
        int M;
        int S;
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
                System.out.print("Informe sua Matricula: ");
                M = in.nextInt();
                System.out.print("Informe sua Senha: ");
                S = in.nextInt();
                E.acessarRegistro(M,S);
                break;
                
            case '1':
                String N;
                int I;
                boolean e;
                int te;
                String AM;
                String AP;
                boolean Ab;
                int tAb;
                
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
                break;
            case '2':
               break;
        }
        
    }
}
