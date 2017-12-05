import java.util.*;

/**
* Representação de um controle de grupos.
*
* @author José Amandio Ferreira dos Santos
*/
public class ControleGrupos {
	private HashMap<String, Grupo> grupos;
	
	/**
    * constroi o controle de Grupos
    * todo controle tem um map que recebe grupos
    * 
    */
	public ControleGrupos() {
		this.grupos = new HashMap <>();
	}
	
	
	/**
    * Verifica se o grupo esta presente (ou não) no map
    * 
    * @param nome nome a ser analisado
    * @param val booleano que determina se voce que saber se o grupo esta(true) ou não(false) contido no map
    */
	private void contemGrupo(String nome, boolean val) {
		if(nome == null) {
			throw new NullPointerException("Caractere nulo");
		}
		if(val && grupos.containsKey(nome)) {
			throw new IllegalArgumentException("Grupo já cadastrado");
		}
		if(!val && !grupos.containsKey(nome)) {
			throw new IllegalArgumentException("Grupo não cadastrado");
		}
	}
	
	/**
    * cadastra um grupo, colocando-o no map
    * 
    * @param aluno aluno a ser cadastrado
    */
	public String cadastraGrupo(Grupo grupo) {
		this.contemGrupo(grupo.getNome(), true);
		grupos.put(grupo.getNome(), grupo);
		return "CADASTRO REALIZADO";
	}
	
	/**
    * retorna a representação em string dogrupo
    * 
    * @param nome nome a ser retornado a toString
    */
	public String consultaGrupo(String nome) {
		this.contemGrupo(nome, false);
		return grupos.get(nome).toString();
	}
	
	
	/**
    * retorna a representação em string de um lista com todos os alunos que foram cadastrados no grupo
    * 
    * @return Lista de alunos cadastrados no grupo
    */
	public String imprimeGrupo(String nome) {
		contemGrupo(nome, false);
		return grupos.get(nome).toString();
	}
	
	/**
    * Aloca um aluno no grupo a partir da matricula do aluno e do nome do grupo
    * 
    * @param nomeGrupo Nome do grupo
    * @param matricula Matricula do aluno
    * @param controle Controle de alunos que possui o aluno a ser alocado
    * 
    * @return "ALUNO ALOCADO"
    */
	public String alocaAluno(String nomeGrupo, String matricula, ControleAlunos controle) {
		controle.contemAluno(matricula, false);
		contemGrupo(nomeGrupo, false);
		
		grupos.get(nomeGrupo).alocaAluno(controle.getAluno(matricula));
		return "ALUNO ALOCADO";
	}

}
