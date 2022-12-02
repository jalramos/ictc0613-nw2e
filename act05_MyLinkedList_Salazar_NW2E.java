package Week05;
import java.util.*;

public class act05_MyLinkedList_Salazar_NW2E {
    public static void main(String [] args){
        LinkedList <String> list = new LinkedList <String>();
        Scanner io = new Scanner(System.in);
        System.out.print("How many members' information will be entered?: ");
        int num = io.nextInt();
        for(int i = 0; i<num; i++){
            System.out.print("\nKindly give the information of the member #"+ (i+1)+"\n");
            System.out.print("\nEnter first name: ");
            String fname = io.next();
            System.out.print("Enter middle name: ");
            String mname = io.next();
            System.out.print("Enter last name: ");
            String lname = io.next();
            System.out.print("Enter area code: ");
            int acode = io.nextInt();
            System.out.print("Enter telephone number: ");
            int tnum = io.nextInt();
            System.out.print("Enter gender: ");
            String gend = io.next();
            System.out.print("Enter age: ");
            int age = io.nextInt();
            
            list.add("Welcome to the club " + fname+" " + mname +" "+ lname+"!");           
            list.add("Your area code and telephone number is"+"("+acode+") "+ tnum);
            list.add("You are a "+ gend + " and your age is " + age+"\n");
            System.out.println();
            
        }
        for (int z = 0; z<list.size(); z++){
            System.out.println(list.get(z));
        }
        
        
    }
}
