package JavaDataType;

public class PrimitiveDataType {
    public static void main(String[] args) {
        // Primitive Data Type: such as boolean, char, int, short, byte, long, float, and double
       
        /*int: Used to store integer values.
       Practical Example: Counting the number of items in a shopping cart. */
       int itemCount = 10;
       System.out.println(itemCount);

      /*double: used to stor floating-point number with decimal places. Practical Example : Calculating the average score of students.
       */
      double averageScore = 90.9;
      System.out.println(averageScore);

      /*boolean: Used to store true or false values. Practical Example: Checking if a user is logged in or not. */
      boolean isLoggedIn = true;
      System.out.println(isLoggedIn);

      /*char: Used to store a single character. Practical Example: Storing the first letter of a person's name.*/
      char firstInitial = 'A';
      System.out.println(firstInitial);

      /*String: Used to store sequences of character(text). Practical Example: Storing a person's full name.*/
        String fullName= "Bishal Koirala";
        System.out.println(fullName);

    /*byte: Used to store small integer values. Practical Example: Reading data from a file byte by byte. */
        byte fileByte = 124;
        System.out.println(fileByte);
    
    /*short: Used to store small to medium integer values. Practical Example: Storing the year of a historical event.*/
        short eventYear = 2003;
        System.out.println(eventYear);
    
    /*long: Used to store large integer values.Practical Example: Storing the population.*/
        long population = 100_000_000;
        System.out.println(population);

    
    /*float: Used to store floating-point numbers with decimal place( less precise than double). Practical Example : Calculating the pice of an item with tax.
     */
        float totalPrice = 25.99f;
        System.out.println(totalPrice);
    }
}
