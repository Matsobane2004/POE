package poe;
import java.util.Scanner;
public class POE 
{
     public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        CheckingLoginFormat clf = new CheckingLoginFormat();
        String username;
        String password;
        boolean cf;
        boolean hl;
        boolean cpt;
        
        cf = false;
        hl = false;
        
        while (cf == false && hl == false)
        {
        System.out.print("Enter Username : ");
        username = scn.next();
        
        System.out.print("Enter your Password : ");
        password = scn.next();
        
        if(username.contains("_") && username.length()<6)
        {
            System.out.println("Username Successfully captured!");
        }
        else
            System.out.println("Username is not correctly formatted, please ensure that the username contains an underscore and is no more than 5 characters in length" );
         
        cf = clf.CheckFormat(password);
        hl = clf.HasEnoughChar(password);
        cpt = clf.HasCapital(password);
        
                if(cf == false)
                {
                    System.out.println("There is no Special character in this password!");
                }
                
                if(hl == false)
                {
                    System.out.println("The password does not have enough characters!");
                }
                
                 if(cpt == false)
                {
                    System.out.println("Password should at least contain one CAPITAL LETTER!");
                }
                
                if(cf == true && hl == true && cpt == true)
                {
                    System.out.println("Password Successfully Captured!");
                }
                
        }
       
    }
    
}




