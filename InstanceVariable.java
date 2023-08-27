class Dog
{ 
    //.....instance variable....
    String name;
    String breed;
    int cost;
}

public class InstanceVariable{
        public static void main(String[] args) 
        {   //executing the value in d reference
            Dog d = new Dog();

            // adding the value in variable
            d.name = "Bishal koirala";
            d.breed = "Husky";
            d.cost = 20000;

            //Producing output
            System.out.println(d.name);
            System.out.println(d.breed);
            System.out.println(d.cost);


        }
    }