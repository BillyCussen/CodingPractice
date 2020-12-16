/*
BubbleSort2.java
Billy Cussen
16/12/2020
*/

import java.util.List;
import java.util.ArrayList;

public class BubbleSort2<T>{

    public static <T extends Comparable<T>> List<T> bubbleSortGenerics(List<T> myList){

        for(int i = 0; i < myList.size();i++){
            for(int j = 0; j < myList.size()-1;j++){
                if(myList.get(j).compareTo(myList.get(j+1)) >= 1){
                    T temp = myList.get(j);
                    myList.set(j, myList.get(j+1));
                    myList.set(j+1, temp);
                }
            }
        }
        return myList;
    }

    public static int[] bubbleSortArray(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray.length-1;j++){
                if(myArray[j]>myArray[j+1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }
        return myArray;
    }


    public static void main(String[]args){

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(10);
        myList.add(9);
        myList.add(8);
        myList.add(7);
        myList.add(6);
        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(2);
        myList.add(1);

        List<Integer> myListSorted = bubbleSortGenerics(myList);

        for(Integer e: myListSorted){
            System.out.print(e + " ");
            
        }

        int[] myArray = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] myArraySorted = bubbleSortArray(myArray);
        for(int i = 0; i < myArraySorted.length; i++){
            if(i == 0){
                System.out.println("\n");
            }
            System.out.print(myArraySorted[i]+" ");
        }
    }


}