package com.fundamentals.java;

import com.fundamentals.lesson10.Lesson10;

import java.awt.*;

/*import com.fundamentals.lesson10.Lesson10;
This class is the starting class of this project
This is an example of a multi-line comment.
 */
public class Main {

    public static int num = 0;

    static {
        System.out.println("Static block 1");
        num = 42;
    }//end static block

static{
    System.out.println("Static block 2");
    num = 62;
    }   // end static block



    public static void main(String[] args) {
        lesson17Example();
        //lesson16Example();
        //lesson15Example();
        //lesson14Example();
        //lab3cont();
        //lesson12Example();
        //truckExample();
        //lesson11Example();
        //lesson10Example();
        //Lesson9example();
        //()beerSong();
        //lesson8Examples1();
        //lesson7Examples();
        //moreLesson6();
        //lesson6Examples();
        //lesson5Examples();
        //houseExample();
    }// end main method


    public static void lesson17Example(){

        Lesson17 myLesson17 = new Lesson17();
        //myLesson17.exampleArrayList1();
        //myLesson17.exampleArrayList2();
        //myLesson17.exampleHashSet();
        myLesson17.exampleHashMap();
    }



    public static void lesson16Example(){
        Lesson16 myLesson16 = new Lesson16();
        myLesson16.showEnum();

        myLesson16.myFavoriteFlavor(Lesson16.IceCreamFlavors. STRAWBERRY);
        DaysOfTheWeek d1[] = DaysOfTheWeek.values();
        for(DaysOfTheWeek day: d1){
            System.out.println(day +" at index "+day.ordinal());
        }

    }



    public static void lesson15Example(){
        int[] myKeys = {0,1,2,3,4,5,6,7,9,9};
        Blackberry myBlackberry = new Blackberry(25,myKeys,0,"Color Screen" );
        myBlackberry.receiveCall();
        AbstractCellPhone myOldPhone = new Blackberry(30,myKeys, 1, "Monochrome");
        myOldPhone.receiveCall();
        myOldPhone.endCall();



    } // end method

public static void lesson14Example(){
       // Lesson14.My_FIRST_FINAL = 10; Can not change value of a final
        int total = Lesson14.My_FIRST_FINAL * 35; // 2019 * 35
        System.out.println(total);

        // Can change the value of a non-final static
        Lesson14.myFirstStatic = 98; // original is 35
        System.out.println(Lesson14.myFirstStatic);

        Lesson14.myFirstStaticMethod(10);

        System.out.println("Block number was "+num);
        Lesson14.MyInnerClass test = new Lesson14.MyInnerClass();
        test.myInnerClass();
}

    public static void lab3cont(){
        Mylab3cont myLab3Cont = new Mylab3cont();
        myLab3Cont.labCont();
        System.out.println();

    }




    public static void lesson12Example() {
        Condo myCondo = new Condo();
        myCondo.doorOpenClose();
        Condo mySecondCondo = new Condo ("railing","Orange", 32, "composite", "steel" );
        System.out.println(mySecondCondo.getDoorColor());
    }
public static void TruckExample() {
    Truck myTruck = new Truck("wheels", "windows", 17, "white");
    System.out.println(myTruck.getColor());
}

    public static void lesson11Example(){
        House house1 = new House();
        House house2 = new House( "white");

    }

    public static void lesson10Example(){
        // Try to see a private method in another class
        Lesson6 myLesson6 = new Lesson6();
        //myLesson6.examplePrivate();// cannot access

        BottlesOfBeerSong song = new BottlesOfBeerSong();
        //song.lesson10Private(); // cannot access
        Lesson10 myLesson = new Lesson10();
       // myLesson.showLesson(); // cannot access
       // myLesson.showProtected(); // cannot access
    }

    public static void Lesson9example () {
        Lesson9 myLesson9 = new Lesson9();
        myLesson9.basicIntArray();
        myLesson9.basicStringArray();
        myLesson9.basicTwoDimensionalArray();
        myLesson9.threedimensionalArray();
        myLesson9.basicJaggedArray();
    }

    public static void beerSong(){


        BottlesOfBeerSong song = new BottlesOfBeerSong();
        song.timeToSing();
    }

    public static void lesson8Examples2(){
        Lesson8 otherLesson = new Lesson8();
        otherLesson.basicWhileExample();
        otherLesson.basicDoWhileExample();
        otherLesson.basicForLoopExample();
        otherLesson.basicBranchingExample();

    }


public static void lesson8Examples1(){
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(5,10); //prints before after
        myLesson8.basicIfExample(5,5); // prints before, if & after
        myLesson8.basicIfElseExample(  10,  12);
        myLesson8.basicIfExample(12,12); // equal
        myLesson8.basicIfElseChainExample ( 42);
        myLesson8.basicIfAndorExample(36);
        myLesson8.basicSwitchExample( 3);
}


    public static void lesson7Examples() {
        Lesson7 myLesson7 = new Lesson7();
        myLesson7.basicMath();
        myLesson7.exampleModulus();
        // myLesson7.addTwoNumbers();
        myLesson7.exampleAssignment1();
        myLesson7.exampleAssignment2();
        myLesson7.exampleRelational();
        myLesson7.exampleIncrement();
        myLesson7.exampleDecrement();



    }

    public static void moreLesson6(){
        Lesson6 myOtherLesson6 = new Lesson6();
        myOtherLesson6.exampleBuilder(  " Spaghetti",2);
        myOtherLesson6.exampleChar();
        myOtherLesson6.exampleEscape();
    }

    public static void lesson6Examples(){
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.exampleConcat(" has awesome donuts" );
        myLesson6.exampleEquals ("LaMars");
        String myLower = myLesson6.exampleLowercase();
        System.out.println(myLower);
        String myUpper = myLesson6.exampleUppercase();
        System.out.println(myUpper);
        myLesson6.exampleLength();



    }







    public static void lesson5Examples(){
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10,12);
        int example = myLesson5.showLocalWithReturn(15,8);
        System.out.println(example);
        myLesson5.showInstanceVariable();
        myLesson5.showConversion();
    }


        public static void houseExample(){
        System.out.println("Welcome to Java");
        House myHouse = new House();
        myHouse.doorOpenClose();
    }
}
