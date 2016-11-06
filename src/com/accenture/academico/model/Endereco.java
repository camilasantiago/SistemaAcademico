package com.accenture.academico.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

import com.accenture.academico.model.type.CidadesPernambuco;

@Embeddable
public class Endereco {

	@NotNull
	@Column(length = 200)
	private String logradouro;

	@NotNull
	@Column(length = 100)
	private String bairro;

	@NotNull
	@Column(length = 10)
	private String numero;

	@NotNull
	@Enumerated(EnumType.STRING)
	private CidadesPernambuco cidades;

	@NotNull
	@Column(length = 2)
	private String uf;

	public Endereco() {

	}

	public String getLogradouro() {

		return logradouro;

	}

	public void setLogradouro(String logradouro) {

		this.logradouro = logradouro;

	}

	public String getBairro() {

		return bairro;

	}

	public void setBairro(String bairro) {

		this.bairro = bairro;

	}

	public String getNumero() {

		return numero;

	}

	public void setNumero(String numero) {

		this.numero = numero;

	}

	public CidadesPernambuco getCidades() {

		return cidades;

	}

	public void setCidades(CidadesPernambuco cidades) {

		this.cidades = cidades;

	}

	public String getUf() {

		return uf;

	}

	public void setUf(String uf) {

		this.uf = uf;

	}

}
