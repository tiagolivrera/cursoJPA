package br.com.tiagolivera.cursoJPA.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tiagolivera.cursoJPA.domain.Curso;

public class CursoDAO implements ICursoDAO {

	@Override
	public Curso cadastrar(Curso curso) {
		final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.tiagolivrera");
		final EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(curso);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

		return curso;
	}

}
