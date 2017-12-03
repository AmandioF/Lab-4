import java.util.*;

public class ControleGrupos {
	private HashMap<String, Grupo> grupos;
	
	public ControleGrupos() {
		this.grupos = new HashMap <>();
	}
	
	private void contemGrupo(String matricula, boolean val) {
		if(matricula == null) {
			throw new NullPointerException("Caractere nulo");
		}
		if(val && grupos.containsKey(matricula)) {
			throw new IllegalArgumentException("Grupo já cadastrado");
		}
		if(!val && !grupos.containsKey(matricula)) {
			throw new IllegalArgumentException("Grupo não cadastrado");
		}
	}
	public String cadastraGrupo(Grupo grupo) {
		this.contemGrupo(grupo.getNome(), true);
		grupos.put(grupo.getNome(), grupo);
		return "CADASTRO REALIZADO";
	}
	
	public String consultaGrupo(String nome) {
		this.contemGrupo(nome, false);
		return grupos.get(nome).toString();
	}
	
	public String imprimeGrupo(String nome) {
		contemGrupo(nome, false);
		return grupos.get(nome).toString();
	}
	
	public String alocaAluno(String nomeGrupo, String matricula, ControleAlunos controle) {
		controle.contemAluno(matricula, false);
		contemGrupo(nomeGrupo, false);
		
		grupos.get(nomeGrupo).alocaAluno(controle.getAluno(matricula));
		return "ALUNO ALOCADO";
	}

}
