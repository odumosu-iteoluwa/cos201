/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dimensionalarray.java;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class DimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[10][10]; // Create a 10x10 array

        System.out.println("Enter numbers for a 10x10 array:");

        // Fill the array with user input
        for (int i = 0; i < 10; i++) { // Loop through rows
            for (int j = 0; j < 10; j++) { // Loop through columns
                System.out.println("Enter a number for position [" + (i + 1) + "][" + (j + 1) + "]:");
                array[i][j] = scanner.nextInt(); // Store input in the array
            }
        }

        // Print the array
        System.out.println("Here is the 10x10 array you entered:");
        for (int i = 0; i < 10; i++) { // Loop through rows
            for (int j = 0; j < 10; j++) { // Loop through columns
                System.out.print(array[i][j] + " "); // Print each number with a space
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close(); // Close the scanner
    }
}