
package factorydesignpattern;

public class EmailNotification implements Notification {

    @Override
    public void sendMessage() {
        System.out.println("Send Email Notification!");
    }
    
}
