package com.accenture.academico.model;

import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
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

	private static final long serialVersionUID = -1675559664523014564L;

	@NotNull
	@Column(name = "dtAdmissao")
	@Temporal(value = TemporalType.DATE)
	private Calendar dtAdmissao;

	@Column(name = "departamento")
	@NotNull
	private String departamento;

	@NotNull
	private String instEnsino;

	@NotNull
	@Column(length = 50)
	private String titulacao;

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

	public List<Aluno> getListaAlunos() {

		return listaAlunos;

	}

	public void setListaAlunos(List<Aluno> listaAlunos) {

		this.listaAlunos = listaAlunos;

	}

	public String getTitulacao() {

		return titulacao;

	}

	public void setTitulacao(String titulacao) {

		this.titulacao = titulacao;

	}

	public String getInstEnsino() {

		return instEnsino;

	}

	public void setInstEnsino(String instEnsino) {

		this.instEnsino = instEnsino;

	}

}
