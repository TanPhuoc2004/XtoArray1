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
public class cau7 {
   int[] array = {12, 35, 1, 10, 34, 1};  // Mảng đầu vào
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

      
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

      
        System.out.println("Lớn thứ hai: " + secondLargest);
    } 
