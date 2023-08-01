package Collection;

import java.util.PriorityQueue;
import java.util.Iterator;

class iteratorqueue1 {
    public static void main(String[] args) {

        // Creating a priority queue
        PriorityQueue numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.print("PriorityQueue using iterator(): ");

        //Using the iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
