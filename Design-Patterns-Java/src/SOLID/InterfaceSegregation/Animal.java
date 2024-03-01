package SOLID.InterfaceSegregation;

public abstract class Animal {

    public abstract void eat();
    public abstract void walk();

    public abstract void talk();
    public void fly() {
        System.out.println("fly");
    };

}

class Bird extends Animal {

    @Override
    public void eat() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void talk() {

    }
}

class Mamel extends Animal {

    @Override
    public void eat() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void talk() {

    }

    @Override
    public void fly() {
        super.fly();
    }
}