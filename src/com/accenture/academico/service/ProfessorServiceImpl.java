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
public class ProfessorServiceImpl implements ProfessorService {

	private ProfessorDAO professorDAO;

	@Override
	@Transactional
	public void addProfessor(Professor p) {

		professorDAO.addProfessor(p);

	}

	@Override
	@Transactional
	public void updateProfessor(Professor p) {

		professorDAO.updateProfessor(p);

	}

	@Override
	@Transactional
	public void removeProfessor(Professor p) {

		professorDAO.removeProfessor(p);

	}

	@Override
	@Transactional
	public Professor findProfessor(Long id) {

		return professorDAO.findProfessor(id);

	}

	@Override
	@Transactional
	public List<Professor> listProfessor() {

		return professorDAO.listProfessor();

	}

}
