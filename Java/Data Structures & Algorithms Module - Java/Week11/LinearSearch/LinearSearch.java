/*
LinearSearch.java
Billy Cussen
15/12/2020
*/

import java.util.List;
import java.util.ArrayList;

public class LinearSearch<T>{

    public static boolean linearSearchArrays(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> boolean linearSearchGenerics(List<T> myList, T key){
        for(int i = 0; i < myList.size();i++){
            if(myList.get(i).compareTo(key)==0){
                return true;
            }
        }
        return false;
    }

    public static void main(String [] args){

        int[] arr = new int[]{5,6,7,8,9,10,54,60,43};
        System.out.println("Does Array Contain 60: "+linearSearchArrays(arr, 60));
        System.out.println("Does Array Contain 6: "+linearSearchArrays(arr, 6));
        System.out.println("Does Array Contain 99: "+linearSearchArrays(arr, 99));

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(5);
        myList.add(23);
        myList.add(56);
        myList.add(72);
        myList.add(99);
        myList.add(1);

        System.out.println("Does List Contain 1: "+linearSearchGenerics(myList, 1));
        System.out.println("Does List Contain 99: "+linearSearchGenerics(myList, 99));
        System.out.println("Does List Contain 43: "+linearSearchGenerics(myList, 43));

    }


}