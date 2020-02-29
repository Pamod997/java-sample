package com.pamod.sample;

public class Sensor { //sensor have two properties name , value

    private String name; // make variables for properties
    private double value;
    //by using private we can make variable can only read by this class
    //standard practice make variables as private


    public Sensor() { // default constructor
    }

    public Sensor(String name, double value) { //over right constructor
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;


    }

    @Override
    public String toString() {    //without tostring cannot get the output just right click and genarate tostring()
        return "Sensor{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}

