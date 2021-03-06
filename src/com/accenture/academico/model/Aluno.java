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

import com.accenture.academico.model.type.TipoPessoa;

@Entity
@PrimaryKeyJoinColumn(name = "idPessoa")
@Table
@ManagedBean(name = "aluno")
public class Aluno extends Pessoa {

	private static final long serialVersionUID = -2592871195731078140L;

	@Column(name = "matricula")
	@NotNull
	@GeneratedValue
	private Integer matricula;

	@ManyToOne
	private Professor professor;

	@OneToMany(mappedBy = "aluno")
	private List<Publicacao> publicacoes;

	public Aluno() {

		this.setTipoPessoa(TipoPessoa.ALUNO);

	}

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

}
