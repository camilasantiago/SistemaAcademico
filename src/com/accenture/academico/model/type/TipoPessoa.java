package com.accenture.academico.model.type;

public enum TipoPessoa {

	ALUNO("Aluno"),
	PROFESSOR("Professor");

	private String nomeApresentacao;

	private TipoPessoa(String nomeApresentacao) {

		this.nomeApresentacao = nomeApresentacao;

	}

	public String getNomeApresentacao() {

		return nomeApresentacao;

	}

}
