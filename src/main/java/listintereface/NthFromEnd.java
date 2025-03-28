package listintereface;
import java.util.*;

public class NthFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();

        // Move first pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) return null; // If N is greater than the size of the list
            first.next();
        }

        // Move both pointers until first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next(); // Return the Nth element from the end
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        System.out.println("Nth element from end: " + findNthFromEnd(list, n));
    }
}
