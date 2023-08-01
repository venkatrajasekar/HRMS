package Collection;

import java.util.Iterator;
import java.util.Vector;

class vector2 {
    public static void main(String[] args) {
        Vector<String> animals= new Vector<>();
        animals.add("lion");
        animals.add("cat");
        animals.add("bat");

        // Using get()
        String element = animals.get(2);
        System.out.println("Element at index 3: " + element);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("Vector: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
