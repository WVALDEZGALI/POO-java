package G_Functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {

        sendEmail();
        sendEmailToUser("camiloga17310@gmail.com");
        sendEmailToUser("camiloga17310@gmail.com", "Camilo");
        var users = new ArrayList<>(Arrays.asList("Camiloga17310@gmail.com", "Annyga2030@hotmail.com", "Holamundo@gmail.com"));
        sendEmailToUser(users);

        var state = sendEmailWithState("camiloga17310@gmail.com");
        System.out.println(state);

        System.out.println(sendEmailWithState(""));

    }

    // Function without parameters or return

    public static void sendEmail() {
        System.out.println("The mail is sent");
    }

    // Function with parameters

    public static void sendEmailToUser(String email) {
        System.out.println("The mail is sent to " + email);
    }

    // Overload function

    public static void sendEmailToUser(String email, String name) {
        System.out.println("The mail is sent to " + name + " (" + email + ")");
    }

    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email: emails) {
            sendEmailToUser(email);
        }

    }

    // Return function

    public static boolean sendEmailWithState(String email) {
        if (email.isEmpty()){
            return false; // The moment a function returns, execution ends
        }

        System.out.println("The mail is sent to " + email);
        return true;
    }
}
