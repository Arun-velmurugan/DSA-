
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MyThread extends Thread{
    
   public void run()
    {
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
            try {
                MyThread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
