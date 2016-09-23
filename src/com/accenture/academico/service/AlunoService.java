package com.accenture.academico.service;

import java.util.List;

import com.accenture.academico.model.Aluno;

public interface AlunoService {
	public void addAluno(Aluno a);
	
	public void updateAluno(Aluno a);
	
	public void removeAluno(Aluno a);
	
	public Aluno findAluno(Long id);
	
	public List<Aluno> listAluno();
}
