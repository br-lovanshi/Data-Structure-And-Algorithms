

class GmailClient {

    void sendMail(String subject, String to, String body) {
        // send mail logic
        System.out.println("Mail sent to " + to);
    }
}

interface EmailClient{
    void send(String subject, String to, String body);
}

class OutLook implements EmailClient{

    @Override
    public void send(String subject, String to, String body) {
        System.out.println("Mail sent to " + to);
        System.out.println("Subject: " + subject + ". \nBody: " + body);

    }
}

class Gmail implements EmailClient{

    @Override
    public void send(String subject, String to, String body) {
        System.out.println("Mail sent to " + to);
        System.out.println("Subject: " + subject + ". \nBody: " + body);
    }
}
class MailService {
    EmailClient emailClient;

    MailService(EmailClient emailClient) {
        this.emailClient = emailClient;
    }

    void sendWelcomeMail(String userName, String userMail) {
        String subject = "Welcome " + userName;
        String body = "Dear " + userName + " Happy to onboard you, start you joureny here.";
        emailClient.send(subject, userMail, body);
    }
}

public class DependencyInjectionRev {
    public static void main(String[] args) {
//        GmailClient gmailClient = new GmailClient();
        EmailClient outLook = new Gmail();
        MailService mailService = new MailService(outLook);
        mailService.sendWelcomeMail("Brajesh", "brajesh@gmail.com");
    }
}


/* Uncle bob: 1. High level class should not depend on low level.
2. Interface should not depends on details, Details should depends on interface.
 */