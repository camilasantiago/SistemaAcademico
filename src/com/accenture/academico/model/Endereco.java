package com.accenture.academico.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.accenture.academico.model.type.CidadesPernambuco;

@Entity
@ManagedBean(name="endereco")
public class Endereco {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@Column(length = 200)
	private String logradouro;

	@NotNull
	@Column(length = 100)
	private String bairro;
	
	@NotNull
	private Integer numero;

	@NotNull
	@Enumerated(EnumType.STRING)
	private CidadesPernambuco cidades;

	@NotNull
	private String uf;

	@OneToMany(mappedBy = "endereco")
	private List<Pessoa> pessoas;

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

	public Integer getNumero() {

		return numero;

	}

	public void setNumero(Integer numero) {

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

	public List<Pessoa> getPessoas() {

		return pessoas;

	}

	public void setPessoas(List<Pessoa> pessoas) {

		this.pessoas = pessoas;

	}

	public Long getId() {

		return id;

	}

}
