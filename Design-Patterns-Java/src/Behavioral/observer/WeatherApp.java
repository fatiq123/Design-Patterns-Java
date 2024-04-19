package Behavioral.observer;

public class WeatherApp implements Observer {
    @Override
    public void update(double temperature, double humidity) {
        System.out.println("Weather App: Temperature = " + temperature + ", Humidity = " + humidity);
    }
}
