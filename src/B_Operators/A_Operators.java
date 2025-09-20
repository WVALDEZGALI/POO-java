package B_Operators;

public class A_Operators {
    public static void main(String[] args) {

        double a = 8;
        var b = 5;
        // arithmetic operators
        System.out.println(a + b); // sum
        System.out.println(a - b); // subtraction
        System.out.println(a * b); // multiplication
        System.out.println(a / b); // divide
        System.out.println(a % b); // remainder

        // assignment operators
        a = b;
        System.out.println(a);
        a = b * 2;
        System.out.println(a);
        a += 2;
        System.out.println(a);
        a -= 5;
        System.out.println(a);
        a *= 3;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 3;
        System.out.println(a);

        // comparison operators

        System.out.println(a == b);
        System.out.println(a == 1.5);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);



    }
}
