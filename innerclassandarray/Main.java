
package innerclassandarray;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ShoppingCart cart = new ShoppingCart();
        
        System.out.print("Cart Owner: ");
        cart.cartOwnerName=sc.nextLine();
        
        ShoppingCart.Item items = cart.new Item();
        
        items.getDetails(sc);
        
        System.out.println("Cart Owner: "+cart.cartOwnerName);
        items.display();
    }
}
