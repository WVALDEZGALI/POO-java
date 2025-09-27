package E_Data_Structures;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        // Declaration

        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Size

        System.out.println(names.size());
        System.out.println(numbers.size());

        // Add elements

        names.add("Camilo"); numbers.add(1); // Unlike arrays, sets do not save data in an orderly manner.
        names.add("Ana"); numbers.add(2);
        names.add("Mario"); numbers.add(3);
        names.add("Camilo@gmail.com"); numbers.add(0);
        System.out.println(names.size());
        System.out.println(numbers.size());
        System.out.println(names);
        System.out.println(numbers);

        // Delete

        names.remove("Mario"); // Delete elements by indicating the element itself and no longer its index.
        System.out.println(names);

        // Search

        System.out.println(names.contains("Oscar"));
        System.out.println(names.contains("Camilo"));

        // It does not allow you to have duplicate elements.

        System.out.println(names);
        System.out.println(numbers);
        names.add("Camilo"); numbers.add(1);
        names.add("Camilo"); numbers.add(1);
        names.add("Camilo"); numbers.add(1);
        System.out.println(names);
        System.out.println(numbers);
    }
}
