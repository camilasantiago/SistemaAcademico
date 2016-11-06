package com.accenture.academico.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class Telefone {

	@NotNull
	@Column(length = 3)
	private String ddd;

	@NotNull
	@Column(length = 10)
	private String telefone;

	public String getDdd() {

		return ddd;

	}

	public void setDdd(String ddd) {

		this.ddd = ddd;

	}

	public String getTelefone() {

		return telefone;

	}

	public void setTelefone(String telefone) {

		this.telefone = telefone;

	}

}
