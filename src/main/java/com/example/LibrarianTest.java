package com.example;

import com.example.oop.Book;
import com.example.oop.Librarian;

public class LibrarianTest {

    public static void main(String[] args) {
        Librarian librarian = new Librarian();
//        librarian.main(new String[1]);

        Book testBook = new Book("Test", "TestAuthor", 100);

        librarian.setTitle("New Title", testBook);
    }

}
