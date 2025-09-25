package E_Data_Structures;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        // Declaration
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Size

        System.out.println(names.size());
        System.out.println(numbers.size());

        // Add elements

        names.add("Camilo"); numbers.add(1);
        names.add("Ana"); numbers.add(2);
        names.add("Mario"); numbers.add(3);
        System.out.println(names.size());
        System.out.println(numbers.size());

        // Access

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());
        System.out.println(numbers.get(1));

        // Modify

        names.set(0, "Oscar");
        System.out.println(names.getFirst());


    }

}