import java.util.ArrayList;
import java.util.List;

public class Collection {

    public static void main(String[] args) {

        // it is mostly used as it provides loosely coupled code
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        System.out.println(numbers);


        /*// simple array in java we use it when we have fixed length of data
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
        }
        */

        ArrayList<Integer> arrayList = new ArrayList<>(10);
        arrayList.add(1);
        arrayList.add(1);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        int x = 3;
        int y = x++;
        y += 1;
        System.out.println("output" + y);

    }


}
