package com.accenture.academico.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.dao.ProfessorDAO;
import com.accenture.academico.model.Professor;

public class ProfessorServiceImpl implements ProfessorService{
	
	private ProfessorDAO professorDAO;

	@Override
	@Transactional
	public void addProfessor(Professor p) {
		// TODO Auto-generated method stub
		professorDAO.addProfessor(p);
	}

	@Override
	@Transactional
	public void updateProfessor(Professor p) {
		// TODO Auto-generated method stub
		professorDAO.updateProfessor(p);
	}

	@Override
	@Transactional
	public void removeProfessor(Professor p) {
		// TODO Auto-generated method stub
		professorDAO.removeProfessor(p);
	}

	@Override
	@Transactional
	public Professor findProfessor(Long id) {
		// TODO Auto-generated method stub
		return professorDAO.findProfessor(id);
	}

	@Override
	@Transactional
	public List<Professor> listProfessor() {
		// TODO Auto-generated method stub
		return professorDAO.listProfessor();
	}
	
	
}
