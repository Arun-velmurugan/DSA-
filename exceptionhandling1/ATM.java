
package exceptionhandling1;


public class ATM {
    
    private double balance;
    double amount;
    
    ATM(double balance,double amount)
    {
        this.balance = balance;
        this.amount = amount;
    }
    
    void deposit()
    {
        if(amount>0)
        {
            balance = balance + amount;
        }
    }
    
    void withdraw() throws Exception
    {
        if(amount>balance)
        {
            try{
            throw new Exception("INSUFFICIENT BALANCE");
            }
            catch(Exception obj)
            {
                System.out.println("WITHDRAW AMOUNT IS MUST BE GREATER THAN BALANCE");
            }
        }
        if(amount>0 && amount<=balance)
        {
            balance = balance-amount;
        }
    }
    
    double getBalance()
    {
        return balance;
    }
    
}
