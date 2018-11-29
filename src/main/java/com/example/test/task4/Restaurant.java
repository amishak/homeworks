package com.example.test.task4;

public class Restaurant {

    public static void main(String[] args) {
        Table[] tables = new Table[5];
        for (int i = 0; i < tables.length; i++) {
            tables[i] = new Table(i);
        }

        Order beerForThree = new Order("Beer", 3);
        Order[] orderForFirstTable = new Order[1];
        orderForFirstTable[0] = beerForThree;
        tables[0].addOrders(orderForFirstTable);

        Order beerForTwo = new Order("Beer", 2);
        Order pizza = new Order("Pizza", 1);
        Order[] orderForSecondTable = new Order[2];
        orderForSecondTable[0] = beerForTwo;
        orderForSecondTable[1] = pizza;
        tables[1].addOrders(orderForSecondTable);

        Order beerForOne = new Order("Beer", 1);
        tables[2].addOrder(beerForOne);
        tables[2].addOrder(pizza);
        Order iceCreamForOne = new Order("IceCream", 1);
        tables[2].addOrder(iceCreamForOne);
        tables[2].addOrder(iceCreamForOne);
        tables[2].addOrder(iceCreamForOne);
        tables[2].addOrder(iceCreamForOne);


        tables[3].addOrder(iceCreamForOne);
        tables[3].addOrder(iceCreamForOne);
        tables[3].addOrder(iceCreamForOne);
        tables[3].clearOrders();
        tables[3].addOrder(iceCreamForOne);
    }
}
