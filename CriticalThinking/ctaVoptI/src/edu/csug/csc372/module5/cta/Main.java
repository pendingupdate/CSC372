package edu.csug.csc372.module5.cta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final ArrayList<String> FIVENUMBERS = new ArrayList<>(Arrays.asList("first", "second", "third", "fourth", "fifth"));

    public static void main(String[] args) {
        // Stores userNumbers in nums for product() parameter
        ArrayList<Integer> nums = getNumbers();
        System.out.printf("\nThe product of your numbers is: %d.%n", product(nums, 0));
    }

    public static ArrayList<Integer> getNumbers() {
        Scanner scan = new Scanner(System.in);
        // userNumbers will store five numbers from user
        ArrayList<Integer> userNumbers = new ArrayList<>();

        for (String number : FIVENUMBERS) {
            // Loops through try catch for each input until valid input is entered
            while (true) {
                try {
                    // Prompts user for a number
                    System.out.printf("\nPlease enter %s number: ", number);
                    // Adds user's number to userNumbers arraylist
                    userNumbers.add(scan.nextInt());
                    break; // Exits the while loop if input is valid
                } catch (java.util.InputMismatchException e) {
                    // Error message if user enters non-integer
                    System.out.println("Invalid input. Please enter an integer.");
                    scan.next(); // Clears scan for next try from user
                }
            }
        }

        scan.close();
        System.out.println("\nYour numbers: " + userNumbers);
        return userNumbers;
    }

    // product() is recursive method
    public static int product(ArrayList<Integer> nums, int index) {
        // Base case: ends recursion when product of all numbers in arraylist is calculated
        if (index == nums.size()) {
            return 1; // Multiplies final list item by one
        }
        return nums.get(index) * product(nums, index + 1); // Recursive case
    }


}