package com.accenture.academico.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.stereotype.Controller;

import com.accenture.academico.model.Professor;
import com.accenture.academico.service.ProfessorService;

@ManagedBean(name = "professorController")
@Controller
public class ProfessorControllerImpl implements ProfessorController {

	private ProfessorService professorService;

	public void setProfessorService(ProfessorService professorService) {

		this.professorService = professorService;

	}

	@Override
	public void addProfessor(Professor p) {

		professorService.addProfessor(p);

	}

	@Override
	public void updateProfessor(Professor p) {

		professorService.updateProfessor(p);

	}

	@Override
	public void removeProfessor(Professor p) {

		professorService.removeProfessor(p);

	}

	@Override
	public Professor findProfessor(Long id) {

		return professorService.findProfessor(id);

	}

	@Override
	public List<Professor> listProfessor() {

		return professorService.listProfessor();

	}

}
