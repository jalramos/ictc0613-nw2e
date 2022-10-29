package act04b_nw2e_vigayan;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Act04B_NW2E_Vigayan {

    private static void AddElement(Integer[]arr, int element, int position){
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(position -1, element);
        arr = list.toArray(arr);
        
        System.out.print(element + " inserted at position " + position + ";\n" + Arrays.toString(arr));
}
public static void main(String[] args) {
     int element;
     Integer[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
     Scanner scan = new Scanner (System.in);
     
     System.out.println("These are the Options: ");
     System.out.println("1 - Insert a value \n" + "2 - Delete a value \n" + "3 - Traverse array \n" + "4 - Exit the program \n");
     
     System.out.print("Enter your desired operation here: ");
     int op = scan.nextInt();

     switch(op){
        case 1:
            System.out.print("Enter element to be inserted here: ");
            element = scan.nextInt(); 
     
            System.out.print("Enter position here: ");
            int position = scan.nextInt();
            
            AddElement(arr, element, position);
            break;
        
        case 2:
            System.out.print("Enter index of element to be deleted here: ");
            element = scan.nextInt();
            
            int[] newArr = new int[arr.length-1];
            
            for(int i=0, n=0; i<arr.length;i++){
            if(i!=element){
                newArr[n]=arr[i];
                n++;
            }
        }
        System.out.println("Before deletion " + Arrays.toString(arr));
        System.out.println("After deletion " + Arrays.toString(newArr));
            break;
        
        case 3:
            System.out.println("This will traverse the array");
            System.out.println("Contents of the array: ");
                for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
      }
            break;
        
        case 4:
            System.out.print("You will exit the program now");
            System.exit(0);
            
        default:
            System.out.println("Invalid input");
            break;
     }  
  }
}
