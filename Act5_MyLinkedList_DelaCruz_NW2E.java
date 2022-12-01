
package act5_mylinkedlist._delacruz_nw2e;

import java.util.*;
public class Act5_MyLinkedList_DelaCruz_NW2E {

    
    public String FirstName, MiddleName,LastName,AreaCode, TelephoneNumber,Gender;
    public int Age;
    public Act5_MyLinkedList_DelaCruz_NW2E  next;
    public static Act5_MyLinkedList_DelaCruz_NW2E firstNode;
    public static Act5_MyLinkedList_DelaCruz_NW2E lastNode = null;
    
    public  Act5_MyLinkedList_DelaCruz_NW2E  (String FName,String Mname,String Lname,String Acode,String Telnum,String gender,int age, Act5_MyLinkedList_DelaCruz_NW2E  n){
      FirstName = FName;
      MiddleName = Mname;
      LastName = Lname;
      AreaCode = Acode;
      TelephoneNumber = Telnum;
      Gender = gender;
      Age = age;
      next =  n;
    }
    
    public static void main(String[] args) {
       
       int numnodes;
        Scanner input = new Scanner(System.in);
        System.out.print("How many member's information will be entered? ");
        numnodes = input.nextInt();
        for(int i = 0; i < numnodes; i++){
            System.out.println("\nKindly give the information of member #" + (i+1));
            Information();
        }
             Act5_MyLinkedList_DelaCruz_NW2E  n = firstNode;
            
            while(n != null){
                System.out.println("\nWelcome to the club " + n.FirstName + " " + n.MiddleName + " " + n.LastName + "!");
                System.out.println("Your area code and telephone number is (" + n.AreaCode + ")" + n.TelephoneNumber + ".");
                System.out.println("You are a " + n.Gender + " member, and your age is " + n.Age + ".");
                n = n.next;
                
            }

}

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

   Act5_MyLinkedList_DelaCruz_NW2E  n = new  Act5_MyLinkedList_DelaCruz_NW2E (FName, MName, LName, ACode, TNum, gender, age, null);
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

