package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Titulo;

@Repository
public class TituloDAOImpl implements TituloDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {

		this.sessionFactory = sf;

	}

	@Override
	public void addTitulo(Titulo t) {

		Session session = this.sessionFactory.getCurrentSession();
		session.persist(t);

	}

	@Override
	public void updateTitulo(Titulo t) {

		Session session = this.sessionFactory.getCurrentSession();
		session.merge(t);

	}

	@Override
	public void removeTitulo(Titulo t) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(t);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Titulo> listTitulo() {

		Session session = this.sessionFactory.getCurrentSession();
		List<Titulo> tituloList = session.createQuery("from Titulo").list();

		return tituloList;

	}

}
