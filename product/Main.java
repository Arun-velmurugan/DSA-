
package product;

import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    Main m1 = new Main();
    ShoppingCart s1 = new ShoppingCart();
    boolean exit = true;
    do
    {
        System.out.println("1.Add Product to Cart");
        System.out.println("2.View all Cart Items");
        System.out.println("3.Exit");
        System.out.print("Option: ");
        int option = sc.nextInt();
        
        if(option==1)
        {
            System.out.print("Enter Product ID: ");
            int productId = sc.nextInt();
            
            sc.nextLine();
            
            System.out.print("Enter Product Name: ");
            String productName = sc.nextLine();
            
            System.out.print("Enter the Price: ");
            double price = sc.nextDouble();
            s1.addProduct(productId, productName, price);
            System.out.println("Product Added Successfully");
        }
        else if(option==2)
        {
            System.out.println("--------PRODUCT DETAILS--------");
            s1.display();
        }
        else if(option==3)
        {
            System.out.println("Exit....");
            return;
        }
        else
        {
            exit=false;
        }
    }while(exit);
    
    }
}
