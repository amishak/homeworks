package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

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
    public void testOfferOrAdd() {
        Queue<String> queue = new LinkedList<>();
        // put you code here
        Assert.assertEquals(1, queue.size());
    }

    @Test
    public void testPeekOrElement() {
        Queue<String> queue = new LinkedList<>();
        // put you code here
        Assert.assertEquals("value", queue.peek());
        Assert.assertTrue(queue.contains("value"));
        Assert.assertEquals(1, queue.size());
    }

    @Test
    public void testRemoveOrPoll() {
        Queue<String> queue = new LinkedList<>();
        queue.add("something");
        // put you code here
        Assert.assertEquals(0, queue.size());
    }

    @Test
    public void testDequePeek() {
        Deque<String> queue = new LinkedList<>();
        // put you code here
        // put you code here
        Assert.assertEquals("first value", queue.peekFirst());
        Assert.assertEquals("last value", queue.peekLast());
    }


}
