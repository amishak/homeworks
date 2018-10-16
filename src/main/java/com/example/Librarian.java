package com.example;

//import java.util.Date;

public class Librarian {

    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();


        Book emptyBook = new Book();
        System.out.println("book.title = [" + emptyBook.title + "]");
        System.out.println("book.author = [" + emptyBook.author + "]");

        System.out.println();

        String title = "Illiada";
        Book homerBook = new Book(title, "Homer");
        System.out.println("book.title = [" + homerBook.title + "]");
        System.out.println("book.author = [" + homerBook.author + "]");

        System.out.println();

        Book emptyFromDefault = new Book();
        emptyFromDefault.title = "Odissea";
        emptyFromDefault.author = "Homer";
        System.out.println("book.title = [" + emptyFromDefault.title + "]");
        System.out.println("book.author = [" + emptyFromDefault.author + "]");
    }
}
