package SOLID.DependencyInjection;

public class Main {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.sendNotification("Hello, this is a test email");
    }
}
