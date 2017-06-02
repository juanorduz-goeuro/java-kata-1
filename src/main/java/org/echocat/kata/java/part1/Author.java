package org.echocat.kata.java.part1;

/**
 * Created by juanorduz on 01.06.17.
 */
public class Author {

    String email;
    String firtsName;
    String lastName;

    public Author(String email, String firtsName, String lastName) {
        this.email = email;
        this.firtsName = firtsName;
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
