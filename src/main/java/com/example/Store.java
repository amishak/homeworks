package com.example;

import com.example.store.Client;
import com.example.store.Employee;
import com.example.store.Person;

public class Store {

    public static void main(String[] args) {
        Person person = new Client("Adam", "+48111111111", 44, false);
        /*System.out.println("person.getId() = " + person.getId());
        System.out.println("person.getName() = " + person.getName());
        System.out.println("person.getDiscount() = " + person.getDiscount());*/

        Person anotherPerson = new Client("Eric", "+484444444444", 66, true);
        /*System.out.println("anotherPerson.getId() = " + anotherPerson.getId());
        System.out.println("anotherPerson.getName() = " + anotherPerson.getName());
        System.out.println("anotherPerson.getDiscount() = " + anotherPerson.getDiscount());*/

        Employee employee = new Employee("Noah", "+48222222222", 1000);
        /*System.out.println("employee.getId() = " + employee.getId());
        System.out.println("employee.getName() = " + employee.getName());
        System.out.println("employee.getDiscount() = " + employee.getDiscount());*/

        Client client = new Client("Eva", "+483333333333", 17, true);
        /*System.out.println("client.getId() = " + client.getId());
        System.out.println("client.getName() = " + client.getName());
        System.out.println("client.getDiscount() = " + client.getDiscount());*/

        Person[] persons = new Person[4];
        persons[0] = person;
        persons[1] = anotherPerson;
        persons[2] = employee;
        persons[3] = client;

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}
