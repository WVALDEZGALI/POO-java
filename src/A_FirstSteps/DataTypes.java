package A_FirstSteps;

public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types.
        int myInt = 37; //Integer without decimals.
        System.out.println(myInt);

        double myDouble = 1.64; // Decimals.
        System.out.println(myDouble); // Float, Long, Byte.

        char myChar = 'C'; // character with single quotes.
        System.out.println(myChar);

        boolean myBooleanT = true;
        System.out.println(myBooleanT);

        boolean myBooleanF = false;
        System.out.println(myBooleanF);

        String myString = "JAVA"; // Although it is not a primitive data type but rather a class.
        System.out.println(myString); // We put it since it is widely used.
        System.out.println(myString.getClass().getSimpleName());

    }
}

