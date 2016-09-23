package com.accenture.academico.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Titulo {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@Column(length = 50)
	private String titulacao;

	@OneToMany(mappedBy = "titulo")
	private List<Professor> professores;

	public String getTitulacao() {

		return titulacao;

	}

	public void setTitulacao(String titulacao) {

		this.titulacao = titulacao;

	}

	public List<Professor> getProfessores() {

		return professores;

	}

	public void setProfessores(List<Professor> professores) {

		this.professores = professores;

	}

	public Long getId() {

		return id;

	}

}