
package stack;

import java.util.Scanner;


public class Stack {
    Scanner sc = new Scanner(System.in);
    //System.out.print("Size: ");
    int size;
    String items[];
    int top=-1;
    
    void push(String itemName)
    {
        if(top==size-1)
        {
            System.out.println("Items are full");
            return;
        }
        else
        {
            top++;
            items[top]=itemName;
        }
    }
    
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Nothing to delete");
            //return;
        }
        else
        {
            System.out.println(items[top]+" is deleted");
            top--;
        }
    }
    void peek()
    {
        if(top==-1)
        {
            System.out.println("Items are empty");
            return;
        }
        else{
            System.out.println("Top Element is: "+items[top]);
        }
    }
    
    void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println("Item added: "+items[i]);
        }
    }
}
