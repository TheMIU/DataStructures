package O6_LinkedList;

// Public Methods
// =======
// insertAtBegin
// insertAtEnd
// insertAtPosition
// removeAtBegin
// removeAtEnd
// removeAtPosition
// traverse (print)
// size
// clear
// get

public class LinkedList {
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // insertAtBegin
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // insertAtEnd
    public void insertAtEnd(int data) {
        if (head == null) {
            insertAtBegin(data);
            return;
        }

        Node newNode = new Node(data);

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // insertAtPosition
    public void insertAtPosition(int data, int position) {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        if (position == 0) {
            insertAtBegin(data);
            return;
        }

        Node newNode = new Node(data);

        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // removeAtBegin
    public void removeAtBegin() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        head = head.next;
    }

    // removeAtEnd
    public void removeAtEnd() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // removeAtPosition
    public void removeAtPosition(int position) {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        if (position == 0) {
            removeAtBegin();
            return;
        }

        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    // traverse
    public void traverse() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node temp = head;

        System.out.print("[ ");
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println("\b\b ]");
    }

    // size
    public int size() {
        Node temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // clear
    public void clear() {
        head = null;
    }

    // get
    public int get(int position) {
        if (head == null) {
            System.out.println("Empty List");
            return -1;
        }

        if (position > size() - 1) {
            System.out.println("Wrong index, maximum index no is: " + (size() - 1));
            return -1;
        }

        Node temp = head;

        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
}
