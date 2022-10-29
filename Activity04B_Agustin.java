package activity04b_agustin;
import java.util.*;
public class Activity04B_Agustin {
    
    public static int[] findLocationDelete(int array [], int position){
        
        //Check if the position entered is Empty
        if (position < 0 || position >= array.length) {
            System.out.println("The position of this array is empty");
            return array;
        }
        
        // Create another array of size one less and copy the elements except the index
        int[] Array2 = new int[array.length - 1];
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == position) {
                continue;
            }
            Array2[k++] = array[i];
        }
            //Return the position of the array to Traverse
        return Array2;
    }
    
    public static void main(String[] args) {
        //Scanner
        Scanner scan = new Scanner(System.in);
        
        //boolean for re-run program
        boolean ans;
        
        do {
            
            ans = true;
            //boolean for menu
            boolean loop = false;
            
            //Start
            System.out.println("Activity Sheet 04B: Implementation of Array Operations using Java\n");

            //Input Array Size
            int array_size;
                do {
                System.out.print("Enter Array Size(Less than / Equal 0 is invalid): ");
                    array_size = scan.nextInt();
                } while (array_size <= 0);
                int array[] = new int[array_size];

            //boolean for the status of array (Empty or not)
            boolean status = false;

                do {
                    // Main menu
                    System.out.print("\n1. Insert a value\n2. Delete a value\n3. Traverse array\n4. Exit\n");
                    System.out.print("Select your activity: ");
                    int num2 = scan.nextInt();
                    switch (num2){
                        case 1: //Enter value for array
                            for (int i = 0; i < array.length; i++ ){ //check if the array is empty
                                status = array[i] != 0;
                            }
                            if (status == false){
                                System.out.println("\nThe array is empty!");
                                System.out.println("Please insert a value, 0 is consider as null");
                                System.out.println("Array size is: ["+array_size+"]\n");
                                     for (int i = 0; i < array_size; i++ ){
                                             System.out.print("Enter a value for ["+i+"]: ");
                                             array[i] = scan.nextInt();
                                     }
                            } else {
                                System.out.println("\nThe array is full!");}
                            break;

                        case 2: //Delete a value to specific position in array
                            for (int i = 0; i < array.length; i++ ){ //check if the array is empty
                                status = array[i] != 0;
                            }
                            if (status == true){
                                System.out.println("\nDelete a value");
                                System.out.println("Array size is: ["+array_size+"]\n");
                                System.out.print("Enter position you want to delete(starting 0): ");
                                    int position = scan.nextInt();
                                    array = findLocationDelete(array, position);
                                    System.out.println("Position of ITEM to be remove: " + position);
                            } else {
                                System.out.println("\nThe array is empty please insert a value");}
                            if (array.length == 0){
                                System.out.println("\nRemaining item/s in Array: "+ Arrays.toString(array));
                                System.out.print("All values are deleted, Do you want to start the program again[Y/N]: ");
                                    String answer = scan.next();
                                    if ("Y".equals(answer) || "y".equals(answer)){
                                        ans = false;
                                        loop = true;
                                        System.out.print("\n\n\n\n\n");}
                                    else {System.exit(0);}
                                }
                            break;

                        case 3: //Display all the remaining value in array
                            for (int i = 0; i < array.length; i++ ){ //check if the array is empty
                                status = array[i] != 0;
                            }
                            if (status == true){
                                System.out.println("\nTraverse array");
                                System.out.println("Remaining item/s in Array: "+ Arrays.toString(array));
                            } else {
                                System.out.println("\nThe array is empty please insert a value");}
                            break;

                        case 4: // Exit the program
                            System.exit(0);
                            break;

                         default:
                            System.out.println("Enter a number between 1-4");
                            break;
                    }
                } while (loop == false);
      } while (ans == false);
    }
}