package O5_Queue;

// Public Methods
// =======
// isEmpty
// isFull
// size
// peek / top
// clear
// enQueue
// deQueue
// printQueue

public class Queue {
    private int[] elementData;
    private int front;
    private int rear;
    private int size;

    public Queue(int initialCapacity) {
        elementData = new int[initialCapacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    // isFull
    public boolean isFull() {
        return size == elementData.length;
    }

    // size
    public int size() {
        return size;
    }

    // peek / top
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        return elementData[front];
    }

    // clear
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

    // enQueue
    public void enQueue(int data) {
        if (isFull()) {
            grow();
        }
        rear = (rear + 1) % elementData.length;
        elementData[rear] = data;
        size++;
    }

    // deQueue
    public int deQueue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }
        int removed = elementData[front];
        front = (front + 1) % elementData.length;
        size--;
        return removed;
    }

    // printQueue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return;
        }
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(elementData[(front + i) % elementData.length] + ", ");
        }
        System.out.println("\b\b ]");
    }

    /////////////////////////////////
    private void grow() {
        System.out.println("Queue size increased");

        int[] temp = elementData;
        elementData = new int[elementData.length * 2];

        for (int i = 0; i < size; i++) {
            elementData[i] = temp[(front + i) % temp.length];
        }

        front = 0;
        rear = size - 1;
    }
}
