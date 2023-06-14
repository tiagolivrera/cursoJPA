package br.com.tiagolivera.cursoJPA.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tiagolivera.cursoJPA.domain.Produto;

public class ProdutoDAO implements IProdutoDAO {

	@Override
	public Produto cadastrar(Produto produto) {
		final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.tiagolivrera");
		final EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(produto);
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

		return produto;
	}

}
