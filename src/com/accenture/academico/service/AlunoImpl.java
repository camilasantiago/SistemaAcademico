package com.accenture.academico.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.dao.AlunoDAO;
import com.accenture.academico.model.Aluno;

public class AlunoImpl implements AlunoService{
	
	private AlunoDAO alunoDao;

	@Override
	@Transactional
	public void addAluno(Aluno a) {
		// TODO Auto-generated method stub
		alunoDao.addAluno(a);
		
	}

	@Override
	@Transactional
	public void updateAluno(Aluno a) {
		// TODO Auto-generated method stub
		alunoDao.updateAluno(a);
	}

	@Override
	@Transactional
	public void removeAluno(Aluno a) {
		// TODO Auto-generated method stub
		alunoDao.removeAluno(a);
	}

	@Override
	@Transactional
	public Aluno findAluno(Long id) {
		// TODO Auto-generated method stub
		return alunoDao.findAluno(id);
	}

	@Override
	@Transactional
	public List<Aluno> listAluno() {
		// TODO Auto-generated method stub
		return alunoDao.listAluno();
	}

}
