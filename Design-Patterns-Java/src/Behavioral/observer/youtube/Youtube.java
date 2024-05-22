package Behavioral.observer.youtube;

public class Youtube {

    public static void main(String[] args) {

        Channel telusko = new Channel();

        Subscriber subscriber1 = new Subscriber("ali");
        Subscriber subscriber2 = new Subscriber("fatiq");
        Subscriber subscriber3 = new Subscriber("atif");
        Subscriber subscriber4 = new Subscriber("hamid");


        telusko.subscribe(subscriber1);
        telusko.subscribe(subscriber2);
        telusko.subscribe(subscriber3);
        telusko.subscribe(subscriber4);


        subscriber1.subscribeChannel(telusko);
        subscriber2.subscribeChannel(telusko);
        subscriber3.subscribeChannel(telusko);
        subscriber4.subscribeChannel(telusko);

        telusko.upload("Java in 30 minutes");

    }
}
