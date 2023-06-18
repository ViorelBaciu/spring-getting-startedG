package with_partial_dependency_injection;

public class EmailService implements MessageService{
    @Override
    public void sendMessage(String message, String receiver) {
        // logic to sen mail
        System.out.println("Email sent to " + receiver + " with message " + message);
    }
}
