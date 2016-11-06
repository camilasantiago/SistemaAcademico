package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Professor;

@Repository
public class ProfessorDAOImpl implements ProfessorDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {

		this.sessionFactory = sf;

	}

	@Override
	public void addProfessor(Professor p) {

		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);

	}

	@Override
	public void updateProfessor(Professor p) {

		Session session = this.sessionFactory.getCurrentSession();
		session.merge(p);

	}

	@Override
	public void removeProfessor(Professor p) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(p);

	}

	@Override
	public Professor findProfessor(Long id) {

		Session session = this.sessionFactory.getCurrentSession();

		Professor p = (Professor) session.createCriteria(Professor.class).add(Restrictions.idEq(id)).uniqueResult();

		if (p == null) {

			return null;

		}

		return p;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Professor> listProfessor() {

		Session session = this.sessionFactory.getCurrentSession();
		List<Professor> professorList = session.createQuery("from Professor").list();

		return professorList;

	}

}
