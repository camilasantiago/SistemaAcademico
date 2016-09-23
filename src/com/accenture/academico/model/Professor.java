package com.accenture.academico.model;

import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@PrimaryKeyJoinColumn(name = "idPessoa")
@Table
@ManagedBean(name = "professor")
public class Professor extends Pessoa {

	@NotNull
	@Column(name = "dtAdmissao")
	@Temporal(value = TemporalType.DATE)
	private Calendar dtAdmissao;

	@Column(name = "departamento")
	@NotNull
	private String departamento;

	@ManyToOne
	@NotNull
	private Titulo titulo;

	@OneToMany(mappedBy = "professor")
	private List<Aluno> listaAlunos;

	public Calendar getDtAdmissao() {

		return dtAdmissao;

	}

	public void setDtAdmissao(Calendar dtAdmissao) {

		this.dtAdmissao = dtAdmissao;

	}

	public String getDepartamento() {

		return departamento;

	}

	public void setDepartamento(String departamento) {

		this.departamento = departamento;

	}

	public Titulo getTitulo() {

		return titulo;

	}

	public void setTitulo(Titulo titulo) {

		this.titulo = titulo;

	}

	public List<Aluno> getListaAlunos() {

		return listaAlunos;

	}

	public void setListaAlunos(List<Aluno> listaAlunos) {

		this.listaAlunos = listaAlunos;

	}

	@Override
	public String toString() {

		return " => Id: " + this.getId() + " - Nome: " + this.getNome();

	}

}
