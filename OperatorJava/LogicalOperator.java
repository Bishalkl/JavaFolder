package OperatorJava;

public class LogicalOperator {
    public static void main(String[] args) {
        /*Logical operators are used to perform logical “AND”, “OR” and “NOT” operations, i.e. the function similar to AND gate and OR gate in digital electronics. They are used to combine two or more conditions/constraints or to complement the evaluation of the original condition under particular consideration. One thing to keep in mind is, while using AND operator, the second condition is not evaluated if the first one is false. Whereas while using OR operator, the second condition is not evaluated if the first one is true, i.e. the AND and OR operators have a short-circuiting effect. Used extensively to test for several conditions for making a decision.*/

        //1.Logical 'AND' Operator (&&)
        // To get true condition both should be true.
        int a = 12 , b = 11 , c = 14 , d = 0;

        if ((a < c) && (a == b)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else {
            System.out.println("False conditions");
        }

        //2.Logical 'OR' Operator (||)
        // To get true condition if one is true then we will get a true condition.
        if ((a < c) || (a == b)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else {
            System.out.println("False conditions");
        }
        
        //3.Logical 'NOT' Operator(!)
        //This logical operator do something opposite reversed the condtion 
        if (!(a > b)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        //
    }
}
