package act04b_nw2e_trinidad;

import java.util.Arrays;
import java.util.Scanner;
public class Act04B_nw2e_trinidad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your choice of array size: ");
        int arrays = input.nextInt();
        
        int arr[] = new int[arrays];
        
        System.out.print("Enter your choice of array elements: ");
        for( int i = 0; i<arrays; i++){
            arr[i] = input.nextInt();
        }
         System.out.println("1 to Insert the element");
         System.out.println("2 to Delete the element");
         System.out.println("3 to Traverse the array");
         System.out.println("4 to Quit the Program");
         int choice = input.nextInt();
         
         switch(choice){
             case 1:
                 int n = arr.length;
                 int newArr[] = new int[n+1];
                 
                 System.out.print("Enter the value want to Insert: ");
                 int insert = input.nextInt();
                 
                 for(int i = 0; i<n; i++){
                     newArr[i] = arr[i];
                 }
                 newArr[n] = insert;
                 System.out.println(Arrays.toString(newArr));
                 
                 if(arr.length == 0) {
                     System.out.println("Array is Empty");
                 } else {
                     System.out.println("Array is Full");
                 }
                 break;
                 
             case 2: 
                 System.out.print("Enter the array location you want to Delete: ");
                 int location = input.nextInt();
                 
                 for(int i=location; i<arrays-1; i++){
                     arr[i] = arr[i+1];
                     
                 }
                 arrays--;
                 for(int i=0; i<arrays; i++){
                     System.out.println(arr[i] + " ");
                 }
                 if(arr.length == 0) {
                     System.out.println("Array is Empty");
        
       
                 break;
                 
             case 3: 
                 System.out.println("Elements of Array:");
                 
                 for(int i =0; i<arr.length; i++){
                     System.out.println(arr[i]);
                 }
                 if (arr == null){
                     System.out.println("Array is Empty");
                 }else{
                     System.out.println("Array is Full");
                 }
                 break;
                 
             case 4: 
                 System.out.println("Than you for using my program!!!");
                 break;
         }
    }
    
}