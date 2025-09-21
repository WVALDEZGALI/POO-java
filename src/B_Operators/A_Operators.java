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

        // logical operators
        // AND &&

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // OR ||

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // NOT !

        System.out.println(!true);
        System.out.println(!false);

        // unary operators
        var c = 0; var d = 0; var e = 0; var f = 0; var g = 1; var h = 1;

        System.out.println(+c);
        System.out.println(-d);
        System.out.println(++e);
        System.out.println(--f);
        System.out.println(g++);
        System.out.println(g);
        System.out.println(h--);
        System.out.println(h);





    }
}
