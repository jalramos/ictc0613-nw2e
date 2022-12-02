package act05b_nw2e_agustin;
import java.util.*;

public class Act05b_nw2e_agustin {
    public String Firstname, Middlename, Lastname, MemberAreacode, MemberTelephoneNumber, MemberGender ;
    public int MemberAge;
    
    public Act05b_nw2e_agustin Next; //reference to the next node
    public static Act05b_nw2e_agustin firstnode; //reference to the first node
    public static Act05b_nw2e_agustin lastnode; //reference to the last node
   
    public Act05b_nw2e_agustin(
            String FirstName, String MiddleName, String LastName, String Areacode, 
            String TelephoneNumber, String Gender, int Age, Act05b_nw2e_agustin node){
                Firstname = FirstName;
                Middlename = MiddleName;
                Lastname = LastName;
                MemberAreacode = Areacode;
                MemberTelephoneNumber = TelephoneNumber;
                MemberGender = Gender;
                MemberAge = Age;
                Next = node;
            }
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numnodes;

        System.out.print("How many member's information will be entered? ");
        numnodes = scan.nextInt();
        scan.nextLine();
        
        for(int i=0; i<numnodes; i++){
            System.out.println("\n"+"Kindly give the information of member #" + (i+1));
            System.out.print("Enter first name: ");
            String fname = scan.nextLine();
            
            System.out.print("Enter middle name: ");
            String mname = scan.nextLine();
            
            System.out.print("Enter last name: ");
            String lname = scan.nextLine();
            
            System.out.print("Enter area code: ");
            String acode = scan.nextLine();
            
            System.out.print("Enter telephone number: ");
            String telnum = scan.nextLine();
            
            System.out.print("Enter Gender: ");
            String gen = scan.nextLine();
            
            System.out.print("Enter Age: ");
            int age = scan.nextInt();
            
            scan.nextLine();
            
            Act05b_nw2e_agustin n = new Act05b_nw2e_agustin(fname, mname, lname, acode, telnum, gen, age, null); //create node
            
            if(lastnode != null){
                lastnode.Next = n;
                lastnode = n;
            }// if it is not the first node
            else {
                firstnode = n;
                lastnode = n;
            }//if it is the first node
        }
        
        System.out.println("\nHere are the entered nodes: ");
        Act05b_nw2e_agustin n = firstnode;
        while(n != null){
            System.out.println("\nWelcome to the club "+ n.Firstname + " " + n.Middlename + " " + n.Lastname + "!");
            System.out.println("Your area code and telephone number is " + "("+n.MemberAreacode+")" + n.MemberTelephoneNumber + ".");
            System.out.println("You are a " + n.MemberGender + " member and your Age is " + n.MemberAge+".");
            n = n.Next; //next node in the list
        }//display
        System.out.println();
    }
    
}

