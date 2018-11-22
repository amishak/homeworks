package com.example;

import org.junit.Test;

import java.util.*;

public class IteratorTest {

    @Test
    public void testIterator() {
        Collection<String> cities = new HashSet<>();
        cities.add("Krakow");
        cities.add("Warszawa");
        cities.add("Gdansk");

//        System.out.println("cities = " + cities.toString());
        System.out.println("cities = " + cities);

        /*for (String city : cities) {
            System.out.println("city = " + city);
        }
        System.out.println();*/

        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("element.hashCode() = " + element.hashCode());
            if (element.equals("Warszawa")) {
                iterator.remove();
            } else {
                System.out.println("iterator.next() = " + element);
            }
        }

        System.out.println("cities = " + cities);

    }
}
