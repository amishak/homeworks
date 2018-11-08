package com.example.store;

import java.util.Objects;

public abstract class Person {
    private String name;
    private String phone;
    protected static int id;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
        id++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name + " " + getId();
    }

    public String getRealName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public abstract int getDiscount();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(phone, person.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }
}
