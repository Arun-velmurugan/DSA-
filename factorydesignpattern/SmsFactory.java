
package factorydesignpattern;

public class SmsFactory extends NotificationFactory{

    @Override
    Notification createNotification() {
        return new SmsNotification();
    }
    
}
