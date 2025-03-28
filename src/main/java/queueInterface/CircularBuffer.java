package queueInterface;

import java.util.Arrays;

class CircularBuffer {
    private int[] buffer;
    private int size, head, tail, count;

    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    public void insert(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % size;

        if (count < size) {
            count++;
        } else {
            head = (head + 1) % size; // Overwrite oldest element
        }
    }

    public int[] getBufferContents() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = buffer[(head + i) % size];
        }
        return result;
    }

    public boolean isFull() {
        return count == size;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}

public class CircularBufferSimulation {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        System.out.println("Buffer: " + Arrays.toString(buffer.getBufferContents())); // [1, 2, 3]

        buffer.insert(4); // Overwrites 1
        System.out.println("Buffer: " + Arrays.toString(buffer.getBufferContents())); // [2, 3, 4]
    }
}
