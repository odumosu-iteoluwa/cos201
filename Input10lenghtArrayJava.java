/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.input10lenghtarray.java;

/**
 *
 * @author User
 */
import java.util.Arrays;
import java.util.Scanner;

public class Input10lenghtArrayJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[10];

        System.out.println("You will enter 10 numbers of your choice.");

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number for position [" + i + "]: ");
            inputArray[i] = scanner.nextInt();
        }

        System.out.println("\nHere is the array of numbers you entered:");
        System.out.println(Arrays.toString(inputArray));

        scanner.close();
    }
}