package F_Loops;

import java.util.ArrayList;

public class LoopsExercises {
    public static void main(String[] args) {

        // 1. Print numbers 1 to 10 using while.

        int l = 1;

        while (l <= 10) {
            System.out.println(l);
            l++;
        }

        // 2. Use do-while to display all the values in an ArrayList.

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

        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println("It is a multiple of 5: " + i);
            }
        }
    }
}
