package com.fundamentals.java;
import java.util.*;

/*
*The java.util.* should not bu used in favor of individual imports due to memory limitations.
* You do not need imports of classes that you will never use.
* This class goes over Lesson17 content
* Collections Framework
* */
public class Lesson17 {

    public void exampleArrayList1(){
        List<String> list = new ArrayList<>();
        list.add("Happy");
        list.add("Tuesday");
        list.add("Not Monday");
        list.add("where\'s Friday");

        for(int i = 0; i < list.size() ; i++){
            System.out.println(list.get(i));
        }


    }// end method

    public void exampleArrayList2(){
        ArrayList <Integer> myList = new ArrayList<>();
        myList.add(23);
        myList.add(42);
        myList.add(103);
        myList.add(3);

        for(int value = 0; value < myList.size(); value++){
            System.out.println(myList.get(value));
        }

        //Foreach version
        for (Integer integer : myList){
            System.out.println(integer);
        }

    }// end method

   public void exampleHashSet(){
       HashSet<String> myHash = new HashSet<>();
       myHash.add("Firecrackers");
       myHash.add("Sparklers");
       myHash.add("Fountains");
       myHash.add("Firecrackers");
       Iterator<String> iterate = myHash.iterator();
       while(iterate.hasNext()){
           System.out.println(iterate.next());
       }

   }//end method

    public void exampleHashMap(){
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(10, "Happy");
        myMap.put(20, "Days");
        myMap.put(30, "Are Here");
        myMap.put(40, "Happy");

        for(Map.Entry<Integer, String> map: myMap.entrySet()){
            System.out.println(map.getKey() +" = "+map.getValue());
        }




    }//end method




}// end class
