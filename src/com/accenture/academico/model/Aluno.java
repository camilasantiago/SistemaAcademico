package com.accenture.academico.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_aluno")
@ManagedBean()
public class Aluno extends Pessoa {

	@Column(name = "matricula")
	@NotNull
	private String matricula;
	
	@OneToOne 
	@JoinColumn(name="orientador")
	private Professor professor; //Um aluno é orientado por 1 professor
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="tb_publicacao")
	private List<Publicacao> publicacoes;

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
