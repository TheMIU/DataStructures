package O3_HashMap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // Declaration and Initialization
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Accessing values by key
        int value = hashMap.get("Two"); // Accessing value associated with key "Two"
        System.out.println(value);

        // Iterating through the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
    }
}
