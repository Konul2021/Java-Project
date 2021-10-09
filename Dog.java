package Labs;

import java.sql.SQLOutput;

public class Dog {

    String name;
    String breed;
    double weight;
String color;

    public Dog(){

    }
    //another comment
    //this is second comment
    //third comment
    //4th comment
    //5th comment

    public Dog(String name, double weight, String breed){
        this.name = name;
        this.weight = weight;
         breed = "Mutt";
    }

    public static void main(String[] args) {

        Dog dog = new Dog("Diamond", 62.5, "APBT" );
        System.out.println(dog.name);
        System.out.println(dog.weight);
        System.out.println(dog.breed);

    }
//Konul Salimova
//October 8th
}

/*


name

breed

weight

Write two constructors:

The no-arg constructor with empty body

A secondary constructor that accepts only name and weight (breed defaults to "Mutt")

Test your code with the Main.java class:
Create a Dog object using both Constructors and print their fields to make sure it's correct.
 */