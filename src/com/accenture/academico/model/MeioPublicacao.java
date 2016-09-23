package com.accenture.academico.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.accenture.academico.model.type.TipoDispositivo;

@Entity
@ManagedBean(name="meioPublicacao")
public class MeioPublicacao {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoDispositivo tipoDispositivo;

	@OneToMany(mappedBy = "meioPublicacao")
	private List<Publicacao> publicacoes;

	public TipoDispositivo getTipoDispositivo() {

		return tipoDispositivo;

	}

	public void setTipoDispositivo(TipoDispositivo tipoDispositivo) {

		this.tipoDispositivo = tipoDispositivo;

	}

	public List<Publicacao> getPublicacoes() {

		return publicacoes;

	}

	public void setPublicacoes(List<Publicacao> publicacoes) {

		this.publicacoes = publicacoes;

	}

	public Long getId() {

		return id;

	}

}
