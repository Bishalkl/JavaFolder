package OperatorJava;

public class AssignmentOperator {
    public static void main(String[] args) {
        // :Assignment Operators
    /*These operators are used to assign values to a variable. The left side operand of the assignment operator is a variable, and the right side operand of the assignment operator is a value. The value on the right side must be of the same data type of the operand on the left side. Otherwise, the compiler will raise an error. This means that the assignment operators have right to left associativity, i.e., the value given on the right-hand side of the operator is assigned to the variable on the left. Therefore, the right-hand side value must be declared before using it or should be a constant. The general format of the assignment operator is, */

    //_(=) operator
    //This is the most straightforward assignment operator, which is used to assign the value on the right to the variable on the left. This is the basic definition of an assignment operator and how it functions. 
    int num;
    String name;

    num = 12;
    name = "Bishal koirala";
    
    System.out.println(num);
    System.out.println(name);

    /*(-=) operator: 
    This operator is a compound of ‘-‘ and ‘=’ operators. It operates by subtracting the variable’s value on the right from the current value of the variable on the left and then assigning the result to the operand on the left.  */
    num = 12;
    num -= num;
    System.out.println(num);

    /*(+=) operator: 
    This operator is a compound of ‘+’ and ‘=’ operators. It operates by adding the current value of the variable on the left to the value on the right and then assigning the result to the operand on the left. */
    num = 13;
    num += num;
    System.out.println(num);

    /* (*=) operator:
    This operator is a compound of ‘*’ and ‘=’ operators. It operates by multiplying the current value of the variable on the left to the value on the right and then assigning the result to the operand on the left. */
    num = 14;
    num *= num;
    System.out.println(num);

    /*(/=) operator: 
    This operator is a compound of ‘/’ and ‘=’ operators. It operates by dividing the current value of the variable on the left by the value on the right and then assigning the quotient to the operand on the left. */
    num = 17;
    num /= num;
    System.out.println(num);

    /* (%=) operator: 
    This operator is a compound of ‘%’ and ‘=’ operators. It operates by dividing the current value of the variable on the left by the value on the right and then assigning the remainder to the operand on the left. */
    num = 18;
    num %= num;
    System.out.println(num);
    }
}
