/*
SelectionSort.java
Billy Cussen
17/12/2020
*/

import java.util.List;
import java.util.ArrayList;

public class SelectionSort<T>{

    public static int[] selectionSort(int[] arr){

        for(int i = 0; i < arr.length-1; i++){
            int minIndex = 1;
            for(int j = minIndex+1; j < arr.length; j++){
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static <T extends Comparable<T>> List<T> selectionSortGenerics(List<T> list){
        for(int i = 0; i < list.size()-1; i++){
            int minIndex = 1;
            for(int j = minIndex+1; j < list.size(); j++){
                if(list.get(j).compareTo(list.get(minIndex))<=-1){
                    minIndex = j;
                }
            }
            T temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
        return list;
    }

    public static void main(String [] args){

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(10);
        myList.add(8);
        myList.add(6);
        myList.add(4);
        myList.add(2);

        myList = selectionSortGenerics(myList);
        for(Integer e: myList){
            System.out.print(e+" ");
        }

        int[] arr = new int[]{10,8,6,4,2};
        arr = selectionSort(arr);
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                System.out.println("\n");
            }
            System.out.print(arr[i]+" ");
        }

    }


}