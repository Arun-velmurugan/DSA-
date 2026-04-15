
package stack;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Stack s1 = new Stack();
      Scanner sc = new Scanner(System.in);
      System.out.print("Size:");
      s1.size=sc.nextInt();
      s1.items =new String[s1.size];
      boolean exit = true;
      do{
        System.out.println("1.Add Item");
        System.out.println("2.Undo Last Item");
        System.out.println("3.View Last Scanned Item");
        System.out.println("4.Display All Items");
        System.out.println("5.Exit");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        
        if(choice==1)
        {
            System.out.print("Item Name: ");
            String itemName = sc.nextLine();
            s1.push(itemName);
        }
        else if(choice==2)
        {
            s1.pop();
        }
        else if(choice==3)
        {
            s1.peek();
        }
        else if(choice==4)
        {
            s1.display();
        }
        else
        {
            System.out.println("THANKYOU FOR SHOPPING....");
            exit = false;
        }
      }while(exit);
    }
}
