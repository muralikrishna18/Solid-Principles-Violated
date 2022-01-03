package com.codewithmurali;

public class BookStore {
    public static void main(String[] args) {
        Book b = new Book("Name","authorName",1998,123,"iso1992-564");
        Invoice i = new Invoice(b,2,5,18);

        i.printInvoice();
        DebitCard db1 = new DebitCard();
        UPI db = new UPI();
        BuyBook buy =new BuyBook(b,db);
        GraphicBook g = new GraphicBook("Name","authorName",1998,123,"iso1992-564");

        EVersions e = b;
        e.digitalGraphic();


    }





}
