package com.example;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    @Test
    public void testSet() {
        Set<String> names;
        names = new HashSet<>();
        names.add("Andrii");
        names.add("Basia");
        for (int i = 0; i < 13; i++) {
            names.add("Andrii");
        }
        for (String name : names) {
            System.out.println("name = " + name);
        }
    }

    @Test
    public void testTreeSet() {
        Set<String> names;
        names = new TreeSet<>();
        names.add("Basia");
        for (int i = 0; i < 13; i++) {
            names.add("andrii");
        }
        names.add("Andrii");
        for (String name : names) {
            System.out.println("name = " + name);
        }
    }
}
