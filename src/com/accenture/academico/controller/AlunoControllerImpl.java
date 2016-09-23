package com.accenture.academico.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.stereotype.Controller;

import com.accenture.academico.dao.AlunoDAO;
import com.accenture.academico.model.Aluno;

@ManagedBean(name = "alunoController")
@Controller
public class AlunoControllerImpl implements AlunoController{

	private AlunoDAO alunoDAO;
	
	public void setAlunoDAO(AlunoDAO alunoDAO) {
		this.alunoDAO = alunoDAO;
	}

	@Override
	public void addAluno(Aluno a) {
		System.out.println("teste add aluno");
		alunoDAO.addAluno(a);
		
	}

	@Override
	public void updateAluno(Aluno a) {
		System.out.println("teste update aluno");
		alunoDAO.updateAluno(a);
	}

	@Override
	public void removeAluno(Aluno a) {
		System.out.println("Teste remove aluno");
		alunoDAO.removeAluno(a);
	}

	@Override
	public Aluno findAluno(Long id) {
		System.out.println("Teste findAluno!");
		return alunoDAO.findAluno(id);
	}

	@Override
	public List<Aluno> listAluno() {
		return alunoDAO.listAluno();
	}

}
