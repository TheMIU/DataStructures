package O4_Stack;

public class Demo {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.printStack(); // [ 10, 20, 30, 40 ]

        System.out.println("Removed : " + stack.pop()); // Removed : 40

        stack.printStack(); // [ 10, 20, 30 ]

        System.out.println("Peek : " + stack.peek()); // Peek : 30

        ////////////////////

        stack.push(40);
        stack.push(50);

        stack.printStack(); // [ 10, 20, 30, 40, 50]
        stack.size(); // Length : 5

        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.isFull()); // true

        stack.clear();

        stack.printStack(); // Empty stack
        stack.size(); // Length : 0

        System.out.println(stack.isEmpty()); // true
        System.out.println(stack.isFull()); // false

        ////////////////////
        // grow stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // Stack size increased

        stack.printStack(); // [ 10, 20, 30, 40, 50, 60 ]
        stack.size(); // Length : 6
    }
}
