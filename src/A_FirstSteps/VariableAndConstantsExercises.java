package A_FirstSteps;

public class VariableAndConstantsExercises {
    public static void main(String[] args) {
        String myName = "Camilo"; // 1. Declare a variable of type chain text and name it after it.
        System.out.println(myName);

        int myAge = 39; // 2. Create a variable of type integer and assign it your age.
        System.out.println(myAge);

        double myHeight = 1.64; // 3. Create a variable of type double and assign it your Height.
        System.out.println(myHeight);

        boolean iLikeProgramming = true; //4. Declare a variable of type boolean that indicates whether you like programming
        System.out.println("I like programming " + iLikeProgramming);

        final String myEmail = "camiloga123456@gmail.com"; // 5. Declare a constant with your email
        System.out.println(myEmail);

        char myInitial = 'C'; // 6. Create a variable of type char and save your initial.
        System.out.println(myInitial);

        String myLocality = "Engativa"; // 7. Declare a variable of type String with your locality, and a
        System.out.println(myLocality); // it then changes its value and prints it again.
        myLocality = "Kennedy";
        System.out.println(myLocality);

        int a = 5; int b = 8; // 8. Create a variable int called a, another b, and print the sum of both.
        System.out.println(a + b);

        Integer myNumber = 6; // 9. Prints the type of two variables created previously.
        System.out.println(myNumber.getClass().getSimpleName());
        Double myDouble = 12.6;
        System.out.println(myDouble.getClass().getSimpleName());

        String myLastName; // 10. Try declaring a variable without initializing it and then
        myLastName = "Camilo"; // assign it a value before printing it.
        System.out.println(myLastName);
    }
}
