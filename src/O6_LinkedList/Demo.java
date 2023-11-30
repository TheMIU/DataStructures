package O6_LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.traverse(); // Empty List
        System.out.println("Size : " + myList.size()); // Size : 0

        myList.insertAtBegin(10);
        myList.insertAtBegin(20);
        myList.insertAtBegin(30);
        myList.insertAtBegin(40);

        myList.traverse(); // [ 40, 30, 20, 10 ]
        System.out.println("Size : " + myList.size()); // Size : 4

        myList.removeAtBegin();
        myList.traverse(); // [ 30, 20, 10 ]

        myList.removeAtPosition(1);
        myList.traverse(); // [ 30, 10 ]

        myList.removeAtEnd();
        myList.traverse(); // [ 30 ]

        myList.clear();
        myList.traverse(); // Empty List
        System.out.println("Size : " + myList.size()); // Size : 0

        ////////////////////////////////////
        myList.insertAtPosition(25, 1); // Empty List

        myList.insertAtBegin(10);
        myList.insertAtBegin(20);
        myList.insertAtBegin(30);

        myList.insertAtPosition(25, 1);
        myList.insertAtEnd(35);

        myList.traverse(); // [ 30, 20, 25, 10, 35 ]

        ////////////////////////////////////
        System.out.println(myList.get(5)); // Wrong index, maximum index no is: 4 , -1
        System.out.println(myList.get(4)); // 35
    }
}
