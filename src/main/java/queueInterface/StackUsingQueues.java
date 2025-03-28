package queueInterface;

import java.util.*;

class StackUsingQueues {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        if (queue1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        // Move all elements except the last one to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        // Remove and return the last element (top of stack)
        int topElement = queue1.remove();

        // Swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    public int top() {
        if (queue1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        // Move all elements except the last one to queue2
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }

        // Get the last element (top of stack)
        int topElement = queue1.peek();
        queue2.add(queue1.remove());

        // Swap queue1 and queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top()); // Output: 3
        System.out.println("Pop: " + stack.pop()); // Output: 3
        System.out.println("Pop: " + stack.pop()); // Output: 2
        System.out.println("Is Empty: " + stack.isEmpty()); // Output: false
    }
}
