package com.accenture.academico.service;

import java.util.List;

import com.accenture.academico.dao.ProfessorDAO;
import com.accenture.academico.model.Professor;

public class ProfessorServiceImpl implements ProfessorService{
	
	private ProfessorDAO professorDao;

	@Override
	public void addProfessor(Professor p) {
		// TODO Auto-generated method stub
		professorDao.addProfessor(p);
	}

	@Override
	public void updateProfessor(Professor p) {
		// TODO Auto-generated method stub
		professorDao.updateProfessor(p);
	}

	@Override
	public void removeProfessor(Professor p) {
		// TODO Auto-generated method stub
		professorDao.removeProfessor(p);
	}

	@Override
	public Professor findProfessor(Long id) {
		// TODO Auto-generated method stub
		return professorDao.findProfessor(id);
	}

	@Override
	public List<Professor> listProfessor() {
		// TODO Auto-generated method stub
		return professorDao.listProfessor();
	}
	
	
}
