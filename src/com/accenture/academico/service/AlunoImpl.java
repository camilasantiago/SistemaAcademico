package com.accenture.academico.service;

import java.util.List;

import com.accenture.academico.dao.AlunoDAO;
import com.accenture.academico.model.Aluno;

public class AlunoImpl implements AlunoService{
	
	private AlunoDAO alunoDao;

	@Override
	public void addAluno(Aluno a) {
		// TODO Auto-generated method stub
		alunoDao.addAluno(a);
		
	}

	@Override
	public void updateAluno(Aluno a) {
		// TODO Auto-generated method stub
		alunoDao.updateAluno(a);
	}

	@Override
	public void removeAluno(Aluno a) {
		// TODO Auto-generated method stub
		alunoDao.removeAluno(a);
	}

	@Override
	public Aluno findAluno(Long id) {
		// TODO Auto-generated method stub
		return alunoDao.findAluno(id);
	}

	@Override
	public List<Aluno> listAluno() {
		// TODO Auto-generated method stub
		return alunoDao.listAluno();
	}

}
