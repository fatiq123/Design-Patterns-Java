package OOP;

public class Inheritance {
     int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class A {

}
abstract class AbstractClass extends Inheritance implements InterfaceA {
    abstract void fun() ;
    void play() {
        System.out.println("I am playing");
    }

}

interface InterfaceA {
    void a() ;
}
interface InterfaceB {
    void b() ;
}
class ChildClass extends Inheritance implements InterfaceA, InterfaceB {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        int age = childClass.age;
        childClass.setName("Fatiq");
        String name = childClass.getName();
        System.out.println(name + age);
        System.out.println("-------------------");


    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}


