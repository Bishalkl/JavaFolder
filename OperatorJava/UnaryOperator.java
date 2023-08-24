package OperatorJava;

public class UnaryOperator {
    public static void main(String[] args) {
        // :Unary Operator

        // :Unary minus(-)
        // This operator can be used to conver a positive value to a negative one.
        int a = 12;
        a = -a;
        System.out.println("Result = " + a);

        // :'NOT' Operator(!)
        // This is used to convert true to false or vice versa. Basically, it reverses the logical state of an operand.
        boolean cond1 = true;
        boolean  cond2 = false;
        int b = 10 , c = 14;

        // without using 'NOT' operator
        System.out.println("cond1 is " + cond1);
        System.out.println("cond1 is " + cond2);
        System.out.println("(b < c ) is " + (a < b));
        System.out.println("(b > c ) is " + (a > b));

        // With using 'NOT' operator
        System.out.println("Now cond1 is " + !cond1);
        System.out.println("Now cond1 is " + !cond2);
        System.out.println("(b < c ) is " + !(a < b));
        System.out.println("(b > c ) is " + !(a > b));

        // :Increment(++)
        // It is used to increment the value of an integer. It can be used in two seprate ways.

        //:Post-increment operator
        // when placed after the variable name, the value of the operand is increment but the previous value is retained temporarily until the execution of this statement and it gets update before the execution of the next statement.
        int d = 4;
        d++;
        System.out.println(d);

        //:Pre-increment operator
        // When placed before the variable name, the operand's value is incremented instantly.
        int e = 5;
        ++e;
        System.out.println(e);

        //:Decrement(-)
        // It is used to decremet the value of an integer. It can be used in two separate ways.

        // :Post-decrement operator
        // When placed after the variable name, the value of the operand is decremented but the previous values is retained  temporarily until the execution of this statement and it gets updated before the executionn of the next statement.
        int f = 6;
        f--;
        System.out.println(f);

        // :Pre-decrement operator
        // When placed before the variable name, the operand's value is decremented instantly.
        int g = 7;
        --g;
        System.out.println(g);

        // Bitwise Complement(~)
        // This unary operator returns the one's complement representation of the input value or operand, i.e, with all bits inverted , which means it makes ever 0 + 1, and every 1 + 0.
        int h = 1;
        int i = -3;
        
        System.out.println(h + "'s bitwise complement = " + ~h);
        System.out.println(i + "'s bitwise complement = " + ~i);

    }
}
