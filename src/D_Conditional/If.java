package D_Conditional;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age > 18){
            System.out.println("The user is of legal age");
        } else if (age < 18){
            System.out.println("The user is a minor");
        } else {
            System.out.println("The user has just turned 18 years old");
        }
    }
}
