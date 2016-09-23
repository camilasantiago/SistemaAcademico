package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.accenture.academico.model.Telefone;

@Repository
public class TelefoneDAOImpl implements TelefoneDAO{

	private static final Logger logger = LoggerFactory.getLogger(TelefoneDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void addTelefone(Telefone t) {
		
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(t);
		logger.info("Telefone saved successfully, Telefone Details=" + t);
	}

	@Override
	public void updateTelefone(Telefone t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(t);
		logger.info("Telefone updated successfully. Telefone " + t);
	}

	@Override
	public void removeTelefone(Telefone t) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(t);
		logger.info("Telefone removed successfully. Telefone " + t);
	}

	@Override
	public List<Telefone> listTelefone() {
		
		Session session = this.sessionFactory.getCurrentSession();
		List<Telefone> TelefoneList = session.createQuery("from Telefone").list();

		for (Telefone t : TelefoneList) {

			logger.info("Telefone List::" + t);

		}

		return TelefoneList;
	}

}
