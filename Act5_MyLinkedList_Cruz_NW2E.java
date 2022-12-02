package Act5_MyLinkedList_Cruz_NW2E;

import java.io.IOException;
import java.util.Scanner;
public class Act5_MyLinkedList_Cruz_NW2E {
    public String fn, mn, ln,gen; //hold an arbitrary integer
    public int ac, old;
    public long tp;
    public Act5_MyLinkedList_Cruz_NW2E next; //reference to the next node
    public static Act5_MyLinkedList_Cruz_NW2E firstNode; //a reference to the first Node
    public static Act5_MyLinkedList_Cruz_NW2E lastNode = null; //a reference to the last node
    
    public Act5_MyLinkedList_Cruz_NW2E(String a, String b, String c,int d, long e,String f,int g, Act5_MyLinkedList_Cruz_NW2E n) {
        fn = a;
        mn = b;
        ln = c;
        ac = d;
        tp = e;
        gen = f;
        old = g;
        next = n;
    }
    
    public static void main(String[] args) throws IOException {
        int numnodes, area, age;
        long telephone;
        String fname, mname, lname,gender;
        Scanner reader = new Scanner(System.in);
        System.out.println("How many members’ information will be entered?: ");
        numnodes = reader.nextInt();
        System.out.println();
        for(int i=0; i<numnodes; i++) {
            System.out.println("Kindly give the information of member #" + (i+1)+ ": ");
            System.out.println("Enter first name: ");
            fname = reader.nextLine();
            fname = reader.nextLine(); 
            /*sir dalawa po talaga to, pag po dalawang first name nilagay 
            (ex: Jmar Maclet) iniiskip po yung middle name,
            pero for some reason gumagana po pagganto*/
            System.out.println("Enter middle name: ");
            mname = reader.nextLine();
            System.out.println("Enter last name: ");
            lname = reader.nextLine();
            System.out.println("Enter area code: ");
            area = reader.nextInt();
            System.out.println("Enter telephone number: ");
            telephone = reader.nextLong();
            System.out.println("Enter gender: ");
            gender = reader.next();
            System.out.println("Enter age: ");
            age = reader.nextInt();
            System.out.println();
            Act5_MyLinkedList_Cruz_NW2E n = new Act5_MyLinkedList_Cruz_NW2E(fname,mname,lname,area,telephone,gender,age, null); //create node
            if(lastNode != null) //if it is not the first node
            {
                lastNode.next = n;
                lastNode = n;
            } else { //if n is the first node
                firstNode = n;
                lastNode = n;
            }
        }
        System.out.println();
        Act5_MyLinkedList_Cruz_NW2E n = firstNode;
        while(n != null) { //loops forward displaying
            System.out.println("Welcome to the club "+n.fn+" "+n.mn+" "+n.ln+"!\t");
            System.out.println("Your area code and telephone number is ("+n.ac+") "+n.tp+"\t");
            System.out.println("You are a "+n.gen+" member and your age is "+n.old+".\t");
            System.out.println();
            n=n.next; //move to the next node in the list
            
        }
        System.out.println();
    }
}