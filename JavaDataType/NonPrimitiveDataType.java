package JavaDataType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class NonPrimitiveDataType {
    public static void main(String[] args) {
        /*Non-Primitive Data Type or Reference Data Types
        The Reference Data Types will contain a memory address of variable values because the reference types won’t store the variable value directly in memory. They are strings, objects, arrays, etc. */


        /*Classes: Classes are user-defined data type that encapsulate data and behaviour. They define the blueprint for objects. For example */
        
         class Information {
            String name;
            double score;
        }

        /*Arrays: Arrays are collection of elements of the same data type.*/
        int[] numbers = {1,2,3,4,5};
        for (int number : numbers) {
            System.out.println(number);
        }

        /*Strings: Strings are used  to represennt sequece of characters.They are objects of the 'String' class. */
        String greeting = "Hello, world!";
        System.out.println(greeting);

        /*List are dynamic arrays that can grow or shrink in size. They are part of the java collection Framework. */
        ArrayList<String> name = new ArrayList<>();
        name.add("Bishal");
        name.add("kapil");
        name.add("bishnu");
        
        for (String names : name) {
            System.out.println(names);
        }

        /*Maps are key-valeu pairs where each key maps to a corresponding value. They are also part of the java Collection Framework*/
        Map<String, Integer> scores = new HashMap<>();
        scores.put("alice",95);
        scores.put("bishal", 57);

        for(Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /*Enums definnne a set of named constant values.*/
        enum Day {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }
        Day today = Day.WEDNESDAY;
        System.out.println(today);
        
        /*Interfaces define constract that classes must adhere to. */
        interface Shape {
            double calculateArea();
            void display();
        }

        /*Custom Objects: You ca create your own classes and use them to define custom objects. */
        Information myInformation = new Information();
        myInformation.name = "bishal koirala";
        System.out.println(myInformation.name);
    }


}
