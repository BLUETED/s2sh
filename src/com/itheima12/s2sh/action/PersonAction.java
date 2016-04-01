package com.itheima12.s2sh.action;

import com.itheima12.s2sh.domain.Person;
import com.itheima12.s2sh.service.PersonService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by BlueT on 2016/4/1.
 */
public class PersonAction extends ActionSupport {
    private PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public String savePerson() {

        Person p = new Person();
        p.setName("李硕");
        p.setDescription("ls");
        personService.savePerson(p);
        return null;
    }
}
