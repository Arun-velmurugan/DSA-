
package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {
    
    static
    {
        System.out.println("----------------BANK SIMPLE INTEREST CALCULATOR------------");
    }
    
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        
        System.out.print("PRINICIPAL AMOUNT: ");
        double principal = se.nextDouble();
        System.out.print("Time: ");
        double time = se.nextDouble();
        
         JavaApplication5 j1 = new JavaApplication5();
        
         Bank obj = new Bank(principal,time);

         System.out.println("\n");
         obj.display();
     
    }

    
}
