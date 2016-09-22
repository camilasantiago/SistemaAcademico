package com.accenture.academico.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_endereco")
@ManagedBean(name="endereco")
public class Endereco {

	@Id
	@NotNull
	@Column(name = "id_endereco")
	private int id; // OBRIGATORIO E INCREMENTAL

	@NotNull
	@Column(name = "logradouro")
	private String logradouro;

	@NotNull
	@Column(name = "bairro")
	private String bairro; // OBRIGATORIO, LAN�A EXCEPTION

	@NotNull
	@Column(name = "numero")
	private int numero; // OBRIGATORIO E LAN�A EXCE��O

	@NotNull
	@Column(name = "cidade")
	@Enumerated(EnumType.STRING)
	private CidadesPernambuco cidade;

	@NotNull
	@Column(name = "uf")
	private String uf;
	
	
//	@JoinColumn(name="id_pessoa", insertable=true, updatable = true, referencedColumnName="id_pessoa")
	@OneToMany(mappedBy="pessoa", fetch = FetchType.LAZY)
	private List<Pessoa> pessoas;

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public CidadesPernambuco getCidade() {
		return cidade;
	}

	public void setCidade(CidadesPernambuco cidade) {
		this.cidade = cidade;
	}



}
