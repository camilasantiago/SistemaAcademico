package com.accenture.academico.controller;

import java.util.List;

import com.accenture.academico.model.Aluno;

public interface AlunoController {

	public void addAluno(Aluno a);

	public void updateAluno(Aluno a);

	public void removeAluno(Aluno a);

	public Aluno findAluno(Long id);

	public List<Aluno> listAluno();

}
