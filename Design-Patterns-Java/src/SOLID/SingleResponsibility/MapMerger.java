package SOLID.SingleResponsibility;

import java.util.HashMap;
import java.util.Map;

public class MapMerger {

    public Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>(map1);
        map2.forEach((key, value) -> mergedMap.merge(key, value, (v1, v2) -> v1 + v2));
        return mergedMap;
    }

}
