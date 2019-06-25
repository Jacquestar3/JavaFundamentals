package com.fundamentals.java;

/*
* The contents of the class is for Lesson 9
* Arrays
* */

public class Lesson9 {


    public void basicIntArray(){
       int[]intArray = {23, 45, 12, 8, 95, 103,37};
       for(int i = 0; i < intArray.length; i ++){
           System.out.println(intArray[i]);
           // end of loop
        }

    } // end method

    public void basicStringArray(){
        String[] stringArray = new String[4];
        stringArray[0] = "happy";
        stringArray[1] = "tuesday";
        stringArray[2] = "movie";
        stringArray[3] = "grape";
        for(int i = 0; i < stringArray.length; i++){
           System.out.println(stringArray[i]);

        }

    } // end method

    public void basicTwoDimensionalArray(){
        int[] [] myArray ={ {23,45},{35,46},{57,98}};
        for(int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray[i].length; j++){
              System.out.println(myArray[i][j]);
            }
        }

    } // end method


    public void threedimensionalArray(){
        int [][][] threeArray = new int[2][2][2];
        threeArray[0][0][0] = 10;
        threeArray[0][1][0] = 12;
        threeArray[0][0][1] = 13;
        threeArray[0][1][1] = 14;

        threeArray[1][0][0] = 15;
        threeArray[1][1][0] = 16;
        threeArray[1][1][1] = 17;
        threeArray[1][0][1] = 18;

        for(int i = 0; i< threeArray.length; i++){
           for(int j = 0; j < threeArray[i].length; j++){
               for(int k = 0; k < threeArray[j]. length; k++) {
                System.out.println(threeArray[i][j][k]);

               }
           }

        }
    }

    public void basicJaggedArray(){
        String[][] stringArray = new String[1][3];
        stringArray[0][0] = "June";
        stringArray[0][1] = "July";
        stringArray[0][2] = "August";
        for(int i = 0; i < stringArray.length; i ++){
            for(int j = 0; j < stringArray[i].length; j++){
                System.out.println(stringArray[i][j]);
            }
        }


    } // end method



}//end class
