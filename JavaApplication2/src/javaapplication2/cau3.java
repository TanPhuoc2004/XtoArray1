/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
/**
 *
 * @author Admin
 */
public class cau3 {
    int[] array = {1, 2, 3, 2, 1};
        
        System.out.println("Array: " + Arrays.toString(array));
        
        boolean isPalindrome = checkPalindrome(array);
        
        System.out.println("Is Palindromic: " + isPalindrome);
    }

    // Method to check if the array is a palindrome
    public static boolean checkPalindrome(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    
}
