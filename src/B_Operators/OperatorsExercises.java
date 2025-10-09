package B_Operators;

public class OperatorsExercises {
    public static void main(String[] args) {

        // 1. Create a variable with the result of each arithmetic operation
        int a = 2;
        int b = 1;
        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int divide = a / b;
        int remainder = a % b;

        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(divide);
        System.out.println(remainder);

        // 2. Create a variable for each type of assignment operator
        int c = a += 2;
        System.out.println(c);

        int d = a -= 2;
        System.out.println(d);

        int e = a *= 2;
        System.out.println(e);

        int f = a /= 2;
        System.out.println(f);
        System.out.println(a);

        // 3. Print 3 true comparisons, with different comparison operators
        System.out.println(c == 4);
        System.out.println(d != 5);
        System.out.println(e < 6);

        // 4. Print 3 fake comparisons, with different comparison operators
        System.out.println(f > c);
        System.out.println(d == e);
        System.out.println(f < b);

        // 5. Use the logical operator AND &&
        System.out.println(a > b && c > d);

        // 6. Use the logical operator OR ||
        System.out.println(e == f || a != d);

        // 7. It combines both logical operators && and ||
        System.out.println((b == 2 || c != 5) && (d == 3 || f > b));

        // 8. Add some denial
        System.out.println(!(b == 2 || c != 5) && (d == 3 || f > b));

        // 9. Print 4 examples of using unary operators
        c++;
        System.out.println(c);
        d--;
        System.out.println(d);
        ++e;
        System.out.println(e);
        --f;
        System.out.println(f);

        // 10. It combines arithmetic, comparison and logical operators.
        System.out.println((a + b == c - d) && (e * f > a / b));
    }
}
