package br.com.db1.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class CidadeTeste {

	@Test
	public void inserirTest() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
		EntityManager manager = factory.createEntityManager();

		Uf uf = new Uf();
		uf.setNome("Maring�");

		manager.getTransaction().begin();
		manager.persist(uf);
		manager.getTransaction().commit();

		factory.close();
	}
}