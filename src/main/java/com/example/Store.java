package com.example;

import com.example.store.Client;
import com.example.store.Employee;
import com.example.store.Person;

public class Store {

    public static void main(String[] args) {
        Person person = new Person("Adam", "+48111111111");
        System.out.println("person.getId() = " + person.getId());
        System.out.println("person.getName() = " + person.getName());
        System.out.println("person.getDiscount() = " + person.getDiscount());

        Person anotherPerson = new Person("Eric", "+484444444444");
        System.out.println("anotherPerson.getId() = " + anotherPerson.getId());
        System.out.println("anotherPerson.getName() = " + anotherPerson.getName());
        System.out.println("anotherPerson.getDiscount() = " + anotherPerson.getDiscount());

        Employee employee = new Employee("Noah", "+48222222222", 1000);
        System.out.println("employee.getId() = " + employee.getId());
        System.out.println("employee.getName() = " + employee.getName());
        System.out.println("employee.getDiscount() = " + employee.getDiscount());

        Client client = new Client("Eva", "+483333333333", 17, true);
        System.out.println("client.getId() = " + client.getId());
        System.out.println("client.getName() = " + client.getName());
        System.out.println("client.getDiscount() = " + client.getDiscount());

    }
}
