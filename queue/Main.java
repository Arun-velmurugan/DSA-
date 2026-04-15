
package queue;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //LinkedList l1 = new LinkedList();
        //l1.insert(data);
        System.out.print("Size: ");
        int size = sc.nextInt();
        Queue q1 = new Queue(size);
        boolean exit = true;
        do
        {
            System.out.println("1.Add Order");
            System.out.println("2.Serve Order");
            System.out.println("3.View Next Order");
            System.out.println("4.Display All Orders");
            System.out.println("5.Exit");
            System.out.print("Option: ");
            int  option = sc.nextInt();
            sc.nextLine();
            switch(option)
            {
                case 1:
                {
                    System.out.print("Food: ");
                    String foodName = sc.nextLine();
                    q1.addOrder(foodName);
                    break;
                }
                case 2:
                {
                    q1.serveOrder();
                    break;
                }
                case 3:
                {
                    q1.viewNextOrder();
                    break;
                }
                case 4:
                {
                    q1.display();
                    break;
                }
                default:
                {
                    System.out.println("THANKYOU FOR ORDERED FOOD");
                    exit = false;
                }
            }
        }while(exit);
    }
}
