package D_Conditional;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
        Scanner sc6 = new Scanner(System.in);

        System.out.print("Enter a first number from one to one hundred:  ");
        int a = sc1.nextInt();

        System.out.print("Enter a second number from one to one hundred:  ");
        int b = sc2.nextInt();

        System.out.print("Enter a positive or negative integer:  ");
        int c = sc3.nextInt();

        System.out.print("Enter a number from 1 to 7: ");
        int d = sc4.nextInt();

        System.out.print("Enter a number. 1 if you are accompanied or 2 if you are alone: ");
        int e = sc5.nextInt();

        System.out.print("Enter a letter of the alphabet: ");
        String f = sc6.nextLine();

        // 1. Sets a user's age and shows whether they can vote (greater than or equal to 18).

        if (a >= 18) {
            System.out.println("You age is: " + a + "." + " You are of legal age and can vote.");
        } else {
            System.out.println("You age is: " + a + "." + " You are a minor and cannot vote.");
        }

        // 2. Declare two numbers and show which one is larger, or if they are equal.

        if (a > b) {
            System.out.println(a + " it's greater than " + b);
        } else if (b > a) {
            System.out.println(b + " it's greater than " + a);
        } else {
            System.out.println(b + " is equal to " + a);
        }

        // 3. Given a number, check if it is positive, negative, or zero.

        if (c > 0) {
            System.out.println(c + " it is a positive number.");
        } else if (c < 0) {
            System.out.println(c + " it is a negative number.");
        } else {
            System.out.println("the number entered is: " + c);
        }

        // 4. Create a program that indicates whether a number is even or odd.

        if (a % 2 == 0) {
            System.out.println("The number entered is: "+ a + " and it is an even number.");
        } else {
            System.out.println("The number entered is: "+ a + " and it is an odd number.");
        }

        // 5. Check if a number is in the range of 1 to 100.

        if (b >= 1 && b <= 100) {
            System.out.println("The number entered is: "+ b + " and it is in the range of one to one hundred.");
        } else {
            System.out.println("The number entered is: "+ b + " and it is outside the range of one to one hundred.");
        }

        // 6. Declares a variable with the day of the week (1-7) and displays its name with switch.

        switch (d) {
            case 1:
                System.out.println("You chose the number: " + d + " that runs to Monday");
                break;
            case 2:
                System.out.println("You chose the number: " + d + " that runs to Tuesday");
                break;
            case 3:
                System.out.println("You chose the number: " + d + " that runs to Wednesday");
                break;
            case 4:
                System.out.println("You chose the number: " + d + " that runs to Thursday");
                break;
            case 5:
                System.out.println("You chose the number: " + d + " that runs to Friday");
                break;
            case 6:
                System.out.println("You chose the number: " + d + " that runs to Saturday");
                break;
            default:
                System.out.println("You chose the number: " + d + " that runs to Sunday");
        }

        // 7. Simulates a note system: displays "Excellent", "acceptable" or "Insufficient" depending on the note (0-100).

        if (a >= 0 && a <= 60) {
            System.out.println("The rating you obtained is: " + a + " Insufficient, you have failed.");
        } else if (a > 60 && a <= 90) {
            System.out.println("The rating you obtained is: " + a + " Acceptable, you have approved..");
        } else {
            System.out.println("The rating you obtained is: " + a + " Excellent, you have approved..");
        }

        // 8. Write a program that determines if you can enter the cinema: you must be at least 15 years old or accompanied.

        if (a >= 15 || e == 1) {
            System.out.println("Congratulations, you can come see the movie.");
        } else {
            System.out.println("Sorry, you can't see the movie, you must be at least 15 years old or accompanied.");
        }

        // 9. Create a program that tells if a letter is a vowel or consonant.

        if (f.equalsIgnoreCase("a") || f.equalsIgnoreCase("e") || f.equalsIgnoreCase("i") || f.equalsIgnoreCase("o") || f.equalsIgnoreCase("u") ) {
            System.out.println("The letter you chose is: " + f + " and it is a vowel.");
        } else {
            System.out.println("The letter you chose is: " + f + " and it is a consonant.");
        }

        // 10. Use three variables a, b, c and show which is the largest number of the three.

        if (a > b && a > c) {
            System.out.println(a + " is greater than " + b + " and " + c);
        } else if (b > a && b > c) {
            System.out.println(b + " is greater than " + a + " and " + c);
        } else if (c > a && c > b) {
            System.out.println(c + " is greater than " + a + " and " + b);
        } else {
            System.out.println(a + " is equal than " + b + " and " + c);
        }
    }
}
