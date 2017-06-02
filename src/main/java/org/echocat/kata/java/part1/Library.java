package org.echocat.kata.java.part1;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by juanorduz on 01.06.17.
 */
public class Library {

    ReadAuthors ra = new ReadAuthors();
    ArrayList<Author> authors = ra.getAuthorList();


    String fileBooks = "/Users/juanorduz/java-kata-1/src/main/resources/org/echocat/kata/java/part1/data/books.csv";
    String fileMagazines = "/Users/juanorduz/java-kata-1/src/main/resources/org/echocat/kata/java/part1/data/magazines.csv";

    ReadItems rb = new ReadItems();
    ArrayList<Item> books = rb.getItemList(fileBooks);

    ReadItems rm = new ReadItems();
    ArrayList<Item> magazines = rb.getItemList(fileMagazines);


    public Author getAuthorFromEmail(String email){

        for(Author author: authors){

            if(email==author.getEmail()){
                return author;
            }
        }

        return new Author("","","");
    }


    public String getAuthorListToPrint(String[] authorsEmails){
        String toPrint = "";

        for(String email: authorsEmails){
            toPrint = toPrint + getAuthorFromEmail(email).getFirtsName() +" "+ getAuthorFromEmail(email).getLastName() +"\n";
        }

        return toPrint;
    }

    public void printItems(){

        System.out.println("BOOKS INFORMATION"+"\n");

        for(Item book: books){
            System.out.println("Title: " + book.getTitle()+"\n");
            System.out.println("   ISBN: " + book.getIsbn()+"\n");
            System.out.println("   Authors: " + getAuthorListToPrint(book.getAuthorsEmails()) +"\n");
            System.out.println("   Number of Authors: " + book.getAuthorsEmails().length +"\n");
        }

        System.out.println("MAGAZINES INFORMATION"+"\n");

        for(Item magazine: magazines) {
            System.out.println("Title: " + magazine.getTitle() + "\n");
            System.out.println("   ISBN: " + magazine.getIsbn() + "\n");
            System.out.println("   Authors: " + getAuthorListToPrint(magazine.getAuthorsEmails()) +"\n");
            System.out.println("   Number of Authors: " + magazine.getAuthorsEmails().length +"\n");
        }
    }
}
