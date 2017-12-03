import java.util.*;

public class Grupo {
	private HashSet<Aluno> participantes;
	private String nome;
	
	public Grupo(String novoNome) {
		this.validade(novoNome);
		this.nome = novoNome;
		
		this.participantes = new HashSet<>();
	}
	
	public void validade(String palavra) {
		if(palavra == null) {
			throw new NullPointerException("CARACTER NULO");
		}
		if(palavra.trim().equals("")) {
			throw new IllegalArgumentException("CARACTERE VAZIO");
		}
	}
	public void alocaAluno(Aluno aluno) {
		this.participantes.add(aluno);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		String presentes = "";
		for( Aluno aluno: this.participantes) {
			presentes += "* " + aluno.toString() + "\n";
		}
		return "Alunos do Grupo " + this.nome + "\n" + presentes;
				
	}
	
}
