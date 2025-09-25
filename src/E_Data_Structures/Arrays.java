package E_Data_Structures;

public class Arrays {
    public static void main(String[] args) {

        // Declaration and creation

        int [] number1 = new int[3]; // An empty array only indicates the number of data.
        System.out.println(number1.length); // We will see the length of the array.
        int [] number = {3, 5, 6, 4}; // It only saves data of the same type.

        // Access

        System.out.println(number[0]); // When we enter the data we define its length.

        String [] name = {"Camilo", "Mario", "Ana", "Diego"};
        System.out.println(name[2]); // We access the data through the index.

        // Modification

        number [0] = 8;
        System.out.println(number[0]);

    }
}
