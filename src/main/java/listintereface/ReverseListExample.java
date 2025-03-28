package listintereface;
import java.util.*;
public class ReverseListExample {



        // Method to reverse an ArrayList
        public static <T> void reverseArrayList(List<T> list) {
            int left = 0, right = list.size() - 1;
            while (left < right) {
                // Swap elements
                T temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
                left++;
                right--;
            }
        }

        // Method to reverse a LinkedList
        public static <T> void reverseLinkedList(LinkedList<T> list) {
            int left = 0, right = list.size() - 1;
            while (left < right) {
                // Swap elements
                T temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
                left++;
                right--;
            }
        }

        public static void main(String[] args) {
            // Test with ArrayList
            List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            System.out.println("Original ArrayList: " + arrayList);
            reverseArrayList(arrayList);
            System.out.println("Reversed ArrayList: " + arrayList);

            // Test with LinkedList
            LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
            System.out.println("Original LinkedList: " + linkedList);
            reverseLinkedList(linkedList);
            System.out.println("Reversed LinkedList: " + linkedList);
        }
    }


