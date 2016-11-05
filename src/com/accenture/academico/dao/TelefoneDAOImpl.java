package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Telefone;

@Repository
public class TelefoneDAOImpl implements TelefoneDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addTelefone(Telefone t) {

		Session session = this.sessionFactory.getCurrentSession();
		session.persist(t);

	}

	@Override
	public void updateTelefone(Telefone t) {

		Session session = this.sessionFactory.getCurrentSession();
		session.merge(t);

	}

	@Override
	public void removeTelefone(Telefone t) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(t);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Telefone> listTelefone() {

		Session session = this.sessionFactory.getCurrentSession();
		List<Telefone> TelefoneList = session.createQuery("from Telefone").list();

		return TelefoneList;

	}

}
