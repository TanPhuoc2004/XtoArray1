/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Admin
 */
public class cau11 {

        System.out.print("Prime numbers: ");
        
        for (int num : array) {
            if (isPrime(num)) {
                System.out.print(num + " "); 
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {  
            if (num % i == 0) {
                return false;  
            }
        }

        return true; 
    
}
