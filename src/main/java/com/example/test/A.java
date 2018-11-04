package com.example.test;

public class A {

    private static int counter = 0;

    public A() {
        counter++;
    }

    public static int getCount() {
        return counter;
    }
}
