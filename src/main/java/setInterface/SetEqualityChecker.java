package setInterface;

import java.util.*;

public class SetEqualityChecker {
    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        return set1.equals(set2);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        System.out.println("Are sets equal? " + areSetsEqual(set1, set2));
    }
}
