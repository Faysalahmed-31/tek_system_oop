package com.teksystem;

import com.teksystem.models.Car;
import com.teksystem.models.Vehicle;

public class Main {

    public static void main(String[] args) {


        // Scanner input = new Scanner(System.in);

        Vehicle c1 = new Car("12345", 2, "red", "gas", 300, true);
        Object c2 = new Car("12345", 2, "red", "gas", 300, true);
        // casting to get methods from car
        ((Car)c1).getHp();
        // casting to get methods from car
        ((Car)c2).isTransmissionAuto();
        c1.acceleration();
        c1.breaking();
        System.out.println(Car.name);
        Car.name = "Raheem";
        Car.printName();

        System.out.println("Car: " + Car.name);
        System.out.println("c1: " + c1.name);

        System.out.println(c1);


    } // main
} // class
