package com.accenture.academico.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_aluno")
@ManagedBean(name="aluno")
public class Aluno extends Pessoa {

	// OBRIGATORIO
	@Column(name="matricula")
	@NotNull
	private String matricula;
	
	private Professor professor; //através do tipo pessoa, pegar o id do professor.
	
	private List<Publicacao> publicacoes;




	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public List<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(List<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
