package SOLID.SingleResponsibility;

import java.util.List;

public class ListSorter {

    public List<Integer> sortList(List<Integer> list) {
        list.sort(Integer::compare);
        return list;
    }


}
