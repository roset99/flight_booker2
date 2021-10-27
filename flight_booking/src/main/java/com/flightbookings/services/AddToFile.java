package com.flightbookings.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AddToFile {

    public void addToFile(File file, FileInput fileInput){
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(fileInput);

            printWriter.flush();
            printWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
