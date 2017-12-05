/**
* Representação de um Aluno.
*
* @author José Amandio Ferreira dos Santos
*/
public class Aluno {
	private String matricula;
	private String nome;
	private String curso;
	
	
	/**
    * Constrói um Aluno.
    * Todo Aluno recebe um parametro de matricula, nome e curso.
    * 
    * @param novaMatricula Matriula do Aluno
    * @param novoNome Nome do Aluno
    * @param novoCurso Curso que o Aluno cursa
    * 
    */
	public Aluno(String novaMatricula, String novoNome, String novoCurso) {
		this.validade(novaMatricula);
		this.matricula = novaMatricula;
		
		this.validade(novoNome);
		this.nome = novoNome;
		
		this.validade(novoCurso);
		this.curso = novoCurso;
		
	}
	
	/**
    * Verifica se a palavra recebi na classe é valida ou não
    * 
    * @param palavra palavra a ser analisada
    */
	public void validade(String palavra) {
		if(palavra == null) {
			throw new NullPointerException("Caractere nulo");
		}
		if(palavra.trim().equals("")) {
			throw new IllegalArgumentException("Caractere vazio");
		}
	}
	
	
	/**
    * retorna a representação em string do nome do aluno
    * 
    * @return nome do Aluno
    * 
    */
	public String getNome() {
		return this.nome;
		
	}
	
	/**
    * retorna a representação em string da matricula do aluno
    * 
    * @return matricula do Aluno
    * 
    */
	public String getMatricula() {
		return this.matricula;
	}
	
	@Override
	public String toString() {
		return this.matricula + " - " + this.nome + " - " + this.curso;
	}
	
}
