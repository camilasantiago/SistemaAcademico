package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Titulo;

@Repository
public class TituloDAOImpl implements TituloDAO {

	private static final Logger logger = LoggerFactory.getLogger(TituloDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {

		this.sessionFactory = sf;

	}

	@Override
	public void addTitulo(Titulo t) {

		Session session = this.sessionFactory.getCurrentSession();
		session.persist(t);
		logger.info("Titulo saved successfully. Titulo " + t);

	}

	@Override
	public void updateTitulo(Titulo t) {

		Session session = this.sessionFactory.getCurrentSession();
		session.merge(t);
		logger.info("Titulo updated successfully. Titulo " + t);

	}

	@Override
	public void removeTitulo(Titulo t) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(t);
		logger.info("Titulo removed successfully. Titulo " + t);

	}

	@Override
	public List<Titulo> listTitulo() {

		Session session = this.sessionFactory.getCurrentSession();
		List<Titulo> tituloList = session.createQuery("from Titulo").list();

		for (Titulo p : tituloList) {

			logger.info("Titulo List::" + p);

		}

		return tituloList;

	}

}
