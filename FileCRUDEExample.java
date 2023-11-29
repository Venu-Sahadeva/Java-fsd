package com;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCRUDEExample {
    private static final String FILE_PATH = "example.txt";

    public static void main(String[] args) {
        // Create a file
        createFile();

        // Read from the file
        readFile();

        // Update the file
        updateFile();

        // Read again after update
        readFile();

        // Delete the file
        deleteFile();
    }

    private static void createFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write("Hello, this is a sample file.");
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            System.out.println("\nReading from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void updateFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.newLine(); // Move to the next line
            writer.write("This line is added for the update.");
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteFile() {
        File file = new File(FILE_PATH);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
		
}


