package org.example;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age in years: ");
        int userAge = scanner.nextInt();
        int yearsUntil100 = 100 - userAge;
        System.out.println("You have " + yearsUntil100 + " years until you reach 100 years old.");
    }
}
