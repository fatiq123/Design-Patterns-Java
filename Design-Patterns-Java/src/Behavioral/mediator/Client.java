package Behavioral.mediator;

public class Client {
    public static void main(String[] args) {

        Colleague colleague1 = new ConcreteColleague(null, "Alice");
        Colleague colleague2 = new ConcreteColleague(null, "Bob");

        Mediator mediator = new ChatMediator(colleague1, colleague2);

        colleague1.setMediator(mediator);
        colleague2.setMediator(mediator);

        colleague1.send("Hello, Bob!");
        colleague2.send("Hi, Alice!");

    }
}
