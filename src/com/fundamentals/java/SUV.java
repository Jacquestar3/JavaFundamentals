package com.fundamentals.java;

public class SUV extends Truck {

    private String thirdRowSeat;

    public SUV() {
        System.out.println("Default SUV Constructor");

    }

    public SUV(String thirdRowSeat) {
        this.thirdRowSeat = thirdRowSeat;
    }

    public void openHatch() {
       System.out.println(" The hatch opens");
     }

    public void openHatch(String openHatch){

        System.out.println(openHatch);
        }

@Override
    public void driving() {
        System.out.println("suv Driving");
    }





}





