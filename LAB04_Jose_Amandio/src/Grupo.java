import java.util.*;

public class Grupo {
	private HashSet<Aluno> participantes;
	private String nome;
	
	public Grupo(String novoNome) {
		this.nome = novoNome;
		this.participantes = new HashSet<>();
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
