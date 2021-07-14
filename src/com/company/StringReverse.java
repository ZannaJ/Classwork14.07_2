package com.company;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        // 2nd Task:
        // String Reversal
        // - Allow the user to enter a string,
        // - Interactively Print out the string in reverse.
        // e.g egg - gge, jade is a boy - yob a si edaj

        // Initialize the scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string.
        System.out.print("Enter a string: ");
        String value = scanner.nextLine(); // The next() only takes in one word. \n

        // Initialize a new string to hold the value of the reverse.
        String reverseString = "";

        // Start counting from the last element in the string
        // and move towards the first element.
        for (int i = value.length() - 1; i >= 0; i--) {
            reverseString += value.charAt(i);
        }

        // Log the output to the console.
        System.out.println(reverseString);
    }

}