package com.example.store;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonServiceTest {
    private PersonService service;

    @Before
    public void prepare() {
        service = new PersonService();
        System.out.println("Service created");
    }

    @Test
    public void testCreateClient() {
        Assert.assertEquals(0, service.countPersons());
        Client adam = new Client("Adam", "+48111111111", 44, false);
        service.createClient(adam);
        Assert.assertEquals(1, service.countPersons());
        service.createClient(adam);
        Assert.assertEquals(1, service.countPersons());
        adam.setPhone("+48111111112");
        service.createClient(adam);
        Assert.assertEquals(2, service.countPersons());
    }

    @Test
    public void testCreateEmployee() {
        Employee employee = new Employee("Noah", "+48111111111", 1000);
        service.createEmployee(employee);
        Person returned = service.readPerson(employee.getPhone());
        Assert.assertEquals(employee.getPhone(), returned.getPhone());
        Assert.assertEquals(employee.getRealName(), returned.getRealName());
    }

    @Test
    public void testUpdate() {
        Client adam = new Client("Adam", "+48111111111", 44, false);
        service.createClient(adam);
        Assert.assertEquals(1, service.countPersons());
        // you code here
        Person returned = service.readPerson(adam.getPhone());
        Assert.assertEquals("Noah", returned.getName());
    }

    @Test
    public void testDelete() {
        Assert.assertEquals(0, service.countPersons());
        Client adam = new Client("Adam", "+48111111111", 44, false);
        service.createClient(adam);
        Assert.assertEquals(1, service.countPersons());
        // you code here, delete absent person
        Assert.assertEquals(1, service.countPersons());
        // you code here
        Assert.assertEquals(0, service.countPersons());
    }
}
