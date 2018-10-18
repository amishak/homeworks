package com.example.oop;

public class Book {

    static final String MATERIAL = "paper"; // constant

    private String title = "";
    private String author = "";
    private int pages;

    private static int counter = 0;

    public Book() {
        counter++;
        pages = 4;
        System.out.println("Book.getCounter() = " + Book.getCounter());
    }

    /*
    @title for book title
    @author for book author
     */
    public Book(String title, String author) {
        this(); // Book()
        this.setTitle(title);
        setAuthor(author);
    }

    public Book(String title, String author, int pages) {
        this(title, author); // Book(String title, String author)
        setPages(pages);
    }

    public static String getMaterial() {
        return MATERIAL;
    }

    public int getPages() {
        if (pages < 4) {
            return 0;
        }
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void doNothing() {
        System.out.println("Hello");
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setPages(int pages) {
        this.pages = pages;
    }

    public static int getCounter() {
        return counter;
    }
}
