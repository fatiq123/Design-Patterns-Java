package Behavioral.mediator;

public class ChatMediator implements Mediator {

    private Colleague colleague1;
    private Colleague colleague2;

    public ChatMediator(Colleague colleague1, Colleague colleague2) {
        this.colleague1 = colleague1;
        this.colleague2 = colleague2;
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {

        if (colleague == colleague1) {
            colleague2.receive(message);
        } else {
            colleague1.receive(message);
        }
    }
}
