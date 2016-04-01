package com.itheima12.s2sh.test;

import com.itheima12.s2sh.domain.Person;
import com.itheima12.s2sh.service.PersonService;
import com.opensymphony.xwork2.ActionContext;
import org.junit.Test;

/**
 * Created by BlueT on 2016/4/1.
 */
public class personTest extends SpringUtils {
    @Test
    public void TestSavePerson() {
        PersonService ps = (PersonService) context.getBean("personService");
        Person p = new Person();
        p.setName("李硕");
        p.setDescription("ls");
        ps.savePerson(p);
    }

    @Test
    public void TestPersonAtction() {
        context.getBean("personAction");
    }
}
