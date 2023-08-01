package Collection;


import java.util.List;
import java.util.ArrayList;

class Array2 {

    public static void main(String[] args) {
        // Creating list using the ArrayList class
        List<String>numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(String.valueOf(1));
        numbers.add(String.valueOf(2));
        numbers.add(String.valueOf(3));
        System.out.println("List: " + numbers);

        // Access element from the list
        for (String number : numbers) {

        }

        System.out.println("Accessed Element: " +numbers);

        // Remove element from the list
        Object removedNumber;
        removedNumber =numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
    }
}
