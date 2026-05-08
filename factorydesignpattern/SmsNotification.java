
package factorydesignpattern;

public class SmsNotification implements Notification {

    @Override
    public void sendMessage() {
        System.out.println("Send SMS Notification!");
    }
    
}
