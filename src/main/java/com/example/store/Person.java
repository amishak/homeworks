package com.example.store;

public class Person {
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

    public int getDiscount() {
        return 25;
    }
}
