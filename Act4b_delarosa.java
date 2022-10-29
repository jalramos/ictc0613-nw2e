
package act4b_delarosa;

import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Scanner;
public class Act4b_delarosa {

  public int [] insert (int size, int [] array, int v ){
      int narr[] = new int [size + 1];
      for (int i = 0; i<size; i++)
          narr[i] = array[i];
          narr[size] = v;
          System.out.println("Output: " + Arrays.toString(narr));
          return narr;
          
      }
      
      public int[] findLocationDelete(int[] arr, int index){
          if (arr == null || index < 0 || index >= arr.length){
              return arr;
          }
          return IntStream.range(0, arr.length)
                  .filter(i -> i !=index)
                  .map(i-> arr[i])
                  .toArray();
                  }
      
      public int[] transarr(int[]arr)
      {
          System.out.print("Array is: ");
                
                if(arr.length == 0){
                    System.out.println(" empty");
                }
                else{
                    System.out.println(" not empty");
                }
                return arr;
            }
      
      
      
          
    public static void main(String[] args) {
        
        Act4b_delarosa exobj = new Act4b_delarosa();
        Scanner s = new Scanner(System.in);
        System.out.print("Input size of Array: ");
        int size = s.nextInt();
        int arr[] = new int [size];
    System.out.print("Enter value for Array: ");
    
    for(int i = 0; i<size; i++){
        arr[i] = s.nextInt();
    }
        
        System.out.println("List of options: ");
        System.out.println("1. Insert a value" + "\n" + "2. Delete a value" + "\n" + "3.Transverse array" + "\n" + "4. Exit");
        System.out.println("Choose an operation to be executed: ");
        int choice = s.nextInt();
        
        
        
        
        
        switch(choice){
            case 1: 
                System.out.print("Enter a value to be inserted: ");
                int v = s.nextInt();
                arr = exobj.insert(size,arr,v);
                    
                break;
            
            case 2:
                System.out.println("Enter the number of index to delete: ");
                int index= s.nextInt();
                arr = exobj.findLocationDelete(arr, index);
                System.out.println("Output: " + Arrays.toString(arr));
            
                break;
                
            case 3:
                System.out.println("The Array contains: " + Arrays.toString(arr));
                arr = exobj.transarr(arr);
                break;
                
            case 4:
                System.out.println("User chose to exit the program");
                System.exit(0);
                
            default:
                System.out.print("Invalid Input");
                break;
        }
      }
    }


   
