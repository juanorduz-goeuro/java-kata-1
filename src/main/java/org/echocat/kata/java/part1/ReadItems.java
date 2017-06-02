package org.echocat.kata.java.part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by juanorduz on 01.06.17.
 */
public class ReadItems {

    String separator = ";";
    String fileBooks = "/Users/juanorduz/java-kata-1/src/main/resources/org/echocat/kata/java/part1/data/books.csv";
    String fileMagazines = "/Users/juanorduz/java-kata-1/src/main/resources/org/echocat/kata/java/part1/data/magazines.csv";


    public String[] getAuthorListFromString(String authorString){

        String[] authorList = authorString.split(",");

        return authorList;
    }


    public ArrayList<Item> getItemList(String file){

        BufferedReader br = null;

        ArrayList<Item> itemList = new ArrayList<Item>();

        try{

            br = new BufferedReader(new FileReader(file));

            String line = "";

            br.readLine();

            if(file==fileBooks) {

                while ((line = br.readLine()) != null) {

                    String[] bookDetails = line.split(separator);

                    Book book = new Book("","", null, "");

                    book.setTitle(bookDetails[0]);
                    book.setIsbn(bookDetails[1]);
                    book.setAuthorsEmails(getAuthorListFromString(bookDetails[2]));
                    book.setOther(bookDetails[3]);

                    itemList.add(book);
                }
            }


            else {

                ArrayList<Item> magazineList = new ArrayList<Item>();

                while ((line = br.readLine()) != null) {

                    String[] magazineDetails = line.split(separator);

                    Magazine magazine = new Magazine("","", null, "");

                    magazine.setTitle(magazineDetails[0]);
                    magazine.setIsbn(magazineDetails[1]);
                    magazine.setAuthorsEmails(getAuthorListFromString(magazineDetails[2]));

                    itemList.add(magazine);

                }

            }
        }

        catch(Exception ee){

            ee.printStackTrace();
        }

        finally
        {
            try
            {
                br.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }

            return itemList;
        }

    }
}
