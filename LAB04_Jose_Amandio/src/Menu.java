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
					cadastraAluno();
					break;
				case "E":
					exibirAluno();
					break;
				case "N":
					cadastraGrupo();
					break;
				case "A":
					alocaAlunoEimprime();
					break;
				case "R":
					registraResp();
					break;
				case "I":
					imprimeRespondoes();
					break;
				case "O":
					break;
			}
		
		} while(opcao.equals("O"));

	}
	
	
	public static void cadastraAluno() {
		
	}
	
	public static void exibirAluno() {
		
	}
	
	public static void cadastraGrupo() {
		
	}
	public static void alocaAlunoEimprime() {
		
	}
	
	public static void registraResp(){
		
	}
	
	public static void imprimeRespondoes() {
		
	}
	

}
