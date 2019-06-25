package com.fundamentals.java;

/*
 *
 * This class demonstrates Control Flow using a song.
 * */
public class BottlesOfBeerSong {

    private void lesson10Private(){
        System.out.println("This is a private method");
    }

     void timeToSing() {
        int bottlesofBeer = 99;
        String word = "bottles", results = "";

        while (bottlesofBeer > 0) {
            if (bottlesofBeer == 1) {
                word = "bottle";
            } // end if

            System.out.println(bottlesofBeer + " " + word + " of Beer on the Wall");
            System.out.println(bottlesofBeer + " " + word + " of Beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            bottlesofBeer--;

            if (bottlesofBeer > 0) {
                System.out.println(bottlesofBeer + " " + word + " of Beer on the Wall");
            } else {
                System.out.println("No more bottles of Beer on the Wall");
            } // end if/else


        } // end while
    }//end method
} // end class


