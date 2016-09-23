package com.accenture.academico.controller;

import java.util.List;

import com.accenture.academico.model.Titulo;

public interface TituloController {

	public void addTitulo(Titulo t);

	public void updateTitulo(Titulo t);

	public void removeTitulo(Titulo t);

	public List<Titulo> listTitulo();

}
