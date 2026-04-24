
package innerclassandarray;

import java.util.Scanner;

public class ShoppingCart {
    
    String cartOwnerName;
    
    class Item
    {
        String itemName;
        int price;
        int quantity;
        double priceHistory[];
        
        void getDetails(Scanner sc)
        {
            System.out.print("Enter Item Name: ");
            itemName = sc.nextLine();
            
            System.out.print("Enter Quantity: ");
            quantity = sc.nextInt();
            
            System.out.print("Enter No of price updates: ");
            int n = sc.nextInt();
            
            priceHistory = new double[n];
            
            for(int i=0;i<n;i++)
            {
                System.out.print("Updated Price: ");
                priceHistory[i] = sc.nextDouble();
            }
        }
        
        double getLatestPrice()
        {
            return priceHistory[priceHistory.length-1];
        }
        
            
        double getTotalBill()
        {
            return getLatestPrice()*quantity;
        }
        
        void display()
        {
            System.out.println("Item Name: "+itemName);
            System.out.println("Quantity: "+quantity);
            System.out.print("Enter Price History: ");
            for(int i=0;i<priceHistory.length;i++)
            {
                System.out.print(priceHistory[i]+" ");
            }
            System.out.println("Latest Price: "+getLatestPrice());
            System.out.println("Total Bill: "+getTotalBill());
        }
        
        
    }
}
