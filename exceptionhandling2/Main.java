
package exceptionhandling2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Main {
    public static void main(String[] args) {
        LoginSystem l1 = new LoginSystem();
        Scanner sc = new Scanner(System.in);
//        System.out.print("Name: ");
//        System.out.println("Password: ");
        
        boolean exit = true;
        do{
            System.out.println("1.Login");
            System.out.println("2.Exit");
            System.out.print("option");
            int option=sc.nextInt();
            sc.nextLine();
            if(option==1)
            {
                
                try{
                   LoginSystem.smartLogin(sc);
                }
                catch(AccountLockedException e)
                {
                    System.out.println(e.getMessage());
                    System.out.println("System exiting...");
                    return;
                }
            }
            else if(option==2)
            {
                System.out.println("Exiting System...");     
                }
            else
            {
                System.out.println("Invalid Option");
                exit = false;
            }
            
        }while(exit);
    }
}
