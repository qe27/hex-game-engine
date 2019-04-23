package umiworld.logic;

import java.util.Map;

public class MapUtils {

    public static <T> void incrementMapValue(Map<T, Integer> map, T key, Integer quantity) {
        map.merge(key, quantity, (a, b) -> b + a);
    }

}
