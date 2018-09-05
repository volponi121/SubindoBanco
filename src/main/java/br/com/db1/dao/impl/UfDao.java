package br.com.db1.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.management.Query;
import javax.persistence.EntityManager;

import br.com.db1.dao.DAO;
import br.com.db1.model.Uf;

public class UfDao implements DAO<Uf> {

	private EntityManager manager;

	@Inject
	public UfDao(EntityManager manager) {
		this.manager = manager;
	}

	public List<Uf> findAll() {
		return manager.createQuery("from uf").getResultList();
	}

	public Uf findById(Integer id) {
		Query query = manager.createQuery("from uf where id = :pId");
		query.setParameter("pId",id);
		return (Uf) query.getSingleResult();
	}	

	public List<Uf> findByName(String name) {
		Query query = manager.createQuery("from uf where nome like = :pNome");
		query.setParameter("pNome","%"+name+"%");
		return (Uf) query.getResultList();
	}

	public boolean save(Uf uf) {
		manager.persist(uf);
		return true;
	}

	public boolean delete(Integer id) {

		return false;
	}

}
