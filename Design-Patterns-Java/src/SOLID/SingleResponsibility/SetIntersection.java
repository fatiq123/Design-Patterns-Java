package SOLID.SingleResponsibility;

import java.util.Set;
import java.util.stream.Collectors;

public class SetIntersection {

    Set<Integer> setIntersection(Set<Integer> set1, Set<Integer> set2) {
        return set1.stream()
                .filter(set2::contains)
                .collect(Collectors.toSet());
    }

}
