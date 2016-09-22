package com.accenture.academico.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

public abstract class Titulacao {

	@Id @NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	@NotNull
	private String titulacao; //descricao da titulacao - OBRIGATORIO
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="tb_professor")
	private List<Professor> professores;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}


}
