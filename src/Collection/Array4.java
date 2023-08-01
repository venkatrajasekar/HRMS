package Collection;

import java.util.ArrayList;

class Array4 {
    public static void main(String[] args){
        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add() method without the index parameter
        languages.add("sql");
        languages.add("java");
        languages.add("javascript");
        System.out.println("ArrayList: " + languages);
    }
}