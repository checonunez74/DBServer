package com.mixer.testapp;

import com.mixer.raw.FileHandler;
import com.mixer.raw.Person;

public class TestApp {

    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("Dbserver.db");
            fh.add( "John ", 44, " Berlin", " www-444", " This is a description");
            fh.close();


            fh = new FileHandler("Dbserver.db");
            Person person = fh.readRow(0);
            fh.close();

            System.out.println(person);


        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}