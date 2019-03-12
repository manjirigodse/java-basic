package com;

/**
 * Created by ritesh on 12/3/19.
 */

public class A {

    public static void main(String[] args) {

        // Object / instance -> is an instance of a class
        Car maruti = new Car(); // creating instance of class. (Instantiation)
        // new -> allocates memory of size Car
        // maruti -> reference variable which refers the allocated memory.

        // Initialize properties
        maruti.engineType = 1;
        maruti.steering = 1;

        // Get the behaviour
        maruti.cooling();
        maruti.speed();
        System.out.println("Object State: " + maruti.engineType  + " " + maruti.steering);

    }

}
