package com.example.oop;

public class Printer {

    public static void main(String[] args) {
        for (int row = 0; row < 10; row++) {
            for (int column = 1; column < 11; column++) {
                print(row * 10 + column);
//            System.out.print(row * 10 + column + " ");
            }
            System.out.println();
        }
    }

    private static void print(int input) {
        if (input % 3 == 0) {
            if (input % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else {
                System.out.print("Fizz ");
            }
        } if (input % 5 == 0) {
            System.out.print("Buzz ");
        } else {
            System.out.print(input + " ");
        }
    }

}
