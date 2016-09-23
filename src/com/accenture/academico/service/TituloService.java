package com.accenture.academico.service;

import java.util.List;

import com.accenture.academico.model.Titulo;

public interface TituloService {

	public void addTitulo(Titulo t);

	public void updateTitulo(Titulo t);

	public void removeTitulo(Titulo t);

	public List<Titulo> listTitulo();

}
