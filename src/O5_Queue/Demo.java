package O5_Queue;

public class Demo {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        queue.printQueue(); // [ 10, 20, 30, 40, 50 ]
        System.out.println("Size : " + queue.size()); // Size : 5

        System.out.println("Removed : " + queue.deQueue()); // Removed : 10

        queue.printQueue(); // [ 20, 30, 40, 50 ]
        System.out.println("Size : " + queue.size()); // Size : 4

        System.out.println("Peek : " + queue.peek()); // Peek : 20

        ////////////////////

        queue.enQueue(60);

        queue.printQueue(); // [ 20, 30, 40, 50, 60 ]
        System.out.println("Size : " + queue.size()); // Size : 5

        System.out.println(queue.isEmpty()); // false
        System.out.println(queue.isFull()); // true

        queue.clear();

        queue.printQueue(); // Empty Queue
        System.out.println("Size : " + queue.size()); // Size : 0

        System.out.println(queue.isEmpty()); // true
        System.out.println(queue.isFull()); // false

        ////////////////////
        // grow 
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60); // Queue size increased

        queue.printQueue(); // [ 10, 20, 30, 40, 50, 60 ]
        System.out.println("Size : " + queue.size()); // Size : 6
    }
}