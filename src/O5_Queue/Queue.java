package O5_Queue;

public class Queue {
    private int[] elements;
    private int front;
    private int rear;
    private int size;

    public Queue(int initialCapacity) {
        elements = new int[initialCapacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public int size() {
        return size;
    }

    public void enQueue(int data) {
        if (isFull()) {
            resize();
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = data;
        size++;
    }

    public int deQueue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int removed = elements[front];
        front = (front + 1) % elements.length;
        size--;
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        int[] newElements = new int[newCapacity];

        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(front + i) % elements.length];
        }

        elements = newElements;
        front = 0;
        rear = size - 1;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[(front + i) % elements.length] + " ");
        }
        System.out.println();
    }
}
