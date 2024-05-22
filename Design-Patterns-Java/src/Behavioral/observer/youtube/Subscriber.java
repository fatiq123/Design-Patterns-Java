package Behavioral.observer.youtube;

public class Subscriber {

    private final String name;
    private Channel channel;


    Subscriber(String name) {
        super();
        this.name = name;
    }

    public void upload() {
        System.out.println("hey " + name + " video uploaded");
    }

    public void subscribeChannel(Channel ch) {
        channel = ch;
    }

}
