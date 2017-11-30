import java.util.Scanner;

public class Menu {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String opcao;
		
		do {
			System.out.print("(C)adastrar Aluno\n" + 
							 "(E)xibir Aluno\n" + 
							 "(N)ovo Grupo\n" + 
							 "(A)locar Aluno no Grupo e Imprimir Grupos\n" + 
							 "(R)egistrar Resposta de Aluno\n" + 
							 "(I)mprimir Alunos que Responderam\n" + 
							 "(O)ra, vamos fechar o programa!\n" + 
							 "\n" + 
							 "Opção> ");
			
			opcao = sc.nextLine();
			switch(opcao) {
				case "C":
					break;
				case "E":
					break;
				case "N":
					break;
				case "A":
					break;
				case "R":
					break;
				case "I":
					break;
				case "O":
					break;
			}
		
		} while(opcao.equals("O"));

	}

}
