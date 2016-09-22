package com.accenture.academico.model;

import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_professor")
@ManagedBean(name="professor")
public class Professor extends Pessoa{
	
	
	@NotNull 
	@Column(name="dtAdmissao")
	@Temporal(value=TemporalType.DATE)
	private Calendar dtAdmissao; //OBRIGATORIO
	
	@Column(name="departamento")
	@NotNull
	private String departamento; //OBRIGATORIO
	
	@ManyToOne 
	@NotNull
	@JoinColumn(name="Título")
	private Titulacao titulacao; //OBRIGATORIO E COM 100 CARACTERES - essa string vai trazer a descri��o do t�tulo da classe Titulacao
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="tb_professor")
	private List<Aluno> orientaAluno; //UM PROFESSOR ORIENTA UM OU MAIS ALUNOS
	
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
	public Titulacao getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}
	public List<Aluno> getOrientaAluno() {
		return orientaAluno;
	}
	public void setOrientaAluno(List<Aluno> orientaAluno) {
		this.orientaAluno = orientaAluno;
	}
}
