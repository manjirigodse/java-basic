package com;

//POJO Class
public class Car {

    // Constructor -> it is used to initialize the properties at the time of instantiation. / used to initialize the state.
    Car() {
        steering  = 2;
        engineType = 2;
    }

    // State / properties -> steering, engineType --> Variable
    //1     2     3
    public int steering;  // Syntax (<accessSpecifier> <dataType> <variableName>)
    public int engineType;

    // Behaviour  -> Speed, cooling              --> Functions
    public void speed() {
        System.out.println("It runs fast...");

    }

    public void cooling() {
        System.out.println("It is cooling...");
    }
}