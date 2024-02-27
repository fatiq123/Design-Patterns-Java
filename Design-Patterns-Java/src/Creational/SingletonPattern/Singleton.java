package Creational.SingletonPattern;

public class Singleton {

    // Step 1: Private static variable of the same class that has a private constructor
    private static volatile Singleton singletonInstance;

    // Step 2: Private constructor restricted to this class itself
    private Singleton() {
        // Prevents formation of another instance by reflection
        if (singletonInstance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    // Step 3: Static method to create instance of Singleton class
    public static Singleton getInstance() {
        if (singletonInstance == null) { // Double-checked locking
            synchronized (Singleton.class) {
                if (singletonInstance == null) {
                    singletonInstance = new Singleton();
                }
            }
        }
        return singletonInstance;
    }

    // Step 4: Other useful methods for the Singleton
    public void someMethod() {
        // Some code here
    }

}



