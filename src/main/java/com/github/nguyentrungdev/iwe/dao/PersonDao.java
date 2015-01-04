package com.github.nguyentrungdev.iwe.dao;

import java.util.List;

import com.github.nguyentrungdev.iwe.pojo.Person;

public interface PersonDao {
	public void addPerson(Person person);

	void updatePerson(Person p);

	List<Person> listPersons();

	Person getPersonById(long id);

	void removePerson(long id);

}
