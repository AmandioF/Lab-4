import java.util.*;

/**
* Representação de um controle de aluno.
*
* @author José Amandio Ferreira dos Santos
*/
public class ControleAlunos {
	private ArrayList<Aluno> quadro;
	private HashMap<String, Aluno> alunos;
	
	
	/**
    * constroi o controle de Alunos
    * todo controle tem uma array list e um map que recebe alunos
    * 
    */
	public ControleAlunos() {
		this.alunos = new HashMap <>();
		this.quadro = new ArrayList<>();
	}
	
	/**
    * Verifica se o aluno esta presente (ou não) no map
    * 
    * @param matricula matricula a ser analisada
    * @param val booleano que determina se voce que saber se o aluno esta(true) ou não(false) contido no map
    */
	public void contemAluno(String matricula, boolean val) {
		if(matricula == null) {
			throw new NullPointerException("Caractere nulo");
		}
		if(!val && !alunos.containsKey(matricula)) {
			throw new IllegalArgumentException("Aluno não cadastrado");
		}
		if(val && alunos.containsKey(matricula)) {
			throw new IllegalArgumentException("Aluno já cadastrado");
		}
		
	}
	
	/**
    * cadastra um aluno, colocando-o no map
    * 
    * @param aluno aluno a ser cadastrado
    */
	public String cadastraAluno(Aluno aluno) {
		this.contemAluno(aluno.getMatricula(), true);
		alunos.put(aluno.getMatricula(), aluno);
		return "CADASTRO REALIZADO";
	}
	
	/**
    * retorna um Aluno
    * 
    * @param matricula matricula do aluno a ser retornado
    * @return aluno
    */
	public Aluno getAluno (String matricula) {
		this.contemAluno(matricula, false);
		return alunos.get(matricula);
	}
	
	/**
    * retorna a representação em string do Aluno
    * 
    * @param matricula matricula a ser analisada
    */
	public String consultaAluno(String matricula) {
		this.contemAluno(matricula, false);
		return alunos.get(matricula).toString();
	}
	

	/**
    * cadastra um aluno que vai responder no quadro, colocando-o no arrayList
    * 
    * @param aluno aluno a ser cadastrado
    * @return "ALUNO REGISTRADO"
    */
	public String registraResposta(String matricula) {
		contemAluno(matricula, false);
		this.quadro.add(alunos.get(matricula));
		return "ALUNO REGISTRADO";
	}
	
	/**
    * retorna a representação em string de um lista com todos os alunos que foram cadastrados para responder no quadro
    * 
    * @return Lista de alunos cadastrados para responder no quadro
    */
	public String imprimeRespondoes() {
		String respondoes = "";
		for(int pos = 0; pos < quadro.size(); pos++) {
			respondoes += (pos+1) + ". " + quadro.get(pos).toString() + "\n";
		}
		
		return "Alunos: \n" + respondoes;
	}

}
