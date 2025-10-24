package G_Functions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {
    public static void main(String[] args) {

        // 1. Create a function that prints "¡I welcome you to the Java course from zero!".

        System.out.println("1. Create a function that prints \"¡I welcome you to the Java course from zero!\".");
        System.out.println();

        welcome();

        // 2. Write a function that is named as a parameter and greet that person.
        System.out.println();
        System.out.println("2. Write a function that is named as a parameter and greet that person.");
        System.out.println();

        hello("Camilo");

        // 3. Create a method that receives two integers and returns their subtraction.
        System.out.println();
        System.out.println("3. Create a method that receives two integers and returns their subtraction.");
        System.out.println();

        int total = subtraction(8,5);
        System.out.println("The result of number 1 - number 2 is: " + total);

        // 4. Create a method that calculates the square of a number (n * n).
        System.out.println();
        System.out.println("4. Create a method that calculates the square of a number (n * n).");
        System.out.println();

        int squareResult = square(8);
        System.out.println("And the square of this number is: " + squareResult );

        // 5. Write a function that receives a number and says whether it is even or odd.

        System.out.println();
        System.out.println("5. Write a function that receives a number and says whether it is even or odd.");
        System.out.println();

        int remainderResult = remainder(16);
        if (remainderResult == 0){
            System.out.println("And is even.");
        } else {
            System.out.println("And is odd.");
        }

        // 6. Create a method that receives an age and returns true if it is of legal age (and false otherwise).

        System.out.println();
        System.out.println("6. Create a method that receives an age and returns true if it is of legal age (and false otherwise).");
        System.out.println();

        boolean ageResult = age(17);
        if (ageResult) {
            System.out.println(ageResult);
            System.out.println("The person is of legal age.");
        } else {
            System.out.println(ageResult);
            System.out.println("The person is a minor.");
        }

        // 7. Implements a function that receives a string and returns its length.

        System.out.println();
        System.out.println("7. Implements a function that receives a string and returns its length.");
        System.out.println();

        int sizeLength = length("Legendary");
        System.out.println("And its length is: " + sizeLength);

        // 8. Create a method that receives an array of integers, calculate its mean and do so return.

        System.out.println();
        System.out.println("8. Create a method that receives an array of integers, calculate its mean and do so return.");
        System.out.println();

        double numbersAverage = average(5,6,7,8,9);
        System.out.println("And ist average is: " + numbersAverage);

        // 9. Write a method that receives a number and returns its factorial.

        System.out.println();
        System.out.println("9. Write a method that receives a number and returns its factorial.");
        System.out.println();

        int factorialTotal = factorial(0);
        System.out.println("And its factorial is: " + factorialTotal);

        // 10. Create a function that receives an ArrayList<String> and scrolls through it showing each element.

        System.out.println();
        System.out.println("10. Create a function that receives an ArrayList<String> and scrolls through it showing each element.");
        System.out.println();

        ArrayList<String> places = new ArrayList<>();
        places.add("Colombia");
        places.add("Argentina");
        places.add("Morocco");
        places.add("Oman");
        places.add("Denmark");

        int count = stack(places);
        System.out.println("You entered " + count + " countries.");

    }

    public static void welcome(){ // Exercise 1.
        System.out.println("\"¡I welcome you to the Java course from zero!\".");
    }

    public static void hello(String name){ // Exercise 2.
        System.out.println("Hello " + name + ", you are welcome to this class.");
    }

    public static int subtraction(Integer num1, Integer num2){ // Exercise 3.
        System.out.println("Number 1 is: " + num1 + " ,and numer 2 is: " + num2);
        return num1 - num2;
    }

    public static int square(Integer num) { // Exercise 4.
        System.out.println("The number entered is: " + num);
        return num * num;
    }

    public static int remainder(Integer numRemainder) { // Exercise 5.
        System.out.println("The number entered is: " + numRemainder);
        return numRemainder % 2;
    }

    public static boolean age(Integer numAge) { // Exercise 6.
        System.out.println("The age entered is: " + numAge);
        return numAge >= 18;
    }

    public static int length(String size) { // Exercise 7.
        System.out.println("The text string entered is: " + size);
        return size.length();
    }

    public static double average(int... numbers) { // Exercise 8.
        System.out.println("The numbers entered are: " + Arrays.toString(numbers));
        System.out.println();
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static int factorial(int factorialNumber){ // Exercise 9.
        System.out.println("The number entered is: " + factorialNumber);
        System.out.println();
        int f = 1;
        for (int i = 1; i <= factorialNumber; i++) {
            f *= i;
        }
        return f;
    }

    public static int stack(ArrayList<String> countries){ // Exercise 10.
        System.out.println("The countries entered are:");
        for (String country : countries) {
            System.out.println(country);
        }
        return countries.size();
    }
}
