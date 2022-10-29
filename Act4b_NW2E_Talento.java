package act4b_nw2e_talento;

import java.util.*;
public class Act4b_NW2E_Talento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter size of the array: ");
       int length = input.nextInt();
       
       int array[] = new int [length];
       
       System.out.println ("Enter the Elements of The Array");
       for (int i=0; i<length; i++){
           array[i] = input.nextInt();
       } 
       System.out.println("Enter 1 to Insert element");
       System.out.println("Enter 2 to Delete element");  
       System.out.println("Enter 3 to Traverse element");
       System.out.println("Enter 4 to Exit");
       
       int choice = input.nextInt();
      
       switch(choice){
           case 1:
               int n = array.length;
               int newArray[] = new int [n+1];
              
               System.out.print("Enter the value you want to insert: ");
               int insert = input.nextInt();
               
               for(int i = 0; i<n; i++ ){
                   newArray[i] = array[i];
               }
               newArray [n] = insert;
               
               System.out.println(Arrays.toString(newArray));
               
               if(array.length == 0 ){
                   System.out.print ("Empty");
               }else{
                   System.out.print ("Full");
               }
               break;
               
           case 2:
               System.out.print("Enter the location of the array you want to delete: ");
               int loc = input.nextInt();
               
               for (int i=loc; i<length-1; i++){
                  array[i] = array[i+1];
               }
               length--;
               for(int i=0; i<length; i++){
                   System.out.println(array[i] + "");
               }
               if (array.length==0){
                   System.out.println("Empty");
               }else{
                   System.out.println("Full");
               }
               break;
               
           case 3:
               System.out.println("The Elements of Array:");
                 
                 for(int i =0; i<array.length; i++){
                     System.out.println(array[i]);
                 }
                   if (array == null){
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
