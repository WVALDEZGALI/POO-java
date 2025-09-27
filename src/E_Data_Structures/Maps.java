package E_Data_Structures;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        // Declaration

        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Size

        System.out.println(names.size());
        System.out.println(numbers.size());

        // Add elements

        names.put("Camilo", "camiloga17310@gmail.com"); numbers.put(0, "Camilo"); // creates the element if it does not exist, and if it exists replaces the value.
        names.put("Ana", "anyga25@gmail.com"); numbers.put(1, "Ana");
        names.put("Mario", "lopezfordauto@gmail.com"); numbers.put(2, "Mario");
        System.out.println(names);
        System.out.println(numbers);

        // Access

        System.out.println(names.get("Camilo")); // We access using the key.
        System.out.println(numbers.get(2));

        // Check if there are keys or value

        System.out.println(names.containsKey("Camilo")); // We access using the key.
        System.out.println(numbers.containsKey(2));
        System.out.println(names.containsValue("camiloga17310@gmail.com")); // We access using the key.
        System.out.println(numbers.containsValue("Mario"));

        // Delete

        names.remove("Mario"); // We can delete by key or with the pair of key and value.
        System.out.println(names);

        // Clean map

        names.clear(); // Clean the entire Hashmap.
        System.out.println(names);

        // replace

        names.put("Camilo", "camiloga17310@gmail.com");
        System.out.println(names);
        names.replace("Camilo", "replace@gmail.com");
        System.out.println(names);

    }
}
