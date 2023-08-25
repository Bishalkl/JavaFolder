package OperatorJava;

public class BitwiseOperator {
    public static void main(String[] args) {
        /*Bitwise Operators
    Bitwise operators are used to performing the manipulation of individual bits of a number. They can be used with any integral type (char, short, int, etc.). They are used when performing update and query operations of the Binary indexed trees. */

    //1.Bitwise OR (|)
    int a = 5;
    int b = 10;
    System.out.println((a | b));

    //2.Bitwise AND (&)
    System.out.println((a & b ));

    //3.Bitwise XOR (^)
    System.out.println((a ^ b));

    //4.Bitwise Complement (~)
    System.out.println(~a);
    }
}
