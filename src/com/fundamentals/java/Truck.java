package com.fundamentals.java;


import javax.swing.*;
import java.awt.*;

public class  Truck {
     private String wheels;
     private int windows;
     private String box;
     private String color;

    public Truck() {
        System.out.println("This is the default constructor");

    }

    public Truck(String color) {
        this(color, "chrome", 28, "flat");
        System.out.println("The truck is" + color);

    }

    public Truck(String color, String wheels, int window, String box) {

        this.windows = windows;
        this.box = box;
        this.color = color;
        this.wheels = wheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setBox(String getsetBox){
        this.box = box;
    }

    public void setWheels(String getsetWheels){
        this.wheels = wheels;
    }

    public void setWindows (String getwindows) {
        this.windows = windows;
    }

    public String getWheels() {
        return wheels;
    }


    public String getBox() {
        return box;
    }

    public String getcolor() {
        return color;
    }

    public int getwindows() {
        return windows;
    }

    public void driving() {
       System.out.println("Driving");
    }
}


