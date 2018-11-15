package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class ListTest {

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
