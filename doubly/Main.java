
package doubly;


public class Main {
    public static void main(String[] args) {
        Doubly d1 = new Doubly();
        //d1.insert(10);
        //d1.insert(30);
        //d1.insert(50);
        d1.insertAtpos(20,1);
        
        d1.display();
        System.out.println("\n");
       // d1.displayRev();
    }
}
