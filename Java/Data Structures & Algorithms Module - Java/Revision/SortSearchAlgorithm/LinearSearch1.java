/*
LinearSearch1.java
Billy Cussen
15/02/2021
*/

import java.util.List;
import java.util.LinkedList;

public class LinearSearch1 {
    
    public static boolean linearSearchArrays(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> boolean linearSearchGenerics(List<T> list, T key){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).compareTo(key)==0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        int[] arr = new int[]{5,4,3,2,1};
        List<String> myList = new LinkedList<String>();
        myList.add("Hello");
        myList.add("Hi");
        myList.add("Greetings");
        myList.add("Goodbye");
        myList.add("Bye");
        myList.add("Farewell");

        System.out.println("Array contains 5: "+linearSearchArrays(arr, 5));
        System.out.println("Array contains 1: "+linearSearchArrays(arr, 1));
        System.out.println("Array contains 20: "+linearSearchArrays(arr, 20));
        System.out.println("List Contains \"Hello\": "+linearSearchGenerics(myList, "Hello"));
        System.out.println("Array contains \"Farewell\": "+linearSearchGenerics(myList, "Farewell"));
        System.out.println("Array contains \"Guten Tag\": "+linearSearchGenerics(myList, "Guten Tag"));

    }

}
