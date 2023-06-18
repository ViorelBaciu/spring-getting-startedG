package without_dependency_injection;

/*
EmailsService class that holds the logic to send email messages to recipent email adresses
 */
public class EmailService {

    public void sendEmail(String message, String receiver){
        // logic to send email
        System.out.println("Email sent to " + receiver + "with message " + message);
    }
}
