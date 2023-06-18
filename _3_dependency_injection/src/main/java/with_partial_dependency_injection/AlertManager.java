package with_partial_dependency_injection;

public class AlertManager {
    private MessageService service;

    public AlertManager(MessageService service) {
        this.service = service;
    }

    public void processMessage(String msg, String receiver) {
        // do some message validation, manipulation logic
        service.sendMessage(msg, receiver);
    }
}
