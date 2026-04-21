package exceptionhandling1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ATM obj = new ATM(2000,1000);
        
        boolean exit = true;
        
        do{
            System.out.println("1.WITHDRAW MONEY");
            System.out.println("2.CHECK ACCOUNT BALANCE");
            System.out.println("3.EXIT");
            System.out.print("OPTION: ");
            int option= sc.nextInt();
            if(option==1)
            {
                obj.withdraw();
                System.out.println(obj.getBalance());
            }
            else if(option==2)
            {
                System.out.println(obj.getBalance());
            }
            else if(option==3)
            {
                System.out.println("Exit...");
                exit = false;
            }
            
        }while(exit);
        
    }
}
