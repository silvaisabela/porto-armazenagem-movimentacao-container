import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		int opcao = 1;
		Porto porto = new Porto();
		
		Scanner scanner = new Scanner(System.in);

		while (opcao != 0) {

			if (opcao < 0 || opcao > 5) {
				System.out.println("Opcao invalida!");
				System.out.println();
				opcao = 1;
				continue;
			}

			System.out.println("0 - Encerrar programa");
			System.out.println("1 - Insere conteiner no pátio"); 	
			System.out.println("2 - Retira conteiner do pátio");
			System.out.println("3 - Cálculo do custo da movimentação dos conteiners");
			System.out.println("4 - Apresenta os conteiners em cada pilha do pátio");
			System.out.println("5 - Apresenta planilhas de conteineres de cada pilha do pátio");
			System.out.print("      Opção: ");
			opcao = scanner.nextInt();
			
			switch (opcao) {

			case 1:
				inserirContainer(porto, scanner);
				break;

			case 2:
				System.out.println("opcao 2");
				break;

			case 3:
				System.out.println("opcao 3");
				break;

			case 4:
				System.out.println("opcao 4");
				break;
				
			case 5:
				System.out.println("opcao 5");
				break;
			}

		}
		
		scanner.close();
	}

	private static void inserirContainer(Porto porto, Scanner scanner) throws Exception {
		System.out.print("Informe código de identificação do conteiner: ");
		int id = scanner.nextInt();
		
		Container container = new Container(id);
		porto.inserirContainer(container);
		System.out.println();
		System.out.println();
	}
	
}
