
package homework;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        ProductPriceManager pm = new ProductPriceManager();
        
       
        while(true){
            System.out.println("\n");
            System.out.println("1.Add Product prices to Array");
            System.out.println("2.Copy prices to ArrayList");
            System.out.println("3.Display Prices");
            System.out.println("4.Find Maximum Price");
            System.out.println("5.Remove a Price");
            System.out.println("6.Exit");
            System.out.print("Option: ");
            int option = sc.nextInt();
            sc.nextLine();
                    
            switch(option){
                
                case 1:{
                    
                    pm.add(arr, size, sc);
                    break;
                }
                case 2:{
                    pm.copy(arr);
                    break;
                }
                case 3:{
                    pm.display();
                    break;
                }
                case 4:{
                    System.out.println("Maximum price = "+pm.maximumPrice());
                    break;
                }
                case 5:{
                    pm.removePrice(sc);
                    break;
                }
                case 6:{
                    System.out.println("Exit");
                    System.exit(0);
                }
            }
        }
    }
}
