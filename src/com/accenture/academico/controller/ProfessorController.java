package com.accenture.academico.controller;

import java.util.List;
import com.accenture.academico.model.Professor;

public interface ProfessorController {

	public void addProfessor(Professor p);

	public void updateProfessor(Professor p);

	public void removeProfessor(Professor p);

	public Professor findProfessor(Long id);

	public List<Professor> listProfessor();

}
