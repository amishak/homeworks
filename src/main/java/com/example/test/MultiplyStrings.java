package com.example.test;

import java.util.Arrays;

public class MultiplyStrings {

    public static void main(String[] args) {
        multiply(new String[]{"a", "b"}, 2);
        multiply(new String[]{"a", "b"}, 3);
        multiply(new String[]{"a", "b", "c"}, 2);
        multiply(new String[]{"a", "b", "c"}, 3);
        multiply(new String[]{}, 2);
        multiply(new String[]{}, 3);
    }

    private static void multiply(String[] input, int multiplier) {
        System.out.println("multiplier = " + multiplier);
        System.out.println("input = " + Arrays.toString(input));
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < multiplier; j++) {
                System.out.print(input[i] + " ");
            }
        }
        System.out.println("\n");
    }
}
