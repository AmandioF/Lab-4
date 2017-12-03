import static org.junit.Assert.*;

import org.junit.Test;

public class ControleAlunosTest {
	
	private ControleAlunos testeControle = new ControleAlunos();
	
	// Sessão de testes com valores nulo
	
	@Test (expected=NullPointerException.class)
	public void testCadastraAlunoCursoNulo() {
		Aluno chris = new Aluno("123456", "chris", null);
		testeControle.cadastraAluno(chris);
	}
	
	@Test (expected=NullPointerException.class)
	public void testCadastraAlunoNomeNulo() {
		Aluno chris = new Aluno("123456", null, "Historia");
		testeControle.cadastraAluno(chris);
	}
	
	@Test (expected=NullPointerException.class)
	public void testCadastraAlunoMatriculaNula() {
		Aluno chris = new Aluno(null, "chris", "Historia");
		testeControle.cadastraAluno(chris);
	}
	
	@Test (expected=NullPointerException.class)
	public void testConsultaAlunoMatriculaNula() {
		testeControle.consultaAluno(null);
	}
	
	@Test (expected=NullPointerException.class)
	public void testGetAlunoMatriculaNula() {
		testeControle.getAluno(null);
	}
	
	@Test (expected=NullPointerException.class)
	public void testResgistraRespMatriculaNula() {
		testeControle.registraResposta(null);
	}
	
	
	
	//sessão de testes com valores vazios
	
	@Test (expected=IllegalArgumentException.class)
	public void testCadastraAlunoCursoVazio() {
		Aluno chris = new Aluno("123456", "chris", "    ");
		testeControle.cadastraAluno(chris);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testCadastraAlunoNomeVazio() {
		Aluno chris = new Aluno("123456", "    ", "Historia");
		testeControle.cadastraAluno(chris);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testCadastraAlunoMatriculaVazia() {
		Aluno chris = new Aluno("    ", "chris", "Historia");
		testeControle.cadastraAluno(chris);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testConsultaAlunoMatriculaVazia() {
		testeControle.consultaAluno("      ");
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testGetAlunoMatriculaVazia() {
		testeControle.getAluno("      ");
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testRegistraRespMatriculaVazia() {
		testeControle.registraResposta("      ");
	}
	
	// Sessão de testes com valores validos
	
	@Test
	public void testCadastraAlunoAceito() {
		Aluno chris = new Aluno("123456", "Crhis", "Historia");
		assertEquals("Cadastro aceito", "CADASTRO REALIZADO", testeControle.cadastraAluno(chris));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCadastraAlunoRejeitado() {
		Aluno chris = new Aluno("123456", "Crhis", "Historia");
		testeControle.cadastraAluno(chris);
		testeControle.cadastraAluno(chris);
	}
	@Test
	public void testRegistraRespAceito() {
		Aluno chris = new Aluno("123456", "Crhis", "Historia");
		testeControle.cadastraAluno(chris);
		assertEquals("Cadastro aceito", "ALUNO REGISTRADO", testeControle.registraResposta("123456"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testRegistraRespRejeitado() {
		testeControle.registraResposta("250");
	}
}
