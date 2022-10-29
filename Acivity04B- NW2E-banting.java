package dsaa;

import java.util.Scanner;

public class Acivity04B { 
    static int num;
        public static void main(String[] args)	{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter length of an array:");
            int m = Integer.parseInt(sc.next());
            int[] n = new int[m];
            System.out.println("Enter all the "+ m +" elements:"); 
            for(int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
            }
            int choice;
            System.out.println("Please Choose an option\n"); 
            System.out.println("(1) Insert a value "); 
            System.out.println("(2) Delete a value "); 
            System.out.println("(3) Traverse array "); 
            System.out.println("(4) Exit ");
            System.out.println("Enter your choice: "); 
            choice = sc.nextInt();
                   switch (choice)
            {
            case 1:
            System.out.println("Enter location index: "); 
            int loc = sc.nextInt(); System.out.println("Enter value to insert: "); 
            int val = sc.nextInt();

            for(int x = n.length-1; 
                    x>loc; x--){ n[x] = n [x-1];
            }
                    n[loc] = val;
            System.out.println("After inserting: "); 
                    for(int a:n){
            System.out.println(a);
            }
 
                break;

            case 2:
            System.out.println("Enter index location to delete: ");
                int dlts = sc.nextInt();
                for(int y = dlts; y<n.length-1; y++){ n[y] = n[y+1]; 
            System.out.println(n[y]);
            }
            break;

            case 3:
            System.out.println("Traverse array: "); 
                for(int z = 0; 
                        z<n.length; z++){
            System.out.println(n[z]);
            }
                
                break;

            case 4: System.out.println("Finish");

                break;

        }
    }
}
