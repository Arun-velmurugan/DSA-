
package singlylinlkedlist;


public class Main {
    public static void main(String[] args) {
       SinglyLinkedList s1 = new SinglyLinkedList();
       s1.insert(25);
       s1.insert(32);
       s1.insert(45);
       s1.insert(6);
       s1.insert(24);
       s1.insert(52);
       s1.display();
       
       s1.delete(6);
       s1.display();
    }
}
