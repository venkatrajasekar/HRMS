package Collection.ArraylistString;


import java.util.ArrayList;

public class Array1{
    public static void main(String[] args) {
        ArrayList <String>myList= new ArrayList();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        // Convert the ArrayList to a String
        String arrayListAsString = myList.toString();

        System.out.println(arrayListAsString);
    }
}
