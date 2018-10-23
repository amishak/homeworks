package com.example.oop;

public class UserTester {

    public static void main(String[] args) {
        Address address = new Address("Warsaw", "Krakowska", "10001");
        User user = new User("Jan", address);
    }
}
