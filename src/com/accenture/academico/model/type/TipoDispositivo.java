package com.accenture.academico.model.type;

public enum TipoDispositivo {

	CELULAR("Celular"),
	TABLET("Tablet"),
	BROWSER("Browser"),
	NAO_IDENTIFICADO("Não Identificado");

	private String nomeApresentacao;

	private TipoDispositivo(String nomeApresentacao) {

		this.nomeApresentacao = nomeApresentacao;

	}

	public String getNomeApresentacao() {

		return nomeApresentacao;

	}

}
