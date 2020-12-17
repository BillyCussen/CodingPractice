/*
InsertionSort.java
Billy Cussen
16/12/2020
*/

import java.util.List;
import java.util.ArrayList;

public class InsertionSort<T>{

    public static void insertionSort(int[] myArray){
        for(int i = 1; i < myArray.length;i++){
            int key = myArray[i];
            int j = i-1;
            while(j>=0 && myArray[j]>key){
                System.out.println("Comparing " + key + " to " + myArray[j]);
                myArray[j+1] = myArray[j];
                j = j-1;
            }
            System.out.println("Placing " + key + " before " + myArray[j+2]);
            myArray[j+1] = key;
        } 
    }

    public static int[] insertionSort2(int[] myArray){
        for(int i = 1; i < myArray.length; i++){
            int key = myArray[i];
            int j = i -1;
            while(j>=0 && myArray[j]>key){
                myArray[j+1] = myArray[j];
                j-=1;
            }
            myArray[j+1] = key;
        }
        return myArray;
    }

    public static <T extends Comparable<T>> List<T> insertionSortGenerics(List<T> myList){
        for(int i = 1; i < myList.size(); i++){
            T key = myList.get(i);
            int j = i - 1;
            while(j>=0 && myList.get(j).compareTo(key)>=1){
                myList.set(j+1, myList.get(j));
                j-=1;
            }
            myList.set(j+1, key);
        }
        return myList;
    }

    public static void main(String[]args){

        int[] myArray = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] myArraySorted = insertionSort2(myArray);
        for(int i = 0; i < myArraySorted.length; i++){
            System.out.print(myArraySorted[i]+" ");
            if(i == myArraySorted.length-1){
                System.out.println("\n");
            }
        }

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(10);
        myList.add(8);
        myList.add(6);
        myList.add(4);
        myList.add(2);
        myList = insertionSortGenerics(myList);
        for(Integer e: myList){
            System.out.print(e+" ");
        }
    }

}