/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class cau2 {
    int[] array = {10, 20, 5, 7, 8};
        
        System.out.println("Array: " + Arrays.toString(array));

        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

