package activity04b.nw2e.ramos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Activity04BNW2ERamos {
public static int findLocationDelete(int n){
int[] arr = new int[]{1,3,3,4,5};
        ArrayList<Integer> arr_new = new ArrayList();
        for (int i : arr)
        {
            arr_new.add(i);
        }
        arr_new.remove(n);
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After Deletion:" + arr_new);

return n;
}
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

int nm;
System.out.println("Enter a Number from the Options:");
System.out.println("1. Insert a Value\n");
System.out.println("2. Delete a Value\n");
System.out.println("3. Traverse array\n");
System.out.println("4. Exit/n");
nm = sc.nextInt();
switch (nm) {
  case 1:
    System.out.println("The Item Has been Inserted");
    break;
  case 2:
    int n;
    int[] arr = {1,3,3,4,5};
    System.out.println(Arrays.toString(arr));
    System.out.println("Enter position number to delete");
    n = sc.nextInt();
    findLocationDelete(n);
    break;
  case 3:{
    int[] ar = {1,3,3,4,5};
    System.out.println(Arrays.toString(ar));}
    break;
  case 4:
    System.out.println("Thank you for using my Program");
    break;
}
}
}

    
