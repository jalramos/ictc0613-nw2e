package Act04B_NW2E_Cruz;

import java.util.Scanner;
import java.util.Arrays;
public class Act04B_NW2E_Cruz {
    public int findLocationDelete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of value you like to delete: ");
        int del= sc.nextInt();
        return del;
            
    }
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        Act04B_NW2E_Cruz obj = new Act04B_NW2E_Cruz();
        System.out.println("Enter array size");
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the number of the option to choose:\n"
                + "1. Insert a value\n"
                + "2. Delete a value\n"
                + "3. Traverse array\n"
                + "4. Exit");
        int option = sc.nextInt();
        int value;
        int index;
        switch(option){
            case 1: 
                System.out.println("Enter a value: ");
                value=sc.nextInt();
                System.out.println("Enter index");
                index=sc.nextInt();
                arr[index]= value;      
                    break;
            case 2: 
                int b = obj.findLocationDelete();
                
                int Arr2[]= new int[arr.length-1];
                    for(int i=0, k=0; i<arr.length; i++){
                        if(i!=b){
                            Arr2[k]=arr[i];
                            k++;
                        }
                    }
                    System.out.println("After deleting index:"+b+" "+ Arrays.toString(Arr2));
                    break;
            case 3:
                System.out.println("Elements of the array:");
                    for(int i=0; i<arr.length; i++){
                        System.out.print(arr[i] +" ");
                    }
                    break;
            case 4:
                System.out.println("You are about to exit, Thank You!");
                System.exit(0);
                    break;
            default:
                System.out.println("Invalid number");
                    break;
        }
                  
    }
}
