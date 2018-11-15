package com.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class ExpandableArrayIntegerTest {

    Random random = new Random();

    @Test
    public void testExpandableArrayInteger() {
        new ExpandableArrayInteger();
    }

    @Test
    public void testExpandableArrayIntegerAdd() {
        ExpandableArrayInteger list = new ExpandableArrayInteger();
        list.add(5);
    }

    @Test
    public void testExpandableArrayIntegerAddAndGet() {
        ExpandableArrayInteger list = new ExpandableArrayInteger();
        int inputValue = random.nextInt();
        System.out.println("random = " + inputValue);
        list.add(inputValue);
        assertEquals(inputValue, list.get(0));
    }

    @Test
    public void testExpandableArrayIntegerAddAndGetTwo() {
        ExpandableArrayInteger list = new ExpandableArrayInteger();

        int inputValue = random.nextInt();
        System.out.println("random = " + inputValue);
        list.add(inputValue);
        assertEquals(inputValue, list.get(0));

        int secondRandom = random.nextInt();
        System.out.println("second random = " + secondRandom);
        list.add(secondRandom);
        assertEquals(inputValue, list.get(0));
        assertEquals(secondRandom, list.get(1));
    }

    @Test
    public void testExpandableArrayIntegerAddAndGetMany() {
        List<Integer> list = new ArrayList<>();

        int[] input = new int[random.nextInt(45)];
        for (int i = 0; i < input.length; i++) {
            int inputValue = random.nextInt();
            System.out.println("random = " + inputValue);
            input[i] = inputValue;
            list.add(inputValue);
            assertEquals(new Integer(inputValue), list.get(i));
        }

        for (int i = 0; i < input.length; i++) {
            assertEquals(Integer.valueOf(input[i]), list.get(i));
        }
    }
}
