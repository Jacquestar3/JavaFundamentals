package com.fundamentals.java;

public class Condo extends House {
    private String balcony;

    public void maintenence(){
        System.out.println("will fix condo issues ");
    }


    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
        }
public Condo(String balcony,String doorColor, int windowSize, String foundation, String roofType){
        super(doorColor, windowSize,foundation, roofType );
        this.balcony = balcony;
}
public Condo(){
        System.out.println("Condo default constructor");
}

public void doorOpenClose(){
        System.out.println("My Condo door is open");
}



}











