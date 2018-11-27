package com.example.store;

import java.util.HashMap;
import java.util.Map;

public class PersonService {
    private Map<String, Person> storage;

    public PersonService() {
        storage = new HashMap<>();
    }

    public void createClient(Client client) {
        if (!storage.containsKey(client.getPhone())) {
            storage.put(client.getPhone(), client);
        }
    }

    public void createEmployee(Employee employee) {
        storage.putIfAbsent(employee.getPhone(), employee);
    }

    public int countPersons() {
        return storage.size();
    }

    public Person readPerson(String phone) {
        return storage.get(phone);
    }

    public void updateClient(String phone, Client client) {
        Person found = readPerson(phone);
        if (found != null) {
            storage.put(phone, client);
        }
    }

    public void updateEmployee(String phone, Employee employee) {
        Person found = readPerson(phone);
        if (found != null) {
            storage.put(phone, employee);
        }
    }

    public void deleteClientOrEmployee(String phone) {
        storage.remove(phone);
    }

    /*public void createPerson(Person person) {
        if (person instanceof Client) {
            createClient(person);
        } else if (person instanceof Employee) {
            createEmployee(person);
        }
    }

    private void createClient(Person person) {
        Client client = (Client)person;
    }*/
}
