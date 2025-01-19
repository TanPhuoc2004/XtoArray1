/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Arrays;
import java.util.LinkedHashSet;
/**
 *
 * @author Admin
 */
public class cau4 {
     int[] array = {1, 2, 2, 3, 4, 4, 5};
        
        System.out.println("Original Array: " + Arrays.toString(array));
        
        int[] result = removeDuplicates(array);
        
        System.out.println("Array without Duplicates: " + Arrays.toString(result));
    }

    
    public static int[] removeDuplicates(int[] array) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

