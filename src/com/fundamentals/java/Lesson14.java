package com.fundamentals.java;

/*
 * This class goes over Lesson 14 content
 * Static
 *
 *
 * */
public class Lesson14 {


        public static final int My_FIRST_FINAL = 2019;

        public static int myFirstStatic = 35;

        public static void myFirstStaticMethod(int num) {
                int total = My_FIRST_FINAL * num;
                System.out.println(total);


        }//end methods

         public static class MyInnerClass {
         public void myInnerClass(){
                 System.out.println(myFirstStatic);
                        }

                }
        }





