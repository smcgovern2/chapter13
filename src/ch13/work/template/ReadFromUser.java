package ch13.work.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromUser extends BookReader{


    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);



    @Override
    void initialize() {
        System.out.println("Write a line of your book, then hit enter. Repeat as desired. Enter a blank line to end");
    }

    @Override
    void startReading() {
        ArrayList bookLines = new ArrayList();
        String toAdd = "\n";
        while(!toAdd.equals("")){
            try {
                toAdd = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            bookLines.add(toAdd);
        }
        this.stopReading();

    }

    @Override
    void stopReading() {
        System.out.println("You have finished writing.");
    }


    @Override
    public boolean isInteractive(){return true;}
}
