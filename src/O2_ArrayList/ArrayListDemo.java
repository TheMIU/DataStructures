package O2_ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Declaration and Initialization
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);

        // Accessing elements
        int element = arrayList.get(1); // Accessing the second element (index 1)
        System.out.println("element : " + element);

        // Iterating through the ArrayList
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
