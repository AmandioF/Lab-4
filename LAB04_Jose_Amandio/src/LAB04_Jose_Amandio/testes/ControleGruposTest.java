import static org.junit.Assert.*;

import org.junit.Test;

public class ControleGruposTest {

	private ControleGrupos testeControle = new ControleGrupos();
	private ControleAlunos testeControleAlunos = new ControleAlunos();
	
	// Sessão de testes com valores nulo
	
	@Test (expected=NullPointerException.class)
	public void testCadastraGrupoNulo() {
		Grupo aa = new Grupo(null);
		testeControle.cadastraGrupo(aa);
	}
	
	@Test (expected=NullPointerException.class)
	public void testConsultaGrupoaNula() {
		testeControle.consultaGrupo(null);
	}
	
	@Test (expected=NullPointerException.class)
	public void testAlocaAlunoMatriculaNula() {
		Grupo aa = new Grupo("Algoritmos Avançados");
		testeControle.alocaAluno("Algoritmos Avançados", null, testeControleAlunos);
	}
	
	@Test (expected=NullPointerException.class)
	public void testAlocaAlunoGrupoNulo() {
		Aluno chris = new Aluno("250", "Chris", "Historia");
		testeControleAlunos.cadastraAluno(chris);
		testeControle.alocaAluno( null, "250", testeControleAlunos);
	}
	
	//sessão de testes com valores vazios
	
	@Test (expected=IllegalArgumentException.class)
	public void testCadastraGrupoVazio() {
		Grupo aa = new Grupo("    ");
		testeControle.cadastraGrupo(aa);
	}
	
	
	@Test (expected=IllegalArgumentException.class)
	public void testConsultaGrupoVazia() {
		testeControle.consultaGrupo("      ");
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testAlocaAlunoMatriculaVazia() {
		Grupo aa = new Grupo("Algoritmos Avançados");
		testeControle.alocaAluno("Algoritmos Avançados", "      ", testeControleAlunos);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testAlocaAlunoGrupoVazio() {
		Aluno chris = new Aluno("250", "Chris", "Historia");
		testeControleAlunos.cadastraAluno(chris);
		testeControle.alocaAluno( "      ", "250", testeControleAlunos);
	}
	
	
	// Sessão de testes com valores validos
	
	@Test
	public void testCadastraGrupoAceito() {
		Grupo aa = new Grupo("Algoritmos Avançados");
		assertEquals("Cadastro aceito", "CADASTRO REALIZADO", testeControle.cadastraGrupo(aa));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCadastraAlunoCadastrado() {
		Grupo aa = new Grupo("Algoritmos Avançados");
		testeControle.cadastraGrupo(aa);
		testeControle.cadastraGrupo(aa);
	}
	
	@Test
	public void testAlocaAceito() {
		Grupo aa = new Grupo("Algoritmos Avançados");
		Aluno chris = new Aluno("250", "Chris", "Historia");
		testeControleAlunos.cadastraAluno(chris);
		testeControle.cadastraGrupo(aa);
		assertEquals("Cadastro aceito", "ALUNO ALOCADO", testeControle.alocaAluno("Algoritmos Avançados", "250",testeControleAlunos));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAlocaGrupoNaoRegistrado() {
		Grupo aa = new Grupo("Algoritmos Avançados");
		Aluno chris = new Aluno("250", "Chris", "Historia");
		testeControleAlunos.cadastraAluno(chris);
		testeControle.alocaAluno("Algoritmos Avançados", "250",testeControleAlunos);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAlocaAlunoNaoRegistrado() {
		Grupo aa = new Grupo("Algoritmos Avançados");
		Aluno chris = new Aluno("250", "Chris", "Historia");
		testeControle.cadastraGrupo(aa);
		testeControle.alocaAluno("Algoritmos Avançados", "250",testeControleAlunos);
	}
	
	@Test
	public void testAlocaAlunoRegistrado() {
		Grupo aa = new Grupo("Algoritmos Avançados");
		Aluno chris = new Aluno("250", "Chris", "Historia");
		testeControleAlunos.cadastraAluno(chris);
		testeControle.cadastraGrupo(aa);
		testeControle.alocaAluno("Algoritmos Avançados", "250",testeControleAlunos);
		assertEquals("Cadastro aceito", "ALUNO ALOCADO", testeControle.alocaAluno("Algoritmos Avançados", "250",testeControleAlunos));
	}
	
}
