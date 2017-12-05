import java.util.*;

/**
* Representação de um Grupo.
*
* @author José Amandio Ferreira dos Santos
*/
public class Grupo {
	private HashSet<Aluno> participantes;
	private String nome;
	
	/**
    * Constrói um Grupo.
    * Todo Aluno recebe um parametro de nome e cria um set de alunos
    * 
    * @param novoNome Nome do Grupo
    * 
    */
	public Grupo(String novoNome) {
		this.validade(novoNome);
		this.nome = novoNome;
		
		this.participantes = new HashSet<>();
	}
	
	/**
    * Verifica se a palavra recebi na classe é valida ou não
    * 
    * @param palavra palavra a ser analisada
    */
	public void validade(String palavra) {
		if(palavra == null) {
			throw new NullPointerException("CARACTER NULO");
		}
		if(palavra.trim().equals("")) {
			throw new IllegalArgumentException("CARACTERE VAZIO");
		}
	}
	
	
	/**
    * adiciona um aluno ao grupo
    * 
    * @param aluno aluno a ser adicionado
    */
	public void alocaAluno(Aluno aluno) {
		this.participantes.add(aluno);
	}
	
	/**
    * retorna a representação em string do nome do Grupo
    * 
    * @return nome do Grupo
    * 
    */
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
