package SOLID.SingleResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return a / b;
    }

    // sun using arrayList it is dynamic type
    public int arrayListSum(List<Integer> array) {
        int total = 0;
        for (int i = 0; i < array.size(); i++) {
            total = total + i;
        }
        return total;
    }

    // sum using simple static array
    public int arraySum(int[] array) {
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        return total;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of simple array: " + calculator.arraySum(numbers));


        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
        System.out.println("Sum of arrayList: " + calculator.arrayListSum(arrayList));
    }

}
