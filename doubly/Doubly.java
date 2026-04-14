
package doubly;


public class Doubly{
    
    Node head;
    void insert(int data)
    {
        Node n1 = new Node(data);
        if(head==null)
        {
            head=n1;
        }
        else
        {
            Node temp =head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n1;
            n1.prev=temp;
        }
    }
    void insertAtpos(int data,int pos){
        
        Node n1 = new Node(data);
        if(pos==1)
        {
            n1.next=head;
            if(head!=null)
            {
                head.prev=n1;
            }
            head=n1;
            return;
        }
        else
        {
            Node temp =head;
            for(int i=1;(i<pos-1) && (temp!=null) ;i++)
            {
              temp = temp.next;   
            }
            if(temp==null)
            {
                System.out.println("Invalid position");
                return;
            }
            if(temp.next==null)
            {
                temp.next=n1;
                n1.prev=temp;
            }
            else
            {
                n1.next=temp.next;
                temp.next.prev=n1;
                temp.next=n1;
                n1.prev=temp;
            }
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
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
    
    void displayRev()
    {
         if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp= head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.prev;
        }
            
    }
    
}
