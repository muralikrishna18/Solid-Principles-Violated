package com.codewithmurali;

public class WhatsApp implements SocialMedia{//violates substitution principle

    private Book b;

    public WhatsApp(Book b) {
        this.b = b;
    }

    @Override
    public void shareToStory() {

    }

    @Override
    public void shareAsPost() {
    //can't post on whatsapp
    }

    @Override
    public void shareToPerson() {

    }
}
