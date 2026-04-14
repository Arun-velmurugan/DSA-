
package circulardoubly;


public class CircularDoubly {
    Node head;
    
    void insert(int data)
    {
        Node n1 = new Node(data);
        if(head==null)
        {
            head=n1;
            head.prev=head;
            head.next=head;
        }
        else
        {
            Node last = head.prev;
            last.next=n1;
            n1.prev =last;
            n1.next=head;
            head.prev=n1;
        }
    }
    
    void insertAtPos(int data,int pos)
    {
        Node n1 = new Node(data);
        if(head==null)
        {
            if(pos!=1)
            {
                System.out.println("Invalid position");
                return;
            }
            head=n1;
            head.prev=head;
            head.next=head;
            return;
        }
        if(pos==1)
        {
            Node last = head.prev;
            
            last.next=n1;
            n1.prev=last;
            n1.next=head;
            head.prev=n1;
            
            head=n1;
            return;
        }
        else
        {
            Node temp=head;
            for(int i=1;(i<pos-1);i++)
            {
                temp=temp.next;
                if(temp==head)
                {
                System.out.println("Invalid Position");
                return;
                }
            }
//                temp.next=n1;
//                n1.prev=temp;
//                n1.next=head;
//                head.prev=n1;
//            else
//            {
                //Node temp = head;
                n1.next=temp.next;
                temp.next.prev=n1;
                temp.next=n1;
                n1.prev=temp;
            //}
        }
    }
    
    void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }while(temp!=head);
    }
}
