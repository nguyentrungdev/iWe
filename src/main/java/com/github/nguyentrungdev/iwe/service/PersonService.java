package com.github.nguyentrungdev.iwe.service;

import java.util.List;

import com.github.nguyentrungdev.iwe.pojo.Person;

public interface PersonService {
	public void addPerson(Person person);

	void updatePerson(Person p);

	List<Person> listPersons();

	Person getPersonById(long id);

	void removePerson(long id);
}
