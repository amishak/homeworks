package com.example.store;

import com.example.Discount;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PersonTest {

    @Ignore("fix it later")
    public void testPersonToString() {
        Person person = new Client("Adam", "+4890909090", 55, false);

        System.out.println(person.toString());
    }

    @Test
    public void testPersonEquals() {
        Person person = new Client("Adam", "+4890909090", 55, false);
        Person anotherPerson = person;

        Assert.assertTrue(person.equals(anotherPerson));
    }

    @Test
    public void testReflection() {
        Person person = new Client("Adam", "+4890909090", 55, false);
        Assert.assertTrue(person.equals(person));

        Employee employee = new Employee("Adam", "+4890909090", 1000);
        Assert.assertFalse(person.equals(employee));
    }

    @Test
    public void testAnotherClassEquals() {
        Person person = new Client("Adam", "+4890909090", 55, false);
        Employee employee = new Employee("Adam", "+4890909090", 1000);
        Assert.assertFalse(person.equals(employee));
    }

    @Test
    public void testDiscountable() {
        Person person = new Client("Adam", "+4890909090", 55, false);
        Employee employee = new Employee("Adam", "+4890909090", 1000);
        Discountable[] people = new Discountable[2];
        people[0] = person;
        people[1] = employee;
        for (Discountable per : people) {
            System.out.println("per.getDiscount() = " + per.getDiscount());
        }
    }

}
