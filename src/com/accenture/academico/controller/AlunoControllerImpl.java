package com.accenture.academico.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.stereotype.Controller;

import com.accenture.academico.dao.AlunoDAO;
import com.accenture.academico.model.Aluno;

@ManagedBean(name = "alunoController")
@Controller
public class AlunoControllerImpl implements AlunoController {

	private AlunoDAO alunoDAO;

	public void setAlunoDAO(AlunoDAO alunoDAO) {

		this.alunoDAO = alunoDAO;

	}

	@Override
	public void addAluno(Aluno a) {

		alunoDAO.addAluno(a);

	}

	@Override
	public void updateAluno(Aluno a) {

		alunoDAO.updateAluno(a);

	}

	@Override
	public void removeAluno(Aluno a) {

		alunoDAO.removeAluno(a);

	}

	@Override
	public Aluno findAluno(Long id) {

		return alunoDAO.findAluno(id);

	}

	@Override
	public List<Aluno> listAluno() {

		return alunoDAO.listAluno();

	}

}
