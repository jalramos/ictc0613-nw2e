/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity04b_nw2e_villanueva;

/**
 *
 * @author user
 */
import java.util.*;
public class Activity04B_NW2E_Villanueva {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Array Size: ");
        int size = input.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("Enter Array Elements: ");
        for( int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }
         System.out.println("Enter 1 to INSERT element | Enter 2 to DELETE element | Enter 3 to TRAVERSE array | Enter 4 to exit");
         int choice = input.nextInt();
         
         switch(choice){
             case 1:
                 int n = arr.length;
                 int newArr[] = new int[n+1];
                 
                 System.out.print("Enter the value that you want to insert: ");
                 int insert = input.nextInt();
                 
                 for(int i = 0; i<n; i++){
                     newArr[i] = arr[i];
                 }
                 newArr[n] = insert;
                 System.out.println(Arrays.toString(newArr)); 
                 
                  if (arr == null){
                     System.out.print("The array is empty!");
                 }else{
                     System.out.print("The array is full!");
                 }
                 
                 
                 
                 break;
                 
             case 2: 
                 System.out.print("Enter array location want to delete: ");
                 int location = input.nextInt();
                 
                 for(int i=location; i<size-1; i++){
                     arr[i] = arr[i+1];
                     
                 }
                 size--;
                 for(int i=0; i<size; i++){
                     System.out.println(arr[i] + " ");
                 }
                 if (arr == null){
                     System.out.print("The array is empty!");
                 }else{
                     System.out.print("The array is full!");
                 }
                 
                 
                 
                 break;
                 
             case 3: 
                 System.out.println("Contents of Array:");
                 
                 for(int i =0; i<arr.length; i++){
                     System.out.println(arr[i]);
                 }
                   if (arr == null){
                     System.out.print("The array is empty!");
                 }else{
                     System.out.print("The array is full!");
                 }
                 
                 
                 break;
                 
                 
             case 4: 
                 break;
         }
    }
    
}
