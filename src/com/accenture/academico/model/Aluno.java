package com.accenture.academico.model;

public class Aluno extends Pessoa {

	// OBRIGATORIO
	private String matricula;
	// OBRIGATORIO
	private int idProfessor; //através do tipo pessoa, pegar o id do professor.



	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
