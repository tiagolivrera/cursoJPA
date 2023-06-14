package br.com.tiagolivera.cursoJPA;

import java.sql.SQLException;
import java.time.Instant;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tiagolivera.cursoJPA.domain.Curso;
import br.com.tiagolivera.cursoJPA.domain.Matricula;
import br.com.tiagolivera.cursoJPA.utils.H2;

public class Application {

	public static void main(String[] args) throws SQLException {
		H2.startDatabase();

		/*
		 * final EntityManagerFactory entityManagerFactory =
		 * Persistence.createEntityManagerFactory("br.com.tiagolivrera"); final
		 * EntityManager entityManager = entityManagerFactory.createEntityManager();
		 * 
		 * Customer customer = new Customer(); customer.setFirstName("Dennys");
		 * customer.setLastName("Fredericci");
		 * 
		 * entityManager.getTransaction().begin(); entityManager.persist(customer);
		 * entityManager.getTransaction().commit();
		 */

		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("CURSO TESTE");
		curso.setNome("Curso de Java Backend");

		Matricula m = new Matricula();
		m.setCodigo("A1");
		m.setDataMatricula(Instant.now());
		m.setStatus("ATIVA");
		m.setValor(12.2);

		final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.tiagolivrera");
		final EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(curso);
		entityManager.persist(m);
		entityManager.getTransaction().commit();

		/*
		 * ICursoDAO cursoDAO = new CursoDAO(); IMatriculaDAO matriculaDAO = new
		 * MatriculaDAO();
		 * 
		 * cursoDAO.cadastrar(curso); matriculaDAO.cadastrar(m);
		 */

		System.out.println("Open your browser and navigate to http://localhost:8082/");
		System.out.println("JDBC URL: jdbc:h2:mem:my_database");
		System.out.println("User Name: sa");
		System.out.println("Password: ");

	}
}
