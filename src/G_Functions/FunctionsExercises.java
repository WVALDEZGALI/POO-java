package G_Functions;

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
}
