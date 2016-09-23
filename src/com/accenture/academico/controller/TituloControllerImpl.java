package com.accenture.academico.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.stereotype.Controller;

import com.accenture.academico.model.Titulo;
import com.accenture.academico.service.TituloService;

@Controller
@ManagedBean(name = "tituloController")
public class TituloControllerImpl implements TituloController {

	private TituloService tituloService;

	public void setTituloService(TituloService tituloService) {

		this.tituloService = tituloService;

	}

	@Override
	public void addTitulo(Titulo t) {

		tituloService.addTitulo(t);

	}

	@Override
	public void updateTitulo(Titulo t) {

		tituloService.updateTitulo(t);

	}

	@Override
	public void removeTitulo(Titulo t) {

		tituloService.removeTitulo(t);

	}

	@Override
	public List<Titulo> listTitulo() {

		return tituloService.listTitulo();

	}

}
