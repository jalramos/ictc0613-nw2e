import java.util.Scanner;
import java.io.*;


/**
 *
 * @author USER
 */
class MyList{
    public MyList firstLink,lastLink;
    int size;
    MyList link;
    private MyList next;

    MyList(){
        this.link=null;
        firstLink = null;
        lastLink=null;
    }
    public boolean isEmpty(){
         return(firstLink == null);
     }
     public void showMyList() {
         MyList currentLink = firstLink;
            System.out.print("List: ");
            while(currentLink != null) {
                currentLink.showMyList();
                currentLink = currentLink.lastLink;
            }
            System.out.println("");
        }

    
}
public class Activity05B_NW2E_Diaz {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MyList newMyList=new MyList();
        Scanner userInput= new Scanner(System.in);
        Scanner inputname= new Scanner(System.in);
        Scanner inputmiddlename= new Scanner(System.in);
        Scanner inputlastname= new Scanner(System.in);
        Scanner inputareacode= new Scanner(System.in);
        Scanner inputphonenumber= new Scanner(System.in);
        Scanner inputgender= new Scanner(System.in);
        Scanner inputage= new Scanner(System.in);
        

        int userInputNumber;
        System.out.println("How many nformation will be entered:");
        userInputNumber = userInput.nextInt();
        
            int i=1;
            while(i<=userInputNumber){  
                 System.out.print("\n");
            System.out.println("Kindly give the information of member # "+":"+i);
            i++; 
            System.out.print("Entered your First name:");
            String info1=inputname.nextLine();
            System.out.print("Entered your middle name:");
            String info2=inputmiddlename.nextLine();
            System.out.print("Entered your last name:");
            String info3=inputlastname.nextLine();
            System.out.print("Entered area code:");
            int info4=inputareacode.nextInt();
            System.out.print("Entered your telephone number:");
            String info5=inputphonenumber.nextLine();
            System.out.print("Entered your gender:");
            String info6=inputphonenumber.nextLine();
            System.out.print("Entered your age:");
            int info7=inputage.nextInt();
                
               System.out.println("\n\n");
               System.out.println("Welcome to the club"+" "+info1+" "+info2+" "+info3);
               System.out.println("Your area code and telephone number is"+" "+"("+info4+")"+" "+info5);
               System.out.println("You are a"+" "+info6+" "+"and your age is"+" "+info7);
           }
           
           }
           
           
        }
           
    
    
