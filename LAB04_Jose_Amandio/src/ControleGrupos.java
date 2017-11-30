import java.util.HashMap;

public class ControleGrupos {
	private HashMap<String, Grupo> grupos;
	
	public ControleGrupos(String novoNome) {
		this.grupos = new HashMap <>();
	}
	
	private boolean contemGrupo(String matricula) {
		return grupos.containsKey(matricula);
	}
	public boolean cadastraGrupo(Grupo grupo) {
		if(this.contemGrupo(grupo.getNome())) {
			return false;
		}else {
			grupos.put(grupo.getNome(), grupo);
			return true;
		}
	}
	
	public String consultaGrupo(String nome) {
		if(this.contemGrupo(nome)) {
			throw new IllegalArgumentException("Nome não cadastrado");
		}else {
			return grupos.get(nome).toString();
		}
	}

}
