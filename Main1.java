
package multithreading;


public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        
        Multi m1 = new Multi();
        Thread t1 = new Thread(m1);
        t1.start();
        
        MultiThreading m2 = new MultiThreading();
        m2.start();
    }
}
