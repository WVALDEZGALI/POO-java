package FirstSteps01;

public class CVariableAndConstants {
    public static void main(String[] args) {
        String name = "Camilo";
        System.out.println(name);

        name = "William";
        System.out.println(name);

        // name = 37; Error can't change data type

        int age = 39;
        System.out.println(age);

        // Constant
        // it is good practice to define the name of constants in capital letters
        final String EMAIL = "camiloga12345@gmail.com";
        System.out.println(EMAIL);

        var year = 2025;
        System.out.println(year);

        var email = "camiloga654321@gmail.com";
        System.out.println(email);


    }
}
