package com.accenture.academico.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_aluno")
@ManagedBean()
public class Aluno extends Pessoa {

	// OBRIGATORIO
	@Column(name = "matricula")
	@NotNull
	private String matricula;
	// OBRIGATORIO
	private int idProfessor; // através do tipo pessoa, pegar o id do professor.

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

	@Override
	public String toString() {

		return "CPF: " + this.getCpf() + " - Matricula: " + this.getMatricula();

	}

}
