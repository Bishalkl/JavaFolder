package OperatorJava;

public class RelationOperator {
    public static void main(String[] args) {
        /*Java Relational Operators are a bunch of binary operators used to check for relations between two operands, including equality, greater than, less than, etc. They return a boolean result after the comparison and are extensively used in looping statements as well as conditional if-else statements and so on. The general format of representing relational operator is: */
        
        //Operator 1: (==)
        int var1 = 5, var2 = 16, var3 = 5;
        System.out.println(var1 == var2);
        System.out.println(var1 == var3);

        // Operator2:(!=)
        System.out.println(var1 != var2);
        System.out.println(var1 != var3);

        //Operator3:(>)
        System.out.println(var1 > var2);
        System.out.println(var1 > var3);

        //operator4:(<)
        System.out.println(var1 < var2);
        System.out.println(var1 < var3);

        //operator5:(>=)
        System.out.println(var1 >= var2);
        System.out.println(var1 >= var3);

        //operator6:(<=)
        System.out.println(var1 <= var2);
        System.out.println(var1 <= var3);

    }
}
