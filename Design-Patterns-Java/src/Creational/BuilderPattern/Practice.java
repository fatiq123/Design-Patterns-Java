package Creational.BuilderPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

    void getHouseInfo(HouseOwner houseOwner) {
        houseOwner.length = "";
        houseOwner.setHouseOwner("Fatiq Hussnain");
        houseOwner.getHouseOwner();
    }



    public static void main(String[] args) {

/*
        int[] names = new int[10];
        for (int i = 0; i < names.length; i++) {
            names[i] = i + 1;
            System.out.println(names[i]);
        }


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Oranges");
        fruits.add("Pineapple");
        fruits.add("Watermelon");

        fruits.set(1, "Lemons");
        fruits.get(1);*/





        /*ArrayList<String> studentNames = new ArrayList<>(Arrays.asList("Muhammad Ali", "Fatiq Hussnain", "Hamid Abdullah", "ALi Hussnain"));

        studentNames.stream().forEach(name -> System.out.println(name));

        studentNames
                .forEach(System.out::println);*/


        // Better approach for making ArrayList is
        List<String> plants = new ArrayList<>();
        plants.add("Pumpkin");
        plants.add("Lemon");

//        plants.stream()
//                .filter(it -> it.length() > 5)
//                .forEach(System.out::println);


        while (plants.size() > 1) {
            plants.removeIf(it -> it.length() > 4);
            System.out.println(plants);
        }



        /*switch (plants) {
            case 1:
                plants.stream().filter(it -> it.length() > 4).findFirst().ifPresent(System.out::println);
                break;
            case 2:
                break;
            break;
        }*/


    }

}
