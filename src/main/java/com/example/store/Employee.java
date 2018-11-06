package com.example.store;

public class Employee extends Person {
    private int salary;

    public Employee(String name, String phone, int salary) {
        super(name, phone);
        this.salary = salary;
    }

    @Override
    public String getName() {
        System.out.println("getting name");
        return super.getName();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
