package com.teksystem.models;

public class Car extends Vehicle {

    // fields

        public static String name = "Jafer";
        private String engineType;
        private double hp;
        private boolean isTransmissionAuto;

    // constructors

    public Car( String vin, int doors, String color, String engineType, double hp, boolean isTransmissionAuto) {
        super(vin,doors,color);
        this.engineType = engineType;
        this.hp = hp;
        this.isTransmissionAuto = isTransmissionAuto;
    }
    public Car(){}

    @Override
    public void acceleration() {
        System.out.printf("vin: %s: 0 to 60 in 4 secs\n", vin);
    }
    @Override
    public void breaking(){
        super.breaking();
        System.out.println("Car Class: Stopping");
    }

    // methods
        public static void printName(){
            System.out.println("The name is: " + name);
        }
    // getters and setters


    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public boolean isTransmissionAuto() {
        return isTransmissionAuto;
    }

    public void setTransmissionAuto(boolean transmissionAuto) {
        isTransmissionAuto = transmissionAuto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineType='" + engineType + '\'' +
                ", hp=" + hp +
                ", isTransmissionAuto=" + isTransmissionAuto +
                ", vin='" + vin + '\'' +
                ", doors=" + doors +
                ", color='" + color + '\'' +
                "} ";
    }
}
