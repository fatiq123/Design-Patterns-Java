package Behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private final List<Observer> observers;
    private double temperature;
    private double humidity;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature,humidity);
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        notifyObservers();
    }

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherApp weatherApp = new WeatherApp();

        weatherStation.addObserver(weatherApp);

        weatherStation.setTemperature(25.0);
        weatherStation.setHumidity(60.0);


    }
}
