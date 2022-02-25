package com.teksystem.models;

public abstract class Vehicle {

    // fields
    protected String vin;
    protected int doors;
    protected String color;


    // constructors
        public Vehicle(String vin, int doors, String color){
            this.vin = vin;
            this.doors = doors;
            this.color = color;
        }

        public Vehicle(){
            this("111",4,"none");
        }


    // methods
        public abstract void acceleration();

        public void breaking(){
            System.out.println("Vehicle Class");
        }
    // getters and setters


    public String getVin() {
        return this.vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
