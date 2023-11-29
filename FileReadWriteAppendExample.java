import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteAppendExample {
    private static final String FILE_PATH = "example.txt";

    public static void main(String[] args) {
        // Writing to a file
        writeToFile("Hello, this is a sample text.");

        // Reading from the file
        readFromFile();

        // Appending to the file
        appendToFile("\nThis line is appended to the file.");

        // Reading again after appending
        readFromFile();
    }

    private static void writeToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(content);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile() {
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

    private static void appendToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(content);
            System.out.println("Content appended to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

