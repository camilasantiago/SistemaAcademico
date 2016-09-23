package com.accenture.academico.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import org.springframework.stereotype.Controller;
import com.accenture.academico.model.Professor;
import com.accenture.academico.service.ProfessorService;

@ManagedBean(name = "professorController")
@Controller
public class ProfessorControllerImpl implements ProfessorController{
	private ProfessorService professorService;

	public void setProfessorService(ProfessorService professorService) {
		this.professorService = professorService;
	}

	@Override
	public void addProfessor(Professor p) {
		System.out.println("Teste add professor controller");
		professorService.addProfessor(p);
	}

	@Override
	public void updateProfessor(Professor p) {
		System.out.println("Teste update professor controller");
		professorService.updateProfessor(p);
	}

	@Override
	public void removeProfessor(Professor p) {
		System.out.println("Teste remove professor controller");
		professorService.removeProfessor(p);
	}

	@Override
	public Professor findProfessor(Long id) {
		System.out.println("Teste findProfessor controller");
		return professorService.findProfessor(id) ;
	}

	@Override
	public List<Professor> listProfessor() {
		return professorService.listProfessor();
	}
}
