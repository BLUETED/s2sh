package com.itheima12.s2sh.dao;

import java.io.Serializable;

import com.itheima12.s2sh.domain.Person;

public interface PersonDao {
	public void savePerson(Person person);
	public Person getPersonById(Serializable id);
}
