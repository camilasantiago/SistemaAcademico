package com.accenture.academico.service;

import java.util.List;

import com.accenture.academico.model.Person;

public interface PersonService {

	public void addPerson(Person p);

	public List<Person> listPersons();

}
