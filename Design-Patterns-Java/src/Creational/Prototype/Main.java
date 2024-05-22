package Creational.Prototype;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Creating object using prototype design pattern");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.10.10");
        networkConnection.loadVeryImportantData();

        System.out.println(networkConnection);


        // after cloning of real object other objects won't get much time
        NetworkConnection networkConnection2 = null;
        networkConnection2 = networkConnection.clone();
        NetworkConnection networkConnection3  = networkConnection.clone();
        System.out.println(networkConnection2);
    }

}
