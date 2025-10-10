package F_Loops;

import java.util.*;

public class LoopsExercises {
    public static void main(String[] args) {

        // 1. Print numbers 1 to 10 using while.

        System.out.println("Exercise 1: Print numbers 1 to 10 using while.");
        System.out.println();
        int l = 1;

        while (l <= 10) {
            System.out.println(l);
            l++;
        }

        // 2. Use do-while to display all the values in an ArrayList.
        System.out.println();
        System.out.println("Exercise 2: Use do-while to display all the values in an ArrayList.");
        System.out.println();

        ArrayList<String> names = new ArrayList<>();

        names.add("Camilo");
        names.add("Ana");
        names.add("Mario");
        names.add("Olga");
        names.add("Diego");

        int p = 0;

        do {
            System.out.println(names.get(p));
            p++;
        } while (p < names.size());

        // 3. Print the multiples of 5 from 1 to 50 using for.
        System.out.println();
        System.out.println("Exercise 3: Print the multiples of 5 from 1 to 50 using for.");
        System.out.println();

        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println("It is a multiple of 5: " + i);
            }
        }

        // 4. Go through an Array of 5 numbers and print the total sum.
        System.out.println();
        System.out.println("Exercise 4: Go through an Array of 5 numbers and print the total sum.");
        System.out.println();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int total = 0;

        for (Integer number : numbers) {
            total = total + number;
        }
        System.out.println(numbers);
        System.out.println(total);

        // 5. Use a for to cycle through an Array and display its values.
        System.out.println();
        System.out.println("Exercise 5: Use a for to cycle through an Array and display its values.");
        System.out.println();
        System.out.println(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        // 6. Use for-each to navigate a HashSet and a HashMap.
        System.out.println();
        System.out.println("Exercise 6: Use for-each to navigate a HashSet and a HashMap.");
        System.out.println();

        HashSet<String> country = new HashSet<>();

        country.add("Colombia");
        country.add("Argentina");
        country.add("Chile");
        country.add("Peru");
        country.add("Venezuela");

        System.out.println("Set");
        System.out.println();

        for (String countries : country ) {
            System.out.println(countries);
        }

        HashMap<String, String> nationalities = new HashMap<>();

        nationalities.put("Colombia", "Colombian");
        nationalities.put("Argentina", "Argentino");
        nationalities.put("Chile", "Chilean");
        nationalities.put("Peru", "Peruvian");
        nationalities.put("Venezuela", "venezuelan");

        System.out.println();
        System.out.println("Map");
        System.out.println();

        for (Map.Entry<String, String> nationality : nationalities.entrySet()){
            System.out.println(nationality);
        }

        // 7. Print numbers 10 through 1 (descending) with a for loop.
        System.out.println();
        System.out.println("Exercise 7: Print numbers 10 through 1 (descending) with a for loop.");
        System.out.println();

        int totalSubtraction = 11;

        for (int i = 0; i < 10; i++) {
            totalSubtraction = totalSubtraction -1;
            System.out.println(totalSubtraction);
        }

        // 8. Use continue to skip multiples of 3 from 1 to 20.
        System.out.println();
        System.out.println("Exercise 8: Use continue to skip multiples of 3 from 1 to 20.");
        System.out.println();

        for (int j = 1; j <= 20; j++) {
            if (j % 3 == 0) {
                continue;
            }
            System.out.println(j);
        }

        // 9. Use break to stop a loop when you find a negative number in an array.
        System.out.println();
        System.out.println("Exercise 9: Use break to stop a loop when you find a negative number in an array.");
        System.out.println();

        ArrayList<Integer> theNumbers = new ArrayList<>();

        theNumbers.add(18);
        theNumbers.add(30);
        theNumbers.add(47);
        theNumbers.add(1);
        theNumbers.add(-25);
        theNumbers.add(100);
        theNumbers.add(255);

        System.out.println(theNumbers);

        for (int theNumber : theNumbers ) {
            System.out.println(theNumber);
            if (theNumber+theNumber < 0) {
            break;
            }
        }

        // // 10. Create a program that calculates the factorial of a given number.
        System.out.println();
        System.out.println("Exercise 10: Create a program that calculates the factorial of a given number.");
        System.out.println();

        System.out.println("Enter a positive integer: ");
        Scanner enter = new Scanner(System.in);
        int factorialNumber = enter.nextInt();


        int factorial = 1;
        for (int i = 1; i <= factorialNumber; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + factorialNumber + " es " + factorial);

        enter.close();





    }
}
