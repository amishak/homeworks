package com.example.oop;

public class Passer {

    public static void main(String[] args) {
        apply(2);

        int input = 3;
        apply(input);
        System.out.println("input = " + input);

        Value inputValue = new Value(100);
        apply(inputValue);
        System.out.println("outside inputValue.value = " + inputValue.value);
        inputValue.value = 50;
        System.out.println("outside inputValue.value = " + inputValue.value);
    }

    private static void apply(Value inputValue) {
        System.out.println("before inputValue.value = " + inputValue.value);
        inputValue.value = 777;
        System.out.println("after inputValue.value = " + inputValue.value);
    }

    private static void applyRestictive(final Value inputValue) {
        System.out.println("before inputValue.value = " + inputValue.value);
        inputValue.value = 777; // it's perfectly OK!
        // inputValue = new Value(0);  forbidden!
        System.out.println("after inputValue.value = " + inputValue.value);
    }

    private static void apply(int i) {
        System.out.println(i);
        i = 99;
        System.out.println("i = " + i);
    }

    private static void applyRestictive(final int i) {
        System.out.println(i);
        // i = 99; forbidden!
        System.out.println("i = " + i);
    }



}
