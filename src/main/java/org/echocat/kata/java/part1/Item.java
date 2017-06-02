package org.echocat.kata.java.part1;


import java.util.List;

/**
 * Created by juanorduz on 01.06.17.
 */
public abstract class Item {

    String  title;
    String isbn;
    String[] authorsEmails;
    String other;

    public Item(String title, String isbn, String[] authorsEmails, String other) {
        this.title = title;
        this.isbn = isbn;
        this.authorsEmails = authorsEmails;
        this.other = other;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String[] getAuthorsEmails() {
        return authorsEmails;
    }

    public void setAuthorsEmails(String[] authorsEmails) {
        this.authorsEmails = authorsEmails;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
