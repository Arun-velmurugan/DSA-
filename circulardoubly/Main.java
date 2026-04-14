
package circulardoubly;


public class Main {
    public static void main(String[] args) {
        CircularDoubly c1 = new CircularDoubly();
        c1.insert(10);
        c1.insert(20);
        
        c1.display();
        
        System.out.println("\n");
       c1.insert(40);
        c1.display();
        System.out.println("\n");
        c1.insertAtPos(30,3);
        c1.display();
        System.out.println("\n");
        c1.insertAtPos(50,5);
        c1.display();
        
        System.out.println("\n");
        c1.insertAtPos(70,7);
        c1.display();
    }
    
}
