package org.echocat.kata.java.part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by juanorduz on 01.06.17.
 */
public class ReadAuthors {

    String separator = ";";
    String file = "/Users/juanorduz/java-kata-1/src/main/resources/org/echocat/kata/java/part1/data/authors.csv";

    public ArrayList<Author> getAuthorList(){

        BufferedReader br = null;

        ArrayList<Author> authorsList = new ArrayList<Author>();

        try{

            br = new BufferedReader(new FileReader(file));

            String line = "";

            br.readLine();

            while ((line = br.readLine()) != null){

                String[] authorDetails = line.split(separator);

                Author author = new Author(authorDetails[0], authorDetails[1], authorDetails[2]);

                authorsList.add(author);
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

            return authorsList;
        }
    }
}
