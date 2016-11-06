package com.accenture.academico.model.type;

public enum TipoSexo {
	
	MASCULINO("Masculino"),
	FEMININO("Feminino"),
	OUTROS("Outros");

	private String nomeApresentacao;

	private TipoSexo(String nomeApresentacao) {

		this.nomeApresentacao = nomeApresentacao;

	}

	public String getNomeApresentacao() {

		return nomeApresentacao;

	}

}
