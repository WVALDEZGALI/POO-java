package C_Strings;

public class A_Strings {
    public static void main(String[] args) {

         String name = "Camilo";
         String surname = "Valdes";
         int age = 39;
         double height = 1.64;

        System.out.println(name + " " + surname); // Concatenation

        System.out.println(name.length() + surname.length()); // Length

        System.out.println(name.charAt(4)); // Get character
        System.out.println(name.charAt(name.length() -1)); // Last character of the String

        System.out.println(name.substring(3)); // Extract a part of the string
        System.out.println(name.substring(2,5)); // Extract a part of the string, indicating start and end

        System.out.println(name.toUpperCase()); // Transform everything to uppercase
        System.out.println(name.toLowerCase()); // Transform everything to lowercase

        System.out.println(name.contains("milo")); // check if it contains
        System.out.println(name.contains("MILO")); // Check if it contains

        System.out.println(name.equals(surname)); // Compare if the content is the same
        System.out.println(name.equalsIgnoreCase("CAMILO")); // Compare if the content is the same, ignoring upper and lower case

        System.out.println(" Hello ".trim()); // clean the spaces at the beginning and at the end
        System.out.println(" Hello with spaces ".replace(" ", "")); // In this case eliminate the spaces
        System.out.println("Hello budy".replace("Hello", "Goodbye")); // In this case replace Hello with Goodbye

        System.out.println(String.format("Hello, my name is %s %s and I am %d years old. My height is %.2f%n mts.", name, surname, age, height));
        // - %s → insert text (String).
        // - %d → insert integer (int, long, short, byte).
        // - %f → insert decimal number (float, double).
        // - %c → inserts a single character.
        // - %b → insert boolean.
        // Additionally, with the symbol %.x%n replacing x, we specify the number of decimal places we want to display.






    }
}
