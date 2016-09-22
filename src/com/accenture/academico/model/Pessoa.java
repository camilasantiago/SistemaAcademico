package com.accenture.academico.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="tb_pessoa")
@ManagedBean(name="pessoa")
public abstract class Pessoa {
	
	//CAMPO OBRIGAT�RIO
	@Id
	@Column(name="id_pessoa")
	@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; 
	
	@Column(name="nome", length=100)
	@NotNull
	private String nome;//limitar o tamanho para at� 100 caracteres
	
	@Column(name="cpf", length=14)
	@NotNull
	private String cpf; //Package Valida contém o metodo de validação
	
	@Column(name="sexo")
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoSexo tipoSexo;
	
	@Column(name="categoria")
	@NotNull
	private TipoPessoa categoria;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_endereco")
	@NotNull
	private Endereco endereco;
	
	@OneToMany(mappedBy="tb_pessoa",fetch = FetchType.LAZY)
	private List<Telefone> telefone;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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

	public TipoPessoa getCategoria() {
		return categoria;
	}
	public void setCategoria(TipoPessoa categoria) {
		this.categoria = categoria;
	}
	public TipoSexo getTipoSexo() {
		return tipoSexo;
	}
	public void setTipoSexo(TipoSexo tipoSexo) {
		this.tipoSexo = tipoSexo;
	}
	public List<Telefone> getTelefone() {
		return telefone;
	}
	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

}
