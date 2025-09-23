package C_Strings;

public class B_StringsExercises {
    public static void main(String[] args) {

        String month = "December";
        String day = "Six";
        int number = 12;

        // 1. 1. Concatenate two text strings.
        System.out.println(month + " " + day);

        // 2. Shows the length of a text string.
        System.out.println(month.length());

        // 3. Shows the first and last character of a string.
        System.out.println(month.charAt(0) + " " + month.charAt(month.length() -1));
        System.out.printf("First character: %c, last character: %c%n", month.charAt(0), month.charAt(month.length() -1));

        // 4. Converts a string to uppercase and lowercase.
        System.out.println(month.toUpperCase());
        System.out.println(month.toLowerCase());

        // 5. Checks if a text string contains a specific word.
        System.out.println("My birthday is in December".contains(month));

        // 6. Format a string with an integer.
        System.out.printf("My favorite number is %s%n", number);

        // 7. Removes whitespace at the beginning and end of a string.
        System.out.println("  Many spaces   ".trim());

        // 8. Replaces all whitespace in a string with a hyphen (-).
        System.out.println(" Many    spaces  ".replace(" ", "-"));

        // 9. Check if two strings are equal.
        System.out.println("December".equals(month));

        // 10. Check if two strings are the same length.
        System.out.println(month.length() == day.length());

    }
}
