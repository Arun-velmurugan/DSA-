
package javaapplication5;

import java.util.Scanner;

public class Bank {
    
    static final double interestRate = 7.5;
    double principal;
    double year;
    
    Bank(double principal,double year)
    {
        this.principal = principal;
        this.year = year;
    }

    static final String bankName="CANARA BANK";
    
  
    
    static double calculateInterest(double principal,double years)
    {
        double formula = principal*Bank.interestRate*years/100;
        return formula;
    }
    
    void display()
        {
            System.out.println("Bank Name: "+Bank.bankName);
            System.out.println("Principal Amount: "+principal);
            System.out.println("Years: "+year);
            //System.out.println("");
            double interestAmount = Bank.calculateInterest(principal,year);
            System.out.println("Interest Amount: "+interestAmount);
            double totalAmount = principal + interestAmount;
            System.out.println("Total Amount: "+totalAmount);
        }
    
}
