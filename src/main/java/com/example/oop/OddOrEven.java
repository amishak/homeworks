package com.example.oop;

import java.util.Arrays;

public class OddOrEven {

    public static void main(String[] args) {
        test(new int[]{1, 2, 3, 4, 5});
        test(new int[]{2, 4, 6});
        test(new int[]{1, 3, 5});
        test(new int[]{});
    }

    private static void test(int[] input) {
        System.out.println("input = " + Arrays.toString(input));
        int even1 = apply(input);
        System.out.println(even1 + " even and " + (input.length - even1) + " odd\n");
    }

    private static int apply(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

}