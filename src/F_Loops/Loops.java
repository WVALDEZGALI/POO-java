package F_Loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {

        // For

        for (int i = 1; i < 6; i++) {
            System.out.println("Hello JAVA: " + i);
        }

        String[] names = {"Camilo", "Ana", "Mario", "Olga", "Diego",};

        for (int i = 0; i < names.length; i++) { // traverses data structures in a classical way taking into account the index.
            System.out.println(names[i]);
        }

        // For-each

        for (String name: names) {
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number: numbers) {
            System.out.println(number);
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Camilo", "camiloga17310@gmail.com");
        emails.put("Ana", "anyga25@gmail.com");
        emails.put("Mario", "lopezfordauto@gmail.com");

        for (Map.Entry<String, String> email: emails.entrySet()) {
            System.out.println(email);
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }

        // while

        int index = 0;

        while (index <= 20) { // the code is executed until the condition is met.
            System.out.println("Hello JAVA: " + index);
            index++;
        }

        int i = 0;

        while (i < names.length) {
            System.out.println(names[i]);
            i++;
        }

        i = 0;
        boolean find = false;

        while (!find) {
            System.out.println(names[i]);
            if (names[i].equalsIgnoreCase("mario")){
                find = true;
            }
            i++;
        }

        // do while

        i = 0;

        do { // the code is executed even if it is a first time and then if you evaluate the condition.
            System.out.println("Hello JAVA: " + i);
            i++;
        } while (i < 5);

        // break

        for (String name: names) {
            if (name.equalsIgnoreCase("olga")) {
                break;
            }
            System.out.println(name);
        }

        // continue

        for (int p = 1; p <= 10; p++) {
            if (p == 6) {
                continue;
            }
            System.out.println("Hello JAVA: " + p);
        }
    }
}
