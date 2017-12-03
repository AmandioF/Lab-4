import java.util.*;

public class ControleAlunos {
	private ArrayList<Aluno> quadro;
	private HashMap<String, Aluno> alunos;
	
	public ControleAlunos() {
		this.alunos = new HashMap <>();
		this.quadro = new ArrayList<>();
	}
	
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
	public String cadastraAluno(Aluno aluno) {
		this.contemAluno(aluno.getMatricula(), true);
		alunos.put(aluno.getMatricula(), aluno);
		return "CADASTRO REALIZADO";
	}
	
	public Aluno getAluno (String matricula) {
		this.contemAluno(matricula, false);
		return alunos.get(matricula);
	}
	
	public String consultaAluno(String matricula) {
		this.contemAluno(matricula, false);
		return alunos.get(matricula).toString();
	}
	
	public String registraResposta(String matricula) {
		contemAluno(matricula, false);
		this.quadro.add(alunos.get(matricula));
		return "ALUNO REGISTRADO";
	}
	
	public String imprimeRespondoes() {
		String respondoes = "";
		for(int pos = 0; pos < quadro.size(); pos++) {
			respondoes += (pos+1) + ". " + quadro.get(pos).toString() + "\n";
		}
		
		return "Alunos: \n" + respondoes;
	}

}
