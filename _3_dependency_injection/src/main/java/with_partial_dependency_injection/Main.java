package with_partial_dependency_injection;

public class Main {
    public static void main(String[] args) {
        AlertManager email = new AlertManager(new EmailService());
        email.processMessage("ALERT", "ionut@abc.com");
        AlertManager sms = new AlertManager(new SmsService());
        sms.processMessage("ALERT", "0722222222");

//        MessageService service = new SmsService();
//        service.sendMessage("ALERT", "0722222222");
//        service = new EmailService();
//        service.sendMessage("ALERT", "ionut@abc.com");
    }
}
