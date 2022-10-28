/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity4b_nw2e_macayan;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SasamiyaSaya
 */
public class Activity4B_NW2E_Macayan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = { 10,20,30,40,50 }; 
  
        System.out.println("Original Array: " + Arrays.toString(intArray)); 
 
        System.out.print("Enter index array you want to remove");
        int index = sc.nextInt();
        System.out.println("Element to be deleted at index: " + index); 
       
       int[] copyArray = new int[intArray.length - 1]; 
 
        
        System.arraycopy(intArray, 0, copyArray, 0, index); 
 
        System.arraycopy(intArray, index + 1, copyArray, index, intArray.length - index - 1); 
 
        System.out.println("Array after deleting an element: "
                           + Arrays.toString(copyArray)); 
      
    switch (intArray.length) { 
 
    default: System.out.println("array limit: 4"); 
    break;}
    }
    
}
