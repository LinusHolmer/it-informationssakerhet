package com.example.itinformationssakerhet;

public class Book {
    private String author;
    private String title;
    private int year;

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Book setYear(int year) {
        this.year = year;
        return this;
    }
}

