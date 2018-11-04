package com.example.test;

public class CounterObjectTest {

    public static void main(String[] args) {
        System.out.println(A.getCount() + " objects for start");
        new A();
        new A();
        System.out.println(A.getCount() + " objects in the middle");
        new A();
        System.out.println(A.getCount() + " objects for finish");
    }
}
