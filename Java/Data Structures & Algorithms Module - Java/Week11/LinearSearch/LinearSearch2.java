/*
LinearSearch2.java
Billy Cussen
16/12/2020
*/

import java.util.List;
import java.util.ArrayList;

public class LinearSearch2<T>{

    public static <T extends Comparable<T>> boolean linearSearchGenerics(List<T> myList, T key){
        for(int i = 0; i < myList.size();i++){
            if(myList.get(i).compareTo(key)==0){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchArray(int[] myArray, int key){
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i]==key){
                return true;
            }
        }
        return false;
    }

    public static void main(String [] args){

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        int[] myArray = new int[]{1,2,3,4,5,6,7,8,9,10};

        System.out.println("Does List contain 2: "+linearSearchGenerics(myList, 2));
        System.out.println("Does List contain 200: "+linearSearchGenerics(myList, 200));
        System.out.println("Does List contain 4: "+linearSearchGenerics(myList, 4));
        System.out.println("Does List contain 10: "+linearSearchGenerics(myList, 10));

        System.out.println("Does Array contain 2: "+linearSearchArray(myArray, 2));
        System.out.println("Does Array contain 200: "+linearSearchArray(myArray, 200));
        System.out.println("Does Array contain 4: "+linearSearchArray(myArray, 4));
        System.out.println("Does Array contain 60: "+linearSearchArray(myArray, 60));
    }

}