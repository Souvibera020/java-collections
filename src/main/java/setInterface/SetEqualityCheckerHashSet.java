package setInterface;
import java.util.*;

public class SetEqualityCheckerHashSet {
    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        return set1.equals(set2);
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> symDiffSet = new HashSet<>(set1);
        symDiffSet.addAll(set2);
        Set<Integer> intersectionSet = intersection(set1, set2);
        symDiffSet.removeAll(intersectionSet);
        return symDiffSet;
    }

    public static List<Integer> convertSetToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        System.out.println("Are sets equal? " + areSetsEqual(set1, set2));
        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersection(set1, set2));
        System.out.println("Symmetric Difference: " + symmetricDifference(set1, set2));
        System.out.println("Sorted List from Set: " + convertSetToSortedList(set3));
    }
}
