package com.accenture.academico.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.stereotype.Controller;

import com.accenture.academico.model.Person;
import com.accenture.academico.service.PersonService;

@ManagedBean(name = "personController")
@Controller
public class PersonControllerImpl implements PersonController {

	private PersonService personService;

	public void setPersonService(PersonService personService) {

		this.personService = personService;

	}

	@Override
	public void addPerson(Person p) {
		System.out.println("RamonController");
		personService.addPerson(p);

	}

	@Override
	public List<Person> listPersons() {

		return personService.listPersons();

	}

}
