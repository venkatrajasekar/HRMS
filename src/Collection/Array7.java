package Collection;


import java.util.ArrayList;

class Array7 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        // add elements in the array list
        animals.add("cheetha");
        animals.add("cow");
        animals.add("bat");
        System.out.println("ArrayList: " + animals);

        // remove element from index 2
        String str = animals.remove(2);
        System.out.println("Updated ArrayList: " + animals);
        System.out.println("Removed Element: " + str);
    }
}