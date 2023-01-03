package act5_mylinkedlist_ramos_nw2e;
import java.util.*;

public class Act5_MyLinkedList_Ramos_NW2E {

    
    public static void main(String[] args) {
       
       int numnodes;
        Scanner input = new Scanner(System.in);
        System.out.print("How many member's information will be entered? ");
        numnodes = input.nextInt();
        for(int i = 0; i < numnodes; i++){
            System.out.println("\nKindly give the information of member #" + (i+1));
            Information();
        }
             Act5_MyLinkedList_Ramos_NW2E  n = firstNode;
            
            while(n != null){
                System.out.println("\nWelcome to the club " + n.firstn + " " + n.middlen + " " + n.lastn + "!");
                System.out.println("Your area code and telephone number is (" + n.ACode + ")" + n.teleph + ".");
                System.out.println("You are a " + n.gender + " member, and your age is " + n.age + ".");
                n = n.next;
                
            }

}
public  Act5_MyLinkedList_Ramos_NW2E  (String FName,String Mname,String Lname,String Acode,String Telnum,String Gender,int Age, Act5_MyLinkedList_Ramos_NW2E  n){
      firstn = FName;
      middlen = Mname;
      lastn = Lname;
      ACode = Acode;
      teleph = Telnum;
      gender = Gender;
      age = Age;
      next =  n;
     }
    
public String firstn, middlen,lastn,ACode, teleph,gender;
    public int age;
    public Act5_MyLinkedList_Ramos_NW2E  next;
    public static Act5_MyLinkedList_Ramos_NW2E firstNode;
    public static Act5_MyLinkedList_Ramos_NW2E lastNode = null;
   static void Information()
{   
 Scanner input = new Scanner(System.in);
    String FName, MName, LName, ACode, TNum, gender;
        int  age;
     
            System.out.print("Enter First Name: ");
            FName = input.nextLine();
            System.out.print("Enter Middle Name: ");
            MName = input.nextLine();
            System.out.print("Enter Last Name: ");
            LName = input.nextLine();
            System.out.print("Enter Area Code: ");
            ACode = input.nextLine();
            System.out.print("Enter Telephone Number: ");           
            TNum = input.nextLine();
            System.out.print("Enter Gender: ");
            gender = input.nextLine();
            System.out.print("Enter Age: ");
            age = input.nextInt();

   Act5_MyLinkedList_Ramos_NW2E  n = new  Act5_MyLinkedList_Ramos_NW2E (FName, MName, LName, ACode, TNum, gender, age, null);
            if(lastNode !=null){
                lastNode.next = n;
                lastNode = n;
            }
            else {
                firstNode = n;
                lastNode = n;
            }
      }
      
   
  
    }
