
package linkedlist;
import java.util.*;

public class Linkedlist {

    public String fname;
    public String mname;
    public String lname; 
    public String gender; 
    public int arcode;
    public long telnum;
    public int age;
    public Linkedlist next;
    
    public static Linkedlist firstnode;
    public static Linkedlist lastnode;
    
    public Linkedlist(String a, String b, String c, String gen, int arc, long tel, 
            int numage, Linkedlist n) {
        
                fname = a;
                mname = b;
                lname = c;
                gender = gen;
                arcode = arc;
                telnum = tel;
                age = numage;
                next = n;
                                       
    }
    
    
    public static void main(String[] args) {
        String fname, mname, lname, gender;
        int numnodes, arcode, age;
        long telnum;
        String num;
        Scanner s = new Scanner(System.in);
        
        System.out.print("How many members' information will be entered?: ");
        numnodes = s.nextInt();
        
        System.out.println();
        
        for(int i = 0; i<numnodes; i++){
            System.out.print("Kindly give the information of member #" + (i+1) + "\n" );
         
            System.out.print("Enter first name of member: ");
            fname = s.next();
            
            System.out.print("Enter middle name of member: ");
            mname = s.next();
            
            System.out.print("Enter last name of member: ");
            lname = s.next();
            
            System.out.print("Enter area code of member: ");
            arcode = s.nextInt();
            
            System.out.print("Enter telephone number of member: ");
            telnum = s.nextInt();
            
            System.out.print("Enter gender of member: ");
            gender = s.next();
            
            System.out.print("Enter age of member: ");
            age = s.nextInt();
            
            System.out.println();
           
           Linkedlist n = new
                Linkedlist(fname, mname, lname, gender, arcode, telnum, age, null);
           
           if(lastnode != null){
               lastnode.next = n;
               lastnode = n;
           }
            
           else{
               firstnode = n;
               lastnode = n;
           }
            
        }
        
        Linkedlist n = firstnode;
        while(n!= null){
            System.out.println("Welcome to the club " + n.fname + " " + n.mname + " " + n.lname + "!");
            
            System.out.println("Your area code and telephone number is " + " (" + n.arcode + ") " + n.telnum + "." );
            
            System.out.println("You are a " + n.gender + "member " + "and your age is " + n.age + "." + "\n");
            
            n = n.next; 
            
        }
        System.out.println();
    }
    
}
