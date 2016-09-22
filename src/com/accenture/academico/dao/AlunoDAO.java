package com.accenture.academico.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.jpa.internal.EntityManagerFactoryImpl;
import org.hibernate.jpa.internal.EntityManagerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.accenture.academico.model.Aluno;

@Repository
public class AlunoDAO implements IAlunoDAO {

	private static final Logger logger = LoggerFactory.getLogger(IAlunoDAO.class);

	private final DAO<Aluno> daoAluno;
	private Session session;
	private EntityManager em;

	public AlunoDAO(EntityManager em) {

		this.daoAluno = new DAO<Aluno>(em, Aluno.class);
		this.em = em;

	}

	private Session getSession() {

		if (em.getDelegate() instanceof EntityManagerFactoryImpl) {

			EntityManagerImpl emi = (EntityManagerImpl) em.getDelegate();
			session = emi.getSession();

		} else {

			session = (Session) em.getDelegate();

		}

		return session;

	}

	@Override
	public void addAluno(Aluno aluno) {

		daoAluno.save(aluno);
		logger.info("Aluno salvo => " + aluno);

	}

	@Override
	public void removeAluno(Aluno aluno) {

		daoAluno.delete(aluno);
		logger.info("Aluno removido => " + aluno);

	}

	@Override
	public void updateAluno(Aluno aluno) {

		daoAluno.update(aluno);
		logger.info("Aluno atualizado => " + aluno);

	}

	@Override
	public Aluno find(Long id) {

		return daoAluno.find(id);

	}

	@Override
	public List<Aluno> listAlunos() {

		return daoAluno.list();

	}

}
