package br.com.db1.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.db1.dao.DAO;
import br.com.db1.model.Uf;

public class UfDao implements DAO<Uf> {
	
	@Inject
	EntityManager manager;
	
	public List<Uf> findAll() {
		return manager.createQuery("from uf").getResultList();
	}

	public Uf findById(Long id) {
		
		return null;
	}

	public List<Uf> findByName(String name) {
		
		return null;
	}

	public boolean save(Uf t) {
	
		return false;
	}

	public boolean delete(Long id) {
		
		return false;
	}

}
