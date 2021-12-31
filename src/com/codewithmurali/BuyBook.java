package com.codewithmurali;

public class BuyBook {

    private UPI upi;//it violates Dependency principle as concrete class is used
    private CreditCard cc;
    private DebitCard dc;

    public BuyBook(Book book, UPI db) {
    this.upi = db;
    upi.doTransaction(book.price);
    }


}
