
public class Aluno {
	private String matricula;
	private String nome;
	private String curso;

	public Aluno(String novaMatricula, String novoNome, String novoCurso) {
		this.matricula = novaMatricula;
		this.nome = novoNome;
		this.curso = novoCurso;
		
	}
	
	public String getNome() {
		return this.nome;
		
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	@Override
	public String toString() {
		return this.matricula + " - " + this.nome + " - " + this.curso;
	}
	
}
