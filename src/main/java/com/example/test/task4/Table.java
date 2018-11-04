package com.example.test.task4;

public class Table {

    private static final int MAX_DISH_NUMBER_IN_ORDER = 5;

    Order[] currentOrder = new Order[MAX_DISH_NUMBER_IN_ORDER];
    int table_number;

    public Table(int table_number) {
        this.table_number = table_number;
    }

    public void addOrders(Order[] new_order) {
        this.currentOrder = new_order;
        printOrders();
    }

    private void printOrders() {
        for (int i = 0; i < currentOrder.length; i++) {
            if (currentOrder[i] != null) {
                Order order = currentOrder[i];
                System.out.println("Table " + table_number + " <- order " + (i + 1) + ": " + order.number + " " + order.dishName);
            }
        }
        System.out.println();
    }

    public void addOrder(Order order) {
        int openPosition = -1;
        for (int i = 0; i < currentOrder.length; i++) {
            if (currentOrder[i] == null) {
                openPosition = i;
                break;
            }
        }
        if (openPosition >= 0) {
            currentOrder[openPosition] = order;
        } else {
            System.out.println("Order is full");
        }
        printOrders();
    }

    public void clearOrders() {
        currentOrder = new Order[MAX_DISH_NUMBER_IN_ORDER];
    }
}
