package com.accenture.academico.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@PrimaryKeyJoinColumn(name = "idPessoa")
@Table
@ManagedBean(name = "aluno")
public class Aluno extends Pessoa {

	@Column(name = "matricula")
	@NotNull
	@GeneratedValue
	private Integer matricula;

	@ManyToOne
	@NotNull
	private Professor professor;

	@OneToMany(mappedBy = "aluno")
	private List<Publicacao> publicacoes;

	public Professor getProfessor() {

		return professor;

	}

	public void setProfessor(Professor professor) {

		this.professor = professor;

	}

	public List<Publicacao> getPublicacoes() {

		return publicacoes;

	}

	public void setPublicacoes(List<Publicacao> publicacoes) {

		this.publicacoes = publicacoes;

	}

	public Integer getMatricula() {

		return matricula;

	}

	@Override
	public String toString() {

		return " => Id: " + this.getId() + " - Nome: " + this.getNome();

	}

}
