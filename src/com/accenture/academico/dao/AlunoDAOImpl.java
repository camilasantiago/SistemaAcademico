package com.accenture.academico.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Aluno;

@Repository
public class AlunoDAOImpl implements AlunoDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {

		this.sessionFactory = sf;

	}

	@Override
	public void addAluno(Aluno a) {

		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);

	}

	@Override
	public void updateAluno(Aluno a) {

		Session session = this.sessionFactory.getCurrentSession();
		session.merge(a);

	}

	@Override
	public void removeAluno(Aluno a) {

		Session session = this.sessionFactory.getCurrentSession();
		session.delete(a);

	}

	@Override
	public Aluno findAluno(Long id) {

		Session session = this.sessionFactory.getCurrentSession();

		Aluno a = (Aluno) session.createCriteria(Aluno.class).add(Restrictions.idEq(id)).uniqueResult();

		if (a == null) {

			return null;

		}

		return a;

	}

	@Override
	public List<Aluno> listAluno() {

		
		
		Session session = this.sessionFactory.getCurrentSession();
		List<Aluno> alunoList = session.createQuery("from Aluno").list();
		
		return alunoList;

	}

}
