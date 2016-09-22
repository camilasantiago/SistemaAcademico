package com.accenture.academico.dao;

import java.util.List;

import com.accenture.academico.model.Aluno;

public interface IAlunoDAO {

	public void addAluno(Aluno aluno);

	public void removeAluno(Aluno aluno);

	public void updateAluno(Aluno aluno);

	public Aluno find(Long id);

	public List<Aluno> listAlunos();

}
