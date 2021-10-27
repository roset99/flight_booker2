package com.flightbookings.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DeleteFromFile {
    public void deleteFromFile(File file, FileInput fileInput){
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String scanLine = scanner.nextLine();
                if (scanLine.equals(fileInput.toString())) {
                } else{
                    printWriter.println(scanLine);

                }
            }
            printWriter.flush();
            printWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
