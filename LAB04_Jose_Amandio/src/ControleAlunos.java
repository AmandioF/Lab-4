import java.util.*;

public class ControleAlunos {
	private ArrayList<Aluno> quadro;
	private HashMap<String, Aluno> alunos;
	
	public ControleAlunos() {
		this.alunos = new HashMap <>();
		this.quadro = new ArrayList<>();
	}
	
	private boolean contemAluno(String matricula) {
		return alunos.containsKey(matricula);
	}
	public boolean cadastraAluno(Aluno aluno) {
		if(this.contemAluno(aluno.getMatricula())) {
			return false;
		}else {
			alunos.put(aluno.getMatricula(), aluno);
			return true;
		}
	}
	
	public Aluno getAluno (String matricula) {
		if(!this.contemAluno(matricula)) {
			throw new IllegalArgumentException("Aluno não cadastrado");
		}else {
			return alunos.get(matricula);
		}
	}
	
	public String consultaAluno(String matricula) {
		if(!this.contemAluno(matricula)) {
			throw new IllegalArgumentException("Aluno não cadastrado");
		}else {
			return alunos.get(matricula).toString();
		}
	}
	
	public void registraResposta(String matricula) {
		this.quadro.add(alunos.get(matricula));
	}
	
	public String imprimeRespondoes() {
		String respondoes = "";
		for(int pos = 0; pos < quadro.size(); pos++) {
			respondoes += (pos+1) + ". " + quadro.get(pos).toString() + "\n";
		}
		
		return "Alunos: \n" + respondoes;
	}

}
