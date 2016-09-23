package com.accenture.academico.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.dao.AlunoDAO;
import com.accenture.academico.model.Aluno;

@ManagedBean(name = "alunoService")
@SessionScoped
@Service
public class AlunoServiceImpl implements AlunoService{
	
	private AlunoDAO alunoDAO;

	@Override
	@Transactional
	public void addAluno(Aluno a) {
		// TODO Auto-generated method stub
		alunoDAO.addAluno(a);
		
	}

	@Override
	@Transactional
	public void updateAluno(Aluno a) {
		// TODO Auto-generated method stub
		alunoDAO.updateAluno(a);
	}

	@Override
	@Transactional
	public void removeAluno(Aluno a) {
		// TODO Auto-generated method stub
		alunoDAO.removeAluno(a);
	}

	@Override
	@Transactional
	public Aluno findAluno(Long id) {
		// TODO Auto-generated method stub
		return alunoDAO.findAluno(id);
	}

	@Override
	@Transactional
	public List<Aluno> listAluno() {
		// TODO Auto-generated method stub
		return alunoDAO.listAluno();
	}

}
