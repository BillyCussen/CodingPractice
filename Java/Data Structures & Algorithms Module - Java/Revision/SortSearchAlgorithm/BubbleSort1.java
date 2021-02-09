/*
BubbleSort1.java
Billy Cussen
08/02/2021
*/

import java.util.List;
import java.util.LinkedList;

public class BubbleSort1<T> {
    
    public static void bubbleSortArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static<T extends Comparable<T>> void bubbleSortGenerics(List<T> list1){
        for(int i = 0; i < list1.size(); i++){
            for(int j = 0; j < list1.size()-1; j++){
                if(list1.get(j).compareTo(list1.get(j+1))>=1){
                    T temp = list1.get(j);
                    list1.set(j, list1.get(j+1));
                    list1.set(j+1, temp);
                }
            }
        }
    }

    public static void main(String[]args){

        int[] arr1 = new int[]{5,4,3,2,1};
        List<Integer> myList = new LinkedList<Integer>();
        myList.add(10);
        myList.add(8);
        myList.add(6);
        myList.add(4);
        myList.add(2);

        bubbleSortArray(arr1);
        bubbleSortGenerics(myList);

        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        for(Integer e: myList){
            System.out.println(e);
        }

    }



}
