package Behavioral.mediator;

public class DefaultInterface implements  MyData{
    public static void main(String[] args)  {

        MyData myData;

    }

    void printInformation(MyData myData) {
        myData.printName();
        myData.printAge();
    }


    @Override
    public int printAge() {
        return 0;
    }
}



interface MyData {
    default void printName() {
        System.out.println("Ali Hussnain");
    }
    int printAge();

    static boolean isNull(String str) {
        return str == null || str.isEmpty();
    }

}

interface MyData2 {
    default void printName() {
        System.out.println("Ali Hussnain");
    }
    int printAge2();
}