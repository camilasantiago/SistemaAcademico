package com.accenture.academico.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.stereotype.Controller;

import com.accenture.academico.model.Aluno;
import com.accenture.academico.service.AlunoService;

@ManagedBean(name = "alunoController")
@Controller
public class AlunoControllerImpl implements AlunoController {

	private AlunoService alunoService;

	public void setAlunoService(AlunoService alunoDAO) {

		this.alunoService = alunoDAO;

	}

	@Override
	public void addAluno(Aluno a) {

		alunoService.addAluno(a);

	}

	@Override
	public void updateAluno(Aluno a) {

		alunoService.updateAluno(a);

	}

	@Override
	public void removeAluno(Aluno a) {

		alunoService.removeAluno(a);

	}

	@Override
	public Aluno findAluno(Long id) {

		return alunoService.findAluno(id);

	}

	@Override
	public List<Aluno> listAluno() {

		System.out.println("Lista Aluno")
		;
		
		
		
		return alunoService.listAluno();

	}

}
