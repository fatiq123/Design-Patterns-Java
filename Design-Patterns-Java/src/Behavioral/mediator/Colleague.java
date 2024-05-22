package Behavioral.mediator;

public interface Colleague {
    void send(String message);
    void receive(String message);
    void setMediator(Mediator mediator);
}
