package com.example.test;

import java.util.Arrays;

public class CountDigits {

    public static void main(String[] args) {
        countDigits(new int[]{1, 11, 22, 333, 444, 555});
        countDigits(new int[]{1, 2, 3, 44, 55, 666});
        countDigits(new int[]{});
    }

    private static void countDigits(int[] input) {
        System.out.println("input = " + Arrays.toString(input));
        int counter3 = 0;
        int counter2 = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 99) {
                counter3++;
            } else if (input[i] > 9) {
                counter2++;
            }
        }
        System.out.println("Three digits in array: " + counter3);
        System.out.println("Two   digits in array: " + counter2);
        System.out.println("One   digit  in array: " + (input.length - counter2 - counter3));
        System.out.println();
    }
}
