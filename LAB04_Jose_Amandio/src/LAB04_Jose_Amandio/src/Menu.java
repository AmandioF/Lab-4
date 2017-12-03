import java.util.Scanner;

public class Menu {
	private static Scanner sc = new Scanner(System.in);
	private static ControleAlunos controleAluno = new ControleAlunos();
	private static ControleGrupos controleGrupo = new ControleGrupos();
	
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
		
		} while(!opcao.equals("O"));

	}
	
	
	public static void cadastraAluno() {
		try {
			System.out.print("Matricula: ");
			String matricula = sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Curso: ");
			String curso = sc.nextLine();
			
			Aluno aluno = new Aluno(matricula, nome, curso);
			System.out.println(controleAluno.cadastraAluno(aluno));
		}catch(IllegalArgumentException erro) {
			System.out.println("MATRICULA JÁ CADASTRADA");
		}
	}
	
	public static void exibirAluno() {
		try {
			System.out.print("Matricula: ");
			String matricula = sc.nextLine();
			
			System.out.println(controleAluno.consultaAluno(matricula));
		} catch(IllegalArgumentException erro) {
			System.out.println("ALUNO JÁ CADASTRADO");
		}
	}
	
	public static void cadastraGrupo() {
		System.out.print("Grupo: ");
		String nome = sc.nextLine();
		
		Grupo grupo = new Grupo(nome);
		System.out.println(controleGrupo.cadastraGrupo(grupo));
		
	}
	public static void alocaAlunoEimprime() {
		System.out.print("(A)locar Aluno ou (I)mprimir Grupo? ");
		String escolha = sc.nextLine();
		switch(escolha) {
			case "A":
				try {
					System.out.print("Matricula: ");
					String matricula = sc.nextLine();
					System.out.print("Grupo: ");
					String grupo = sc.nextLine();
					System.out.println(controleGrupo.alocaAluno(grupo, matricula, controleAluno));
					break;
				} catch(IllegalArgumentException erro) {
					System.out.println(erro.getMessage());
					break;
				}
				
			case "I":
				try {
					System.out.println("Grupo: ");
					String nome = sc.nextLine();
					
					System.out.println(controleGrupo.imprimeGrupo(nome));
					break;
				} catch(IllegalArgumentException erro) {
					System.out.println("GRUPO JÁ CADASTRADO");
				}
		}
		
	}
	
	public static void registraResp(){
		try {
			System.out.print("Matricula: ");
			String matricula = sc.nextLine();
			
			System.out.println(controleAluno.registraResposta(matricula));
		} catch(IllegalArgumentException erro) {
			System.out.println("ALUNO JÁ CADASTRADO");
		}
	}
	
	public static void imprimeRespondoes() {
		
		System.out.println(controleAluno.imprimeRespondoes());
		
	}
	

}
