
package Week04;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class act04B_NW2E_Salazar 
{
    public act04B_NW2E_Salazar(){
        System.out.println("Good Day!\n");
}
    public int [] Add(int size, int [] array, int x){
        int newarray[] = new int [size + 1];
        for (int i = 0; i<size; i++)
            newarray[i] = array[i];
            newarray[size] = x;
            System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(newarray));
            return newarray;
    }
    public int [] findlocationDelete(int [] array, int index){
        if (array == null || index < 0 || index >= array.length){
            return array;
        }
        return IntStream.range(0, array.length)
                .filter(i -> i !=index)
                .map(i -> array[i])
                .toArray();
        
    }
    public int [] traversearray(int [] array)
    {
        System.out.print("\nThe Array is: ");
        
        if(array.length == 0) {
            System.out.print("Empty");
        } else {
            System.out.print("Full");
        }
         return array;
    }
       
    
        public static void main (String [] args){
        Scanner io = new Scanner(System.in);
        act04B_NW2E_Salazar exobj = new act04B_NW2E_Salazar();
        System.out.print("Enter the size of Array: ");        
        int size = io.nextInt();      
        int array[]= new int [size];
        System.out.print("Input values for Array one by one: ");
        
        for (int i = 0; i<size; i++){
            array[i] = io.nextInt();
        }
        System.out.println("Contents of Array are \n" + Arrays.toString(array));
        int choice;
        System.out.println("Pick a number you want to do with the Array?\n");
        System.out.println("1 Insert a value");
        System.out.println("2 Delete a value");
        System.out.println("3 Traverse array");
        System.out.println("4 Exit");
        choice = io.nextInt();
        
        switch (choice){
            
            case 1:
                System.out.println("Initial Array:\n" + Arrays.toString(array));
                System.out.print("Value to be added:");
                int x = io.nextInt();
                array = exobj.Add(size, array, x);
                array = exobj.traversearray(array);
                break;
            case 2:
                System.out.println("Original Array: " + Arrays.toString(array));
                System.out.print("Enter the index number you want to delete: ");
                int dex = io.nextInt();
                array = exobj.findlocationDelete(array, dex);
                System.out.println("Resultant Array: " + Arrays.toString(array));
                array = exobj.traversearray(array);
                break;
            case 3:
                System.out.println("Contents of the array: " + Arrays.toString(array));
                array = exobj.traversearray(array); 
                break;            
            case 4:
                System.out.println("Have a Nice Day!!!");
                break;
                
            default:
                System.out.println("Invalid Choice Try Again!");
                break;
        }
                
        
        
        
    }    
}