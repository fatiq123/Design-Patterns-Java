package Behavioral.strategy;


import java.util.Observable;
import java.util.Observer;

public class ConcreteSubject extends Observable {

    float price;

    ConcreteSubject(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
        setChanged();
        notifyObservers(new float[(int) price]);
    }

}

class ConcreteObserver implements Observer {

    private float price;
    public void PriceObserver(float price) {
        price = 0;
    }
    @Override
    public void update(Observable o, Object arg) {
        price = ((float) arg);
    }
}

class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject(12.0f);
        ConcreteObserver concreteObserver = new ConcreteObserver();

        concreteSubject.addObserver(concreteObserver);
        concreteSubject.setPrice(1);
    }
}