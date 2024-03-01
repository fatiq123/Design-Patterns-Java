package SOLID.DependencyInjection;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS " + message);
    }
}
