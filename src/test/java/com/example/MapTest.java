package com.example;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapTest {

    @Test
    public void testMap() {
        Map<String, String> mapping = new HashMap<>();
        mapping.put("name", "imie");
        mapping.put("three", "3");

        System.out.println("mapping = " + mapping);

        if (mapping.containsKey("name")) {
            System.out.println("mapping.get(\"name\") = " + mapping.get("name"));
            mapping.put("name", "nazwisko");
        }

        System.out.println("mapping = " + mapping);

    }

    @Test
    public void testMapNotString() {
        Map<String, Integer> counters = new HashMap<>();

        String input = "Text mean text mean Text";
        String[] words = input.split(" ");

        for (String word : words) {
            if (counters.containsKey(word)) {
                int value = counters.get(word);
                counters.put(word, value + 1);
            } else {
                counters.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : counters.entrySet()) {
            System.out.println("entry = " + entry);
        }
    }

    @Test
    public void testMapValues() {
        Map<Integer, Integer> mapping = new HashMap<>();
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            mapping.put(i, random.nextInt(100));
        }
        // print all keys
        // print all values
    }

}
