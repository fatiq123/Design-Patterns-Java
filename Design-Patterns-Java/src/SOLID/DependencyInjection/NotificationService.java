package SOLID.DependencyInjection;

public class NotificationService {

    private final MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message) {
        this.messageService.sendMessage(message);
    }
}
