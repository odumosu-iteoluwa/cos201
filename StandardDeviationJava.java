/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.standarddeviation.java;

/**
 *
 * @author User
 */
import java.util.Arrays;

public class StandardDeviationJava {
    public static void main(String[] args) {
        int[] dataArray = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        double mean = getMean(dataArray);
        System.out.println("Mean: " + mean);

        double median = getMedian(dataArray);
        System.out.println("Median: " + median);

        double standardDeviation = getStandardDeviation(dataArray, mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    public static double getMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double getMedian(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            return array[length / 2];
        }
    }

    public static double getStandardDeviation(int[] array, double mean) {
        double sumSquaredDifferences = 0;
        for (int num : array) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / array.length);
    }
}