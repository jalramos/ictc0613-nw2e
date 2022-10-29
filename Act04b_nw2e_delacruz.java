package act04b_nw2e_delacruz;

import java.util.Scanner;
import java.util.Arrays;
public class Act04b_nw2e_delacruz {

    
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        
        System.out.print("Enter Array Size: ");
        int Arrsize = input.nextInt();
        
        int arr[] = new int[Arrsize];
        
        System.out.println("ENTER ARRAY ELEMENTS: ");
        for( int i = 0; i<Arrsize; i++){
            arr[i] = input.nextInt();
        }
        
System.out.println("It's a Wonderful Day! ");
        
        System.out.println("ENTER 1 TO INSERT ELEMENT | ENTER 2 TO DELETE ELEMENT | ENTER 3 TO TRAVERESE ARRAY | ENTER 4 TO EXIT");
         int choice = input.nextInt();
         
         
             switch (choice){
             case 1:
                     int n = arr.length;
                     int newArr[]  =new int[n+1];
                     
              System.out.print("INSERT A VALUE YOU WANT TO ENTER: ");
              int insert = input.nextInt();
              
              for(int i = 0; i<n; i++){
                  newArr[i] = arr[i];
              }
              newArr[n] = insert;
              System.out.println(Arrays.toString(newArr));
              
              if(arr == null){
                  System.out.println("IT IS AN EMPTY ARRAY:(");
              }else{
                  System.out.println("THIS ARRAY IS FULL:)");
              }
              break;
             case 2:
                 System.out.print("ENTER ARRAY LOCATION YOU WANT TO DELETE: ");
                 int location = input.nextInt();
                 
                 for(int i = location; i<Arrsize-1; i++){
                     arr[i] = arr[i+1];
                 }
                 Arrsize--;
                 for(int i=0; i<Arrsize; i++){
                     System.out.print(arr[i] + "");
                 }
                 if(arr == null){
              System.out.println("IT IS AN EMPTY ARRAY:(");
                 }else{
                     System.out.println("THIS ARRAY IS FULL:)!"); 
         }
             case 3:
                 System.out.println("CONTENTS OF ARRAY: ");
                 
                 for(int i = 0; i<arr.length; i++){
                     System.out.print(arr[i]);
                     
                     if(arr == null){
                         System.out.println("IT IS AN EMPTY ARRAY:(");
                    }else{
                         System.out.println("THIS ARRAY IS FULL:)");
                     }
                 }
             case 4:
                 break;
    }
    
    }
}
