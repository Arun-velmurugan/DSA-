
package queue;


public class Queue {
    
    int size;
    String[] foods = new String[size];
    Queue(int size)
    {
        this.size = size;
        this.foods = new String[size];
    }
    int front = -1;
    int rear = -1;
    
    void addOrder(String food)
    {
        if(rear==size-1)
        {
            System.out.println("Foods are Full");
            return;
        }
   
          if(front==-1)
            {
                front=0;
            }
            rear++;
            foods[rear]=food;    
    }
    
    void serveOrder()
    {
        if(front==-1||front>rear)
        {
            System.out.println("No orders available"); 
            return;
        }
        
            System.out.println("Served Order: "+foods[front]);
            front++;
        
    }
    
    void viewNextOrder()
    {
        if(front==-1||front>rear)
        {
            System.out.println("No orders available");
        }
        else
        {
            System.out.println("Next Order: "+foods[front]);
        }
    }
    
    void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.println("Order added: "+foods[i]);
        }
    }
}
