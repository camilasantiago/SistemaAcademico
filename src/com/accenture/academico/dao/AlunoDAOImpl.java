package com.accenture.academico.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Aluno;

@Repository
public class AlunoDAOImpl implements AlunoDAO{

	private static final Logger logger = LoggerFactory.getLogger(AlunoDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addAluno(Aluno a) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(a);
		logger.info("Aluno saved successfully. Aluno " + a);
	}

	@Override
	public void updateAluno(Aluno a) {
		Session session = this.sessionFactory.getCurrentSession();
		session.merge(a);
		logger.info("Aluno updated successfully. Aluno " + a);
		
	}

	@Override
	public void removeAluno(Aluno a) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(a);
		logger.info("Aluno removed successfully. Aluno " + a);

	}

	@Override
	public Aluno findAluno(Long id) {
		Session session = this.sessionFactory.getCurrentSession();

		Aluno a = (Aluno) session.createCriteria(Aluno.class).add(Restrictions.idEq(id)).uniqueResult();

		if (a == null) {

			logger.info("Aluno not found.");

			return null;

		}

		logger.info("Aluno found. Aluno " + a);

		return a;
	}

	@Override
	public List<Aluno> listAluno() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Aluno> alunoList = session.createQuery("from Aluno").list();

		for (Aluno a : alunoList) {

			logger.info("Aluno List::" + a);

		}

		return alunoList;
		
		
	}

}
