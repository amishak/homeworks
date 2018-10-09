package com.example;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] numbers = new int[11];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]=" + numbers[i]);
        }
        numbers[3] = 100500;
        System.out.println("After");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]=" + numbers[i]);
        }
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[3] = " + numbers[3]);
        System.out.println("numbers[9] = " + numbers[9]);
        System.out.println("numbers[10] = " + numbers[10]);


    }
}
