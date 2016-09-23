package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Professor;

@Repository
public class ProfessorDAOImpl implements ProfessorDAO {

	private static final Logger logger = LoggerFactory.getLogger(ProfessorDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {

		this.sessionFactory = sf;

	}

	@Override
	public void addProfessor(Professor p) {

		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Professor saved successfully. Professor " + p);

	}

	@Override
	public void updateProfessor(Professor p) {

		Session session = this.sessionFactory.getCurrentSession();
		session.merge(p);
		logger.info("Professor updated successfully. Professor " + p);
	}

	@Override
	public void removeProfessor(Professor p) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(p);
		logger.info("Professor removed successfully. Professor " + p);

	}

	@Override
	public Professor findProfessor(Long id) {

		Session session = this.sessionFactory.getCurrentSession();

		Professor p = (Professor) session.createCriteria(Professor.class).add(Restrictions.idEq(id)).uniqueResult();

		if (p == null) {

			logger.info("Professor not found.");

			return null;

		}

		logger.info("Professor found. Professor " + p);

		return p;

	}

	@Override
	public List<Professor> listProfessor() {

		Session session = this.sessionFactory.getCurrentSession();
		List<Professor> professorList = session.createQuery("from Professor").list();

		for (Professor p : professorList) {

			logger.info("Professor List::" + p);

		}

		return professorList;

	}

}
