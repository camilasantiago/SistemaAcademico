package com.accenture.academico.service;

import java.util.List;

import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.academico.dao.AlunoDAO;
import com.accenture.academico.model.Aluno;

@SessionScoped
@Service
public class AlunoServiceImpl implements AlunoService {

	@Autowired
	private AlunoDAO alunoDAO;

	public AlunoDAO getAlunoDAO() {

		return alunoDAO;

	}

	public void setAlunoDAO(AlunoDAO alunoDAO) {

		this.alunoDAO = alunoDAO;

	}

	@Override
	@Transactional
	public void addAluno(Aluno a) {

		alunoDAO.addAluno(a);

	}

	@Override
	@Transactional
	public void updateAluno(Aluno a) {

		alunoDAO.updateAluno(a);

	}

	@Override
	@Transactional
	public void removeAluno(Aluno a) {

		alunoDAO.removeAluno(a);

	}

	@Override
	@Transactional
	public Aluno findAluno(Long id) {

		return alunoDAO.findAluno(id);

	}

	@Override
	@Transactional
	public List<Aluno> listAluno() {

		return alunoDAO.listAluno();

	}

}
