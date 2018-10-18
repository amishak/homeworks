package com.example.oop;

public class Librarian {

    public static void main(String[] args) {
        String materialBefore = Book.MATERIAL;

        Book emptyBook = new Book();
        System.out.println("book.title = [" + emptyBook.getTitle() + "]");
        System.out.println("book.author = [" + emptyBook.getAuthor() + "]");

        System.out.println();

        String title = "Illiada";
        Book homerBook = new Book(title, "Homer");
        System.out.println("book.title = [" + homerBook.getTitle() + "]");
        System.out.println("book.author = [" + homerBook.getAuthor() + "]");

        System.out.println();

        Book emptyFromDefault = new Book();
        emptyFromDefault.setTitle("Odissea");
        emptyFromDefault.setAuthor("Homer");
        System.out.println("book.title = [" + emptyFromDefault.getTitle() + "]");
        System.out.println("book.author = [" + emptyFromDefault.getAuthor() + "]");

        System.out.println();
        Book fullBook = new Book("Java by example", "Gosling", 777);
        System.out.println("book.title = [" + fullBook.getTitle() + "]");
        System.out.println("book.author = [" + fullBook.getAuthor() + "]");
        System.out.println("book.pages = [" + fullBook.getPages() + "]");

        fullBook.doNothing();
    }

    public void setTitle(String title, Book book) {

    }
}
