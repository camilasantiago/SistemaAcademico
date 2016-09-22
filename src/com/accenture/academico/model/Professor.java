package com.accenture.academico.model;

import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_professor")
@ManagedBean(name="professor")
public class Professor extends Pessoa{
	
	@Column(name="dtAdmissao")
	@NotNull
	@Temporal(value=TemporalType.DATE)
	private Calendar dtAdmissao; //OBRIGATORIO
	
	@Column(name="departamento")
	@NotNull
	private String departamento; //OBRIGATORIO
	
	@Column(name="titulacao")
	@NotNull
	private String titulacao; //OBRIGATORIO E COM 100 CARACTERES - essa string vai trazer a descri��o do t�tulo da classe Titulacao
	
	/**
	 * Professor ao qual o aluno pertence e histórico do mesmo. NÃO ENTENDI!!!
	 */
	
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
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
}
