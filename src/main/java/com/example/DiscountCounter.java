package com.example;

public class DiscountCounter {

    public static void main(String[] args) {
        int[] counters = new int[101];

        for (int vipCounter = 0; vipCounter < 2; vipCounter++) {
            for (int age = 16; age < 81; age++) {
                int discount = Discount.getDiscount(age, !(vipCounter == 0));
//                counters[discount] = counters[discount] + 1;
                counters[discount]++;
            }
        }
        /*for (int i = 0; i < counters.length; i++) {
            if (counters[i] != 0) {
                System.out.println("counters[" + i + "] = " + counters[i]);
//                break;
            }
        }*/
        System.out.println("While all");
        int i = 0;
        while (i < counters.length) {
            if (counters[i] != 0) {
                System.out.println("counters[" + i + "] = " + counters[i]);
            }
            i++;
        }
        // print only first 3 not zero element
        System.out.println("Do-while only first 3");
        int j = 0;
        boolean toGo = true;
        int counter = 0;
        do {
            if (counters[j] != 0) {
                System.out.println("counters[" + j + "] = " + counters[j]);
                counter++;
            }
            j++;
            if (counter >= 3) {
                toGo = false;
            }
        } while (toGo);


    }

}
