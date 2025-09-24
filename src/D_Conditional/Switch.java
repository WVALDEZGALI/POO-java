package D_Conditional;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sw = new Scanner(System.in);

        System.out.print("Enter a number from one to three: ");
        int day = sw.nextInt();

        switch (day) {
            case 1:
                System.out.println("You entered number one");
                break;
            case 2:
                System.out.println("You entered number two");
                break;
            case 3:
                System.out.println("You entered number three");
                break;
            default:
                System.out.println("Enter a number from one to three.");
        }
    }
}
