package O4_Stack;

// Public Methods
// =======
// push
// pop
// peek
// printStack
// isEmpty
// isFull
// size
// clear

public class Stack {
    private int[] elementData;
    private int top;

    public Stack(final int initialCapacity) {
        elementData = new int[initialCapacity];
        top = -1;
    }

    // push
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack size increased");
            grow();
        }
        elementData[++top] = data;
    }

    // pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack.Stack is Empty");
            return -1;
        }
        return elementData[top--];
    }

    // peek
    public int peek() {
        if (!isEmpty()) {
            return elementData[top];
        }
        return -1;
    }

    // printStack
    public void printStack() {
        if (!isEmpty()) {
            System.out.print("[ ");
            for (int i = 0; i <= top; i++) {
                System.out.print(elementData[i] + ", ");
            }
            System.out.println("\b\b ]");
        } else {
            System.out.println("Empty stack");
        }
    }

    // isEmpty
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    // isFull
    public boolean isFull() {
        if (top == elementData.length - 1) {
            return true;
        }
        return false;
    }

    // size
    public void size() {
        System.out.println("Length : " + (top + 1));
    }

    // clear
    public void clear() {
        top = -1;
    }

    ////////////////////////////////////////////////

    // grow
    private void grow() {
        int[] temp = elementData;

        elementData = new int[elementData.length * 2];
        for (int i = 0; i < temp.length; i++) {
            elementData[i] = temp[i];
        }
    }
}