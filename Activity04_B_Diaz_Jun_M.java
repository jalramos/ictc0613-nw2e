
package activity04_b_diaz_jun_m;
import java.util.Scanner;

public class Activity04_B_Diaz_Jun_M {

    public static void main(String[] args) {
        
        int value=1;
        int check;
         int lengthofArray,element;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter length of an array:");
         lengthofArray = sc.nextInt();
         int arr[] = new int[lengthofArray+1];
         System.out.println("Enter "+lengthofArray+" elements:");
         for(int i = 0; i < lengthofArray; i++)
        {
            arr[i] = sc.nextInt();
        }
         
         System.out.println("Press the corresponding number based on what do you want to do about this Program..."+"\n");
         System.out.println("Press 1 - Insert again another value"+"\n"+"Press 2 - Delete a value"+"\n"+"Press 3 - Traverse array"+"\n"+"Press 4 - Exit the program"+"\n");
         
                Scanner input = new Scanner (System.in);
                System.out.println("Enter the number here to perform the operation:");
                value = input.nextInt();
         
             switch (value){
             case 1:
                 // inserting value to the array
                 System.out.print("Enter the element which you want to insert:");
                     element = sc.nextInt();
                //Reached last element of array
                     arr[lengthofArray] = element;
                     System.out.print("After inserting : ");
                     for(int i = 0; i <lengthofArray; i++)
                     {
                         System.out.print(arr[i]+",");
                     }
                    System.out.print(arr[lengthofArray]);
                  break;
              case 2:
                  
                  //deleting value to the array
                  System.out.println("Enter Index of Element to be Deleted");
                  element = sc.nextInt();
 
              /* Move all elements right of index to left by one position */
                for (int i = element; i < lengthofArray - 1; i++) {
                     arr[i] = arr[i + 1];
                     }
                     // decrement size of array
                      lengthofArray--;
                     //display the final array elements after deleting
                     System.out.println("Final Array after deleting the index element that you choose:");
                     for (int i = 0; i < lengthofArray; i++) {
                      System.out.print(arr[i] + "\n");
        }
               break;
    
              case 3:
                  //traverse array method
                     for(int i = 0; i <lengthofArray; i++)
                     {
                     System.out.print(arr[i]+",");
                      }
                       System.out.print(arr[lengthofArray]);
                        break;
              case 4:
                       System.out.println("you exit the program");
                       System.exit(0);
                  break;
                   default:
                  System.out.println("Please select only the available number that pop up on your screen to perform the corresponding operation");
                  break;
         
             }
        
    }
    
}
