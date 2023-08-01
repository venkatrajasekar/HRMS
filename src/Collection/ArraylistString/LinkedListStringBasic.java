package Collection.ArraylistString;

import java.util.LinkedList;

public class LinkedListStringBasic {
    public static void main(String[] args) {
        // Create a LinkedList to store strings
        LinkedList<String> fruitsList = new LinkedList<>();

        // Adding elements to the LinkedList
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Orange");

        String arrayListAsString = fruitsList.toString();

        System.out.println(arrayListAsString);



    }
}
