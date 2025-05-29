
// Bad example - because every time for adding we need to modify this class
class NotificationService1{
    void send(String type) {
        if("SMS".equalsIgnoreCase(type)){
            System.out.println("Sending SMS");
        }else if("EMAIL".equalsIgnoreCase(type)){
            System.out.println("Sending Email");
        }
    }
}

// Open/close principle applied example
interface Notifier{
    void send();
}

class Sms implements Notifier{

    @Override
    public void send() {
        System.out.println("Sending SMS");
    }
}

class Email implements Notifier{

    @Override
    public void send() {
        System.out.println("Sending Email");
    }
}

class NotificationService{
    void notifier(Notifier notifier){
        notifier.send();
    }
}

public class OCP {
    public static void main(String[] args) {
        Notifier email = new Email();
        Notifier sms = new Sms();
       NotificationService notificationService = new NotificationService();
       notificationService.notifier(email);
       notificationService.notifier(sms);
    }
}
// Class is open of extension but close for modification
// This principle is beneficial for safe scaling.