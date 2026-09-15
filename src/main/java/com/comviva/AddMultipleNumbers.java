package com.comviva;

import java.util.Scanner;

/**
 * A program to add multiple numbers
 */
public class AddMultipleNumbers {

    /**
     * Method to add multiple numbers
     * @param numbers array of numbers to add
     * @return sum of all numbers
     */
    public static int addNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * Method to add multiple numbers (double version)
     * @param numbers array of double numbers to add
     * @return sum of all numbers
     */
    public static double addNumbers(double[] numbers) {
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * Main method - takes user input and adds multiple numbers
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Add Multiple Numbers ===");
        System.out.print("Enter the count of numbers to add: ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a positive number of numbers.");
            scanner.close();
            return;
        }

        int[] numbers = new int[count];

        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = addNumbers(numbers);

        System.out.println("\n--- Results ---");
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum: " + sum);

        scanner.close();
    }
}
