package com.example;

public class Discount {
    public static void main(String[] args) {
        int age = 40;
        boolean isVip = false;
        System.out.println("discount = " + getDiscount(age, isVip));
        System.out.println("discount = " + getDiscount(16, true));
        System.out.println("discount = " + getDiscount(70, false));
    }

    public static int getDiscount(int age, boolean isVip) {
        int discount = 0;
        if (age > 50) {
            discount = 15;
        } else if (age < 25) {
            discount = 20;
        }

        if (isVip) {
            discount = discount + 10;
        }

        return discount;
    }
}
