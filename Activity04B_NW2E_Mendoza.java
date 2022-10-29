package activity04b_nw2e_mendoza;
import java.util.*;
public class Activity04B_NW2E_Mendoza {

  public static void insert(){
     int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        a = scan.nextInt();
        int array[] = new int[a+1];
        System.out.println("Enter Element");
        for(int i = 0; i < a; i++)
        {
            array[i] = scan.nextInt();
        }
        System.out.print("Enter the element which you want to insert: ");
        b = scan.nextInt();
        array[a] = b;
        System.out.println("After inserting: ");
        for(int i = 0; i <a; i++)
        {
            System.out.print(array[i]+"\n");
        }
        scan.close();
        System.out.println(array[a]); 
  }
  
  public static void delete(){
     
        int a, b,i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        a = scan.nextInt();
        int array[] = new int[a];
        System.out.println("Enter Element");
        for(i = 0; i < a; i++)
        {
            array[i] = scan.nextInt();
        }
        System.out.print("Enter the index of the element that you want to be deleted: ");
        b = scan.nextInt();
        System.out.println("\nElement to be deleted at index: "+ b); 
 
        int[] copyArr = new int[array.length - 1]; 
        
        System.arraycopy(array, 0, copyArr, 0, b); 
 
        System.arraycopy(array, b + 1, copyArr, b, array.length - b - 1); 
        scan.close();
        System.out.println("Array after deleting an element: "+ Arrays.toString(copyArr));  
  }
  
  public static void traverse(){
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        a = scan.nextInt();
        int array[] = new int[a+1];
        System.out.println("Enter Element");
        for(int i = 0; i < a; i++)
        {
            array[i] = scan.nextInt();
        }
        System.out.print("Elements in Array are:\n");
        for(int i = 0; i < a; i++)
        {
            System.out.print(array[i]+" ");
        }
        scan.close();
  }
  
  public static void exit(){
      System.out.println("Thank you for using the program.");
  }
  
  public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);
      System.out.print("\nChoose your options:");
      System.out.println("\n1. Insert");
      System.out.println("2. Delete"); 
      System.out.println("3. Traverse");
      System.out.println("4. Exit");
      System.out.print("\nEnter operations: ");
      int choices = scan.nextInt();
      System.out.println();
      switch(choices){
          case 1:
              insert();
              break;
          case 2:
              delete();
              break;
          case 3:
              traverse();
              break;
          case 4:
              exit();
              break;
          default:
              System.out.println("Error: Please re-run the program and choose number 1-4 only, Thank you!");
             
      }
  }
}
