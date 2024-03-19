package OOP;

public abstract class abstraction {
    abstract void a();
    void b(){
        System.out.println("b");
    }
}


//implementation of abstraction through abstract class
abstract class Animal {
    abstract void walk();

    void eat() {
        System.out.println("The animal is eating.");
    }

    Animal() {
        System.out.println(
                "An Animal is going to be created.");
    }
}

class Cow extends Animal {
    Cow() {
        System.out.println("You have created a Cow");
    }

    void walk() {
        System.out.println("Cow is walking.");
    }
}

class Goat extends Animal {
    Goat() {
        System.out.println("You have created a Goat");
    }

    void walk() {
        System.out.println("Goat is walking.");
    }
}

