package com.accenture.academico.controller;

import java.util.List;

import com.accenture.academico.model.Person;

public interface PersonController {

	public void addPerson(Person p);

	public List<Person> listPersons();

}
