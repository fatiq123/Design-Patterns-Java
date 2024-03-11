package SOLID.SingleResponsibility;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("List Sorter Test")
class ListSorterTest {

    private ListSorter listSorter = new ListSorter();

    @Test
    @DisplayName("Tests sorting a list of integers")
    void sortListTest() {
     List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(1);
        listSorter.sortList(l);


        List<Integer> list = Arrays.asList(3, 1, 4, 2);
        List<Integer> sortedList = listSorter.sortList(list);
        List<Integer> expectedList = Arrays.asList(1,2,3,4);
        assertEquals(expectedList, sortedList, "List should be sorted in ascending order");

    }
}
