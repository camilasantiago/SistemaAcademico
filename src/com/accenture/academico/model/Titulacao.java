package com.accenture.academico.model;

public abstract class Titulacao {

	private int id;
	private String titulacao; //descricao da titulacao - OBRIGATORIO
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
