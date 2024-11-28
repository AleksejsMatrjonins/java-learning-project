package lv.acodemy;

import Objects.Car;
import Objects.dog;

public class ObjectExample extends Object{
    public static void main(String[] args) {

        // Encapsulation (Getters, Setters)
        // Inheritance
        // Polymorphism
        // Abstraction

        Car chevrolet = new Car("Green", "Corvette");
        chevrolet.start();
        System.out.println(chevrolet);

        chevrolet.color = "Green";
        chevrolet.model = "Corvette";
        System.out.println(chevrolet);

        // Create BMW object
        // Start your BMW
        // Set color and mode
        //Print object

        Car BMW6ka = new Car();
        BMW6ka.start();
        BMW6ka.color = "Red";
        BMW6ka.model = "M5";
        System.out.println(BMW6ka);

        // Print text: My car model is %s, and color is: %s

        System.out.println(String.format("My car model is %s, and color is %s", BMW6ka.getModel(), BMW6ka.getColor()));

        dog theSharik = new dog();
        theSharik.bark();
        theSharik.eat();
    }
}
