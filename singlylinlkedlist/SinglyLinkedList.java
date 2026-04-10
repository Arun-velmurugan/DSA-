
package singlylinlkedlist;

public class SinglyLinkedList {
    Node head;
    void insert(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
        }
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
        void delete(int data)
        {
           if(head==null)
           {
               System.out.println("List is empty");
               return;
           }
           if(head.data==data)
           {
               head = head.next;
               return;
           }
           Node temp = head;
           while((temp.next!=null) && (temp.next.data!=data))
           {
               temp = temp.next;
           }
           //temp.next = temp.next.next;
            if(temp.next == null)
            {
                System.out.println("NO value found");
                return;
            }
           temp.next = temp.next.next;
        }
        
        void display()
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+"--->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    
   }
