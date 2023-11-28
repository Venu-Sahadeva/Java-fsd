package com;
import java.util.Scanner;
public class EmailSearchProgram {
	public static void main(String[] args) {

	 // Array of email IDs
    String[] employeeEmails = {
        "sahadeva.doe@example.com",
        "jenni.smith@example.com",
        "aditya.jones@example.com",
        // Add more email IDs as needed
    };

    // Get user input for the email to search
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the email to search");
    		String searchEmail = scanner.nextLine();

            // Perform the search
            boolean found = false;
            for (String email : employeeEmails) {
                if (email.equals(searchEmail)) {
                    found = true;
                    break;
                }
            }

            // Display the result
            if (found) {
                System.out.println("Email found in the array.");
            } else {
                System.out.println("Email not found in the array.");
            }
        }
    }



