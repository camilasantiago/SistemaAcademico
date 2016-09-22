package com.accenture.academico.dao;

import java.util.List;

import javax.persistence.EntityManager;

public class DAO<T> {

	private final EntityManager em;
	private final Class<T> classe;

	public DAO(EntityManager em, Class<T> classe) {

		this.em = em;
		this.classe = classe;

	}

	public void save(T t) {

		this.em.persist(t);

	}

	public void delete(T t) {

		this.em.remove(t);

	}

	public void update(T t) {

		this.em.merge(t);

	}

	public T find(Long id) {

		return em.getReference(classe, id);

	}

	@SuppressWarnings("unchecked")
	public List<T> list() {

		return em.createQuery("select e from " + classe.getName() + " e").getResultList();

	}

}
