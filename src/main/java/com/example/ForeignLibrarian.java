package com.example;

import com.example.oop.*;

public class ForeignLibrarian {

    public static void main(String[] args) {
        String material = Book.getMaterial();
        System.out.println("Book.getCounter() = " + Book.getCounter());

        Book book = new Book();
        book.doNothing();
        Librarian librarian = new Librarian();
        System.out.println("Book.getCounter() = " + Book.getCounter());
    }
}
