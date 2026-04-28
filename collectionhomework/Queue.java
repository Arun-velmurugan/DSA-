
package collectionhomework;

import java.util.LinkedList;
import java.util.Queue;

public class Queue {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        
        System.out.println(queue);
        
        
        queue.poll();
        System.out.println(queue);
        
        System.out.println(queue.peek());
     
        System.out.println(queue);
        
        if(queue.isEmpty()){
            System.out.println("Queue is not empty");
        }
        else{
            System.out.println("Queue is not empty");
        }
    }
}
