
package factorydesignpattern;

public class MainFactory {
    public static void main(String[] args) {
        
        NotificationFactory emailFactory = new EmailFactory();
        Notification emailNotify = emailFactory.createNotification();
        emailNotify.sendMessage();
        
        System.out.println("\n");
        NotificationFactory smsFactory = new SmsFactory();
        Notification smsNotify = smsFactory.createNotification();
        smsNotify.sendMessage();
        
        System.out.println("\n");
        NotificationFactory pushFactory = new PushFactory();
        Notification pushNotify = pushFactory.createNotification();
        pushNotify.sendMessage();
        
    }
}
