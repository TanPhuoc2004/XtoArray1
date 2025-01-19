/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Admin
 */
public class cau10 {
    int[] array = {1, 2, 3, 4, 5}; 
        int evenCount = 0, oddCount = 0;  

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;  
            } else {
                oddCount++;  
            }
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
