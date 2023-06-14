package br.com.tiagolivera.cursoJPA.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tiagolivera.cursoJPA.domain.Matricula;

public class MatriculaDAO implements IMatriculaDAO {

	@Override
	public Matricula cadastrar(Matricula matricula) {
		final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.tiagolivrera");
		final EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(matricula);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

		return matricula;
	}

}
