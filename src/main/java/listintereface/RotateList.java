package listintereface;

import java.util.*;

public class RotateList {
    public static <T> void rotateList(List<T> list, int positions) {
        int n = list.size();
        positions = positions % n; // Handle cases where positions > n

        List<T> temp = new ArrayList<>(list.subList(0, positions)); // Store first 'positions' elements
        list.subList(0, n - positions).clear(); // Remove first 'positions' elements
        list.addAll(temp); // Append stored elements at the end
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Original List: " + numbers);

        int rotateBy = 2;
        rotateList(numbers, rotateBy);

        System.out.println("Rotated List: " + numbers);
    }
}
