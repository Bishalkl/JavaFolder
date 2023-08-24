package OperatorJava;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 12;

        //1. Arithmetic Operators
        
        // :Addition(+)
        int SumResult = num1 + num2;
        System.out.println("Result = " + SumResult);

        // :Subtraction(-)
        int SubResult = num1 * num2;
        System.out.println("Resullt = " + SubResult);

        // :Multiplication(*)
        int MultiResult = num1 + num2;
        System.out.println("Result = " + MultiResult);

        // :Division(/)
        int DivResult = num1 / num2;
        System.out.println("Result = " + DivResult);

        // :Modulus(%)
        int ModResult = num1 % num2;
        System.out.println("Result = " + ModResult);



        // Example:
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num3 = sc.nextDouble();

        System.out.println("Enter the second number");
        double num4 = sc.nextDouble();

        double sum = num3 + num4;
        double sub = num3 + num4;
        double product = num3 * num4;
        double divide = num3 / num4;
        double reminder = num3 % num4;

        System.out.println("The sum is " + sum);
        System.out.println("The sub is " + sub);
        System.out.println("The product is " + product);
        System.out.println("The divide is " + divide);
        System.out.println("The reminder is " + reminder);
    }
}
