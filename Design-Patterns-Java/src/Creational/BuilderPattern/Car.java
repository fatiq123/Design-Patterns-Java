package Creational.BuilderPattern;


public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String color;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    public static class Builder {
        private final String brand;
        private String model;
        private int year;
        private String color;

        public Builder(String brand) {
            this.brand = brand;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    Car car = new Car.Builder("Toyota")
            .model("Corolla")
            .year(2020)
            .color("Red")
            .build();

}
