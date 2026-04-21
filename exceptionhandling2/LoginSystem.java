
package exceptionhandling2;

import java.util.Scanner;


public class LoginSystem {
    static final String userName;
    static final String password;
    
    static int attemptsLeft=3;
    
    static{
        Scanner sc = new Scanner(System.in);
        System.out.print("USERNAME: ");
        userName = sc.nextLine();
        System.out.print("PASSWORD: ");
        password = sc.nextLine();
    }
    static void smartLogin(Scanner sc) throws AccountLockedException{
        
        if(attemptsLeft==0)
        {
            throw new AccountLockedException("Account Locked! Too many failed attempts.");
        }
        
        System.out.print("Name: ");
        String user = sc.nextLine();
        
        System.out.print("Password: ");
        String pass = sc.nextLine();
        
        if(user.equals(userName) && pass.equals(password))
        {
            System.out.println("Login Successfully");
            attemptsLeft=3;
        }
        else
        {
            attemptsLeft--;
            System.out.println("Invalid credentials");
            System.out.println("Attempts Left: "+attemptsLeft);
            if(attemptsLeft==0)
            {
                throw new AccountLockedException("Account Locked! Too many failed attempts.");
            }
        }
        
     
    }
    
}