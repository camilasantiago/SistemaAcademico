package com.accenture.academico.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.accenture.academico.model.type.TipoPessoa;
import com.accenture.academico.model.type.TipoSexo;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table
@ManagedBean(name = "pessoa")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idPessoa")
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nome", length = 100)
	@NotNull
	private String nome;

	@Column(name = "cpf", length = 14)
	@NotNull
	private String cpf;

	@Column(name = "sexo")
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoSexo tipoSexo;

	@Column(name = "categoria")
	@NotNull
	private TipoPessoa categoria;

	@Embedded
	private Endereco endereco = new Endereco();

	@Embedded
	private Telefone telefone;

	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public String getCpf() {

		return cpf;

	}

	public void setCpf(String cpf) {

		this.cpf = cpf;

	}

	public TipoSexo getTipoSexo() {

		return tipoSexo;

	}

	public void setTipoSexo(TipoSexo tipoSexo) {

		this.tipoSexo = tipoSexo;

	}

	public TipoPessoa getCategoria() {

		return categoria;

	}

	public void setCategoria(TipoPessoa categoria) {

		this.categoria = categoria;

	}

	public Endereco getEndereco() {

		return endereco;

	}

	public void setEndereco(Endereco endereco) {

		this.endereco = endereco;

	}

	public Telefone getTelefone() {

		return telefone;

	}

	public void setTelefone(Telefone telefone) {

		this.telefone = telefone;

	}

	public int getId() {

		return id;

	}

}