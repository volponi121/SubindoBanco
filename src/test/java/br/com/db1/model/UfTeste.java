package br.com.db1.model;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import javax.persistence.Query;

import org.junit.Test;

public class UfTeste {

	@Test
	public void inserirTest() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
		EntityManager manager = factory.createEntityManager();

		Uf uf = new Uf();
		uf.setNome("RR");

		manager.getTransaction().begin();
		manager.persist(uf);
		manager.getTransaction().commit();

		factory.close();
	}
	
	@Test
	public void updateTeste(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
		EntityManager manager = factory.createEntityManager();
		
		Query q = manager.createQuery("from uf where nome = :pNome");
		q.setParameter("pNome","RR");
		q.setMaxResults(1);
		Uf uf = (Uf) q.getSingleResult();
		
		System.out.println(uf);
		
		uf.setNome("AA");
		manager.getTransaction().begin();
		manager.persist(uf);
		manager.getTransaction().commit();

		
		factory.close();
	}
}