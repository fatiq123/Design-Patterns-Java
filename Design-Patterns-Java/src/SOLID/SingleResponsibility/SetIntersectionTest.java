package SOLID.SingleResponsibility;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetIntersectionTest {

    private SetIntersection setIntersection = new SetIntersection();

    @Test
    @DisplayName("Tests intersecting two sets")
    void setIntersection() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2,3,4));

        Set<Integer> expected = setIntersection.setIntersection(set1, set2);
        Set<Integer> actual = new HashSet<>(Arrays.asList(2,3));



        assertEquals(expected,  actual, "Sets should be intersected together");
    }
}