package com.accenture.academico.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@ManagedBean(name = "telefone")
public class Telefone {

	@NotNull
	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@Column(length = 3)
	private String ddd;

	@ManyToOne
	private Pessoa pessoa;

	@NotNull
	@Column(length = 10)
	private String telefone;

	public String getDdd() {

		return ddd;

	}

	public void setDdd(String ddd) {

		this.ddd = ddd;

	}

	public Pessoa getPessoa() {

		return pessoa;

	}

	public void setPessoa(Pessoa pessoa) {

		this.pessoa = pessoa;

	}

	public String getTelefone() {

		return telefone;

	}

	public void setTelefone(String telefone) {

		this.telefone = telefone;

	}

}
