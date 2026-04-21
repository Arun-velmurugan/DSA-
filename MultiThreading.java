
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MultiThreading extends Thread{
    
   public void run()
   {
       for (int i = 0; i < 10; i++) {
           System.out.println("Thread 2 :"+i);
           
       }
   }
}
