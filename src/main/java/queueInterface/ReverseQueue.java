package queueInterface;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);
        queue = reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }

    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Move all elements from queue to stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Move all elements back from stack to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }
}

