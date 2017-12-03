
public class Aluno {
	private String matricula;
	private String nome;
	private String curso;

	public Aluno(String novaMatricula, String novoNome, String novoCurso) {
		this.validade(novaMatricula);
		this.matricula = novaMatricula;
		
		this.validade(novoNome);
		this.nome = novoNome;
		
		this.validade(novoCurso);
		this.curso = novoCurso;
		
	}
	
	public void validade(String palavra) {
		if(palavra == null) {
			throw new NullPointerException("Caractere nulo");
		}
		if(palavra.trim().equals("")) {
			throw new IllegalArgumentException("Caractere vazio");
		}
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
