package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1st task
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Principal: ");
//        double principal = scanner.nextDouble();

//        System.out.println("Rate: ");
//        double rate = scanner.nextDouble();

//        System.out.println("Time in years: ");
//        double time = scanner.nextDouble();

//        double simpleInterest = (principal * rate * time) /100;
//        System.out.println("Simple interest calculator is: " + simpleInterest);

//    }

        String words ="";
        String words2 = "";

        System.out.println("Enter a word: ");
        words = scanner.next();
        for(int i= words.length()-1; i>=0; i--)   {
            words2 = words2 + words.charAt(i);

        }
        System.out.println("The word: " + words + " in reverse order is: " + words2);
    }
}
