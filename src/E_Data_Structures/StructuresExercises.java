package E_Data_Structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

public class StructuresExercises {
    public static void main(String[] args) {

        // 1. Create an Array with 5 values and print its length.

        String [] countries = new String[5];
        System.out.println(countries.length);

        // 2. Modifies one of the Array values and prints the index value before and after modifying it.

        System.out.println(countries [0]);
        countries [0] = "Colombia";
        System.out.println(countries [0]);

        // 3. Create an empty ArrayList.

        ArrayList<String> pets = new ArrayList<>();

        // 4. Add 4 values to the ArrayList and delete one below.

        pets.addAll(Arrays.asList("Dog", "Cat", "Fish", "Bird"));
        System.out.println(pets);
        pets.remove(2);
        System.out.println(pets);

        // 5. Create a HashSet with 2 different values.

        HashSet<String> names = new HashSet<>(Arrays.asList("Camilo", "Ana"));
        System.out.println(names);

        // 6. Adds a new repeated value and another unrepeated value to the HashSet.

        names.addAll(Arrays.asList("Camilo", "Mario"));
        System.out.println(names);

        // 7. Delete one of the HashSet items.

        names.remove("Mario");
        System.out.println(names);

        // 8. Create a HashMap where the key is a name and the value is the phone number. Add three contacts.

        HashMap<String, String> contacts = new HashMap<>(
                Map.of(
                        "Camilo", "+573138566968",
                        "Ana", "+573212125857",
                        "Mario", "+573245687989"
                )
        );
        System.out.println(contacts);

        // 9. Modify one of the contacts and delete another.

        contacts.replace("Ana", "+573138746491");
        System.out.println(contacts);
        contacts.remove("Mario");
        System.out.println(contacts);

        // 10. Given an Array, transform it into an ArrayList, then into a HashSet and finally into a HashMap with equal key and value.

        // Array initial

        String [] colors = {"Red", "Blue", "Yellow", "Green", "Red"};
        System.out.println("ArrayList : " + java.util.Arrays.toString(colors));
        System.out.println("ArrayList Size : " + colors.length);

        // Array to ArrayList

        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(colors));
        colorsList.addAll(Arrays.asList(colors));
        System.out.println("ArrayList : " + colorsList);
        System.out.println("Size ArrayList : " + colorsList.size());

        // ArrayList to HashSet

        HashSet<String> colorsSet = new HashSet<>(colorsList);
        System.out.println("ArrayList : " + colorsSet);
        System.out.println("Size ArrayList : " + colorsSet.size());

        // HashSet to HashMap

        HashMap<String, String> colorsMap = new HashMap<>();
        for (String color : colorsSet) {
            colorsMap.put(color, color );
        }

        System.out.println("HashMap (Key = Value): " + colorsMap);
        System.out.println("HashMap (Key = Value): " + colorsMap.size());
    }
}
