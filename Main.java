import java.util.Scanner;

public class Main {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Estacionamento vEspecial = new Estacionamento();
		char resposta;
		int matricula;
		int senha;
		boolean L = false;

		do {
			System.out.println("< E S T A C I O N A M E N T O >\n" + "Digite - 0 (Para acessar vagas disponiveis)\n"
					+ "Digite - 1 (Para registrar-se)\n" + "Digite - 2 (Para sair do Menu)\n");
			System.out.print("Resposta: ");
			resposta = in.next().charAt(0);
			System.out.println("\n");

			switch (resposta) {
			case '0':
				int v;
				System.out.print("Informe sua Matricula: ");
				matricula = in.nextInt();
				System.out.print("Informe sua Senha: ");
				senha = in.nextInt();
				v = vEspecial.acessarRegistro(matricula, senha);
				if (v == 0) {
					System.out.println("Aluno não registrado");
				} else if (v == 1) {
					int v0;
					v0 = vEspecial.verificarVaga(TipoVeiculo.valueOf(v));
					if (v0 == -1) {
						System.out.println("Não há vagas Especiais disponíveis");
					} else {
						System.out.println("Estacione na vaga Especial Nº " + v0);
					}
				} else if (v == 2) {
					int v0;
					v0 = vEspecial.verificarVaga(TipoVeiculo.valueOf(v));
					if (v0 == -1) {
						System.out.println("Não há vagas para Moto disponíveis");
					} else {
						System.out.println("Estacione na vaga de Moto Nº " + v0);
					}
				} else if (v == 3) {
					int v0;
					v0 = vEspecial.verificarVaga(TipoVeiculo.valueOf(v));
					if (v0 == -1) {
						System.out.println("Não há vagas para Carro disponíveis");
					} else {
						System.out.println("Estacione na vaga de Carro Nº " + v0);
					}
				} else {
					System.out.println("Senha incorreta");
				}
				break;

			case '1':
				String nome;
				int idade;
				boolean especial;
				int ehEspecial;
				String marcaAutomovel;
				String placaAutomovel;
				boolean ehMoto;
				int moto;

				System.out.print("Informe seu Nome: ");
				nome = in.nextLine();

				System.out.print("Informe sua Idade: ");
				idade = in.nextInt();

				System.out.print("Informe sua Matricula: ");
				matricula = in.nextInt();

				System.out.print("Informe sua Senha: ");
				senha = in.nextInt();

				System.out.print("Você é um aluno especial? (0 - Sim) / (1 - Não) ");
				ehEspecial = in.nextInt();

				if (ehEspecial == 0) {
					especial = true;
				} else {
					especial = false;
				}

				System.out.print("Informe a Marca do Automovel: ");
				marcaAutomovel = in.nextLine();

				System.out.print("Informe a Placa do Automovel: ");
				placaAutomovel = in.nextLine();

				System.out.print("Seu automovel é uma moto? (0 - Sim) / (1 - Não) ");
				moto = in.nextInt();

				if (moto == 0) {
					ehMoto = true;
				} else {
					ehMoto = false;
				}

				Registro R = new Registro(nome, idade, matricula, senha, especial, marcaAutomovel, placaAutomovel,ehMoto);
				vEspecial.registrar(R);
				L = true;
				break;

			case '2':
				break;
			}
		} while (L);
	}
}
