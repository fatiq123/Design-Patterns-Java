package SOLID.SingleResponsibility;

import java.util.*;

public class Quiz {

    public static void main(String[] args) {

        String[] arr = {"c","d","b", "a", "e"};
        InnerClass in = new InnerClass();
        Arrays.parallelSort(arr, in);
        for (String str: arr) {
            System.out.print(str + "");
            System.out.println(Arrays.binarySearch(arr, "b"));
        }


        // Answer the output
        Set s = new LinkedHashSet();
        s.add("1");
        s.add(1);
        s.add(3);
        s.add(2);
        System.out.println(s);



        // Answer the output
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
//        m(list);




    }
    public static void m(List<Number> list) {
        System.out.println(list);
    }



    static class InnerClass implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s2.compareTo(s1);
        }
    }

}
