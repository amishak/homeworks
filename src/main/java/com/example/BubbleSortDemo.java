package com.example;

public class BubbleSortDemo {

    public static void main(String[] args) {
        int[] input = new int[7];
        input[0] = 5;
        input[1] = 2;
        input[2] = 0;
        input[3] = 1;
        input[4] = 6;
        input[5] = 3;
        input[6] = 3;

        sort(input);
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "->" + array[i]);
        }

        for (int i = 0; i < array.length - 1; i++) {
            int isMin = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[isMin] > array[j]) {
                    isMin = j;
                }
            }
            if (isMin != i) {
                swap(array, i, isMin);
            }
        }

        System.out.println("After sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "->" + array[i]);
        }
    }

    private static void swap(int[] array, int from, int to) {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }
}
