package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ListTest {

    @Test
    public void testPrimitives() {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(1));
        list.add(Integer.valueOf(2));
        list.add(3);
    }

    @Test
    public void testObjects() {
        List<Object> list = new ArrayList<>();
        list.add("name");
        list.add(2);
        list.add(new Object());
        list.add(1, 5);
        for (Object o : list) {
            System.out.println(o.getClass().getName() + " -> " + o.toString());
        }
    }

    @Test
    public void testQueue() {
        Queue<String> queue = new LinkedList<>();
        System.out.println("queue.size() = " + queue.size());
        boolean added = queue.offer("First");
        System.out.println("added = " + added);
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.size() = " + queue.size());
        String value = queue.poll();
        System.out.println("value = " + value);
        System.out.println("queue.size() = " + queue.size());
    }

    @Test
    public void testQueueTail() {
        Deque<String> queue = new LinkedList<>();
        System.out.println("queue.size() = " + queue.size());
        boolean added = queue.offer("First");
        System.out.println("added = " + added);
        queue.add("Second");
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue.size() = " + queue.size());
        String value = queue.poll();
        System.out.println("value = " + value);
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.size() = " + queue.size());
    }

    @Test
    public void testListAdd() {
        List<String> list = new LinkedList<>();
        // put your code here
        Assert.assertEquals(list.size(), 1);
    }

    @Test
    public void testListGet() {
        List<String> list = new LinkedList<>();
        // put your code here
        Assert.assertNotNull(list.get(0));
    }

    @Test
    public void testListClear() {
        List<String> list = new LinkedList<>();
        list.add("value");
        list.add("value again");
        // put your code here
        Assert.assertEquals(list.size(), 0);
    }

    @Test
    public void testListContains() {
        List<String> list = new LinkedList<>();
        // put your code here
        Assert.assertTrue(list.contains("value"));
    }

    @Test
    public void testListIndexOf() {
        List<String> list = new LinkedList<>();
        // put your code here
        Assert.assertTrue(list.indexOf("value") > 0);
    }

    @Test
    public void testListIsEmpty() {
        List<String> list = new LinkedList<>();
        // put your code here
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testListRemove() {
        List<String> list = new LinkedList<>();
        list.add("value");
        list.add("value again");
        // put your code here
        Assert.assertEquals(list.size(), 1);
    }

    @Test
    public void testListAddAll() {
        List<String> list = new LinkedList<>();
        list.add("value");
        List<String> listAgain = new LinkedList<>();
        listAgain.add("value again");
        // put your code here
        Assert.assertEquals(list.size(), 2);
    }

    @Test
    public void testListSet() {
        List<String> list = new LinkedList<>();
        list.add("value");
        // put your code here
        Assert.assertEquals(list.get(0), "value again");
    }
}
