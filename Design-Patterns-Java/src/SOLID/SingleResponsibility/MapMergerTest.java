package SOLID.SingleResponsibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Map Merger Test")
class MapMergerTest {

    private MapMerger mapMerger = new MapMerger();

    @Test
    @DisplayName("Tests merging two maps")
    void mergeMaps() {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map1.put("B", 3);
        map1.put("C", 4);

        Map<String, Integer> mergedMap = mapMerger.mergeMaps(map1, map2);
        Map<String, Integer> expectedMap = new HashMap<>();
//        expectedMap.put("A", 1);
//        expectedMap.put("B", 5);
//        expectedMap.put("C", 4);

        assertEquals(expectedMap, mergedMap, "Maps should be merged correctly");
        Assertions.assertEquals(1, mergedMap.get("A"));
        Assertions.assertEquals(5, mergedMap.get("B"));
        Assertions.assertEquals(4, mergedMap.get("C"));    }
}