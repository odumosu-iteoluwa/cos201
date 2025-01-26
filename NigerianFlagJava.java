/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nigerianflag.java;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class NigerianFlagJava {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Input the height of the flag: ");
        int height = myScanner.nextInt();

        for (int i = 0; i < height; i++) {
            System.out.println("*****=====*****");
        }

        System.out.println();

        printFixedFlag();

        myScanner.close();
    }

    public static void printFixedFlag() {
        int height = 8;
        int width = 12;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j >= 4 && j < 8) {
                    System.out.print("=");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}