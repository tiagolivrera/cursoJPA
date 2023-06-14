package br.com.tiagolivrera.cursoJPA;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;

import org.junit.Test;

import br.com.tiagolivera.cursoJPA.dao.CursoDAO;
import br.com.tiagolivera.cursoJPA.dao.ICursoDAO;
import br.com.tiagolivera.cursoJPA.domain.Curso;
import br.com.tiagolivera.cursoJPA.utils.H2;

public class CursoTest {

	private ICursoDAO cursoDAO;

	public CursoTest() {
		cursoDAO = new CursoDAO();
	}

	@Test
	public void cadastrar() throws SQLException {
		H2.startDatabase();
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("Curso Teste");
		curso.setNome("Curso de Java Backend");
		curso = cursoDAO.cadastrar(curso);

		assertNotNull(curso);
		assertNotNull(curso.getId());
	}

}
