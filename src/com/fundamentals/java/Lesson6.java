package com.fundamentals.java;


/*
The contents of this class is for the Lesson 6 Slide Deck.
Stings & More
*/
public class Lesson6 {

    String myString = "LaMars";

    // Method shows String method for charAt
    public void exampleCharAt() {
        char myChar = myString.charAt(2);
        System.out.println(myChar);
    }

    //String literal, This example is a assigning a string literal to a string instance
    public void exampleStringLiteral(){
        exampleStringLiteral();
        System.out.println();

    }




    public void exampleConcat(String value) {
        String happy = myString.concat(value);
        System.out.println(happy);
    }


    public void exampleEquals(String donut) {
        boolean myBoolean = myString.equals(donut);
        System.out.println(myBoolean);
    }

    public String exampleLowercase() {
        return myString.toLowerCase();
    }


    public String exampleUppercase() {
        return myString.toUpperCase();


    }

    public void exampleLength(){
        int length = myString.length();
        System.out.println(length);

    }

    public void exampleBuilder(String food, int value){
        StringBuilder build = new StringBuilder();
        build.append("My favorite food");
        build.append(food).append(" and I ate ")
                .append(value).append(" plates of it.");
        String fav = build.toString();
        System.out.println(fav);

    }

    public void exampleChar(){
        char c1 = 't';
        char c2 = '\u00A7';
        System.out.println(c2);

    }

    public void exampleEscape() {
        System.out.println("That\'s a cool toy.\tCan I\n play with it.");

    }
    }


