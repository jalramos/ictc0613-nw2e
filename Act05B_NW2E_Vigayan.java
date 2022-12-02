package act5b_nw2e_vigayan;
import java.io.IOException;
import java.util.Scanner;
public class Act5B_NW2E_Vigayan {
    public String fname, mname, lname,gender;
    public int areacode, age;
    public long telnum;
   
    public int data; //hold an arbitrary integer
    public Act5B_NW2E_Vigayan next; //reference to the next node
    public static Act5B_NW2E_Vigayan firstNode; //a reference to the first Node
    public static Act5B_NW2E_Vigayan lastNode = null; //a reference to the last node
    
    public Act5B_NW2E_Vigayan(String fn, String mn, String ln, int ac, long tel, String gen, int a, Act5B_NW2E_Vigayan n) {
        fname = fn;
        mname = mn;
        lname = ln;
        gender = gen;
        areacode = ac;
        age = a;
        telnum = tel;
    }

     public static void main(String[] args) throws IOException {
        String firstname, midname, lastname, gen;
        int arcode, age;
        long telno;
        int memnum;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("How many members’ information will be entered? ");
        memnum = scan.nextInt();
        System.out.println();
        
        for(int i=0; i<memnum; i++) {
            System.out.print("Kindly give the information of member #" +(i+1) + "\n");
            System.out.print("Enter first name: " );
            firstname = scan.next();
            System.out.print("Enter middle name: ");
            midname = scan.next();
            System.out.print("Enter last name: ");
            lastname = scan.next();
            System.out.print("Enter area code: ");
            arcode = scan.nextInt();
            System.out.print("Enter telephone number: ");
            telno = scan.nextLong();
            System.out.print("Enter gender: ");
            gen = scan.next();
            System.out.print("Enter age: ");
            age = scan.nextInt();
            
            System.out.println();

        Act5B_NW2E_Vigayan n = new Act5B_NW2E_Vigayan(firstname, midname, lastname, arcode, telno, gen, age, null); //create node

            if(lastNode != null) //if it is not the first node
            {
                lastNode.next = n;
                lastNode = n;
            } else { //if n is the first node
                firstNode = n;
                lastNode = n;
            }
        }
        
        Act5B_NW2E_Vigayan n = firstNode;
        while(n != null) { //loops forward displaying
            System.out.println("Welcome to the club "+ n.fname + " " + n.mname + " " + n.lname + "!");
            System.out.println("Your area code and telephone number is " + "(" + n.areacode + ")" + n.telnum + ".");
            System.out.println("You are a " + n.gender + " member" +" and your age is " + n.age + "." +"\n");
            n = n.next; //move to the next node in the list
        }
        System.out.println();
    }
}


