package mapInterface;

import java.util.*;

public class MaxValueKeyFinder {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = findMaxKey(map);
        System.out.println("Key with max value: " + maxKey);
    }

    public static String findMaxKey(Map<String, Integer> map) {
        if (map.isEmpty()) return null;

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}

