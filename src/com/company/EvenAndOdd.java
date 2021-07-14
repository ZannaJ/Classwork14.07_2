package com.company;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        // 3rd Task:
        // Write 2 methods.
        // - They both return boolean.
        // - one checks for odd numbers.
        // - another checks for even numbers.
        // Then use these methods in your main method to check if a value
        // entered by the user is even or odd.

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number.
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Get the number

        // Use the methods defined below to check if the number is
        // even or odd.
        if (isEven(number)) {
            System.out.println(number + " is even");
        }

        if (isOdd(number)) {
            System.out.println(number + " is odd");
        }


    }

    private static boolean isEven(int number) {
        return number % 2 == 0; // The remainder of division by 2 is 0(even)
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0; // The remainder of division by 2 is not 0(odd)
    }
}
