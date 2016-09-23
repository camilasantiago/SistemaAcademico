package com.accenture.academico.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.stereotype.Controller;

import com.accenture.academico.model.Telefone;
import com.accenture.academico.service.TelefoneService;

@ManagedBean(name = "telefoneController")
@Controller
public class TelefoneControllerImpl implements TelefoneController{

	private TelefoneService telefoneService;
	
	public void setTelefoneService(TelefoneService telefoneService) {
		this.telefoneService = telefoneService;
	}

	@Override
	public void addTelefone(Telefone t) {
		System.out.println("teste controller add telefor");
		telefoneService.addTelefone(t);
	}

	@Override
	public void updateTelefone(Telefone t) {
		System.out.println("teste chamada update telefone");
		telefoneService.updateTelefone(t);
	}

	@Override
	public void removeTelefone(Telefone t) {
		System.out.println("teste remove telefone");
		telefoneService.removeTelefone(t);
	}

	@Override
	public List<Telefone> listTelefone() {
		
		return telefoneService.listTelefone();
	}

}