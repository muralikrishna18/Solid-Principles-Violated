package com.codewithmurali;

public class Book extends EVersions{
    String name;
    String authorName;
    int year;
    int price;
    String isbn;

    public Book(String name, String authorName, int year, int price, String isbn) {
        this.name = name;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
        this.isbn = isbn;
    }

    public void digitalGraphic(){
        throw new RuntimeException();

    }



}