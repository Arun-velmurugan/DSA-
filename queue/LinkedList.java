
package queue;


public class LinkedList {
    Node head;
    
    void insert(String data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
}
