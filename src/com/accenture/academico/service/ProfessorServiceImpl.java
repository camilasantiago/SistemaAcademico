package com.accenture.academico.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.dao.ProfessorDAO;
import com.accenture.academico.model.Professor;


@ManagedBean(name = "professorService")
@SessionScoped
@Service
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

	public ProfessorDAO getProfessorDAO() {
		return professorDAO;
	}

	public void setProfessorDAO(ProfessorDAO professorDAO) {
		this.professorDAO = professorDAO;
	}
	
	
}
