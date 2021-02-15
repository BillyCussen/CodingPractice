/*
SelectionSort.java
Billy Cussen
10/02/2021
*/

import java.util.List;
import java.util.LinkedList;

public class SelectionSort<T> {
  
    public static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1;i++){
            int minIndex = i;
            for(int j = minIndex+1; j < arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static<T extends Comparable<T>> void selectionSortGenerics(List<T> list){
        for(int i = 0; i < list.size()-1; i++){
            int minIndex = i;
            for(int j = minIndex+1; j < list.size(); j++){
                if(list.get(j).compareTo(list.get(minIndex))<=-1){
                    minIndex = j;
                }
            }
            T temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }


    public static void main(String [] args){

        int[] arr = new int[]{6,5,4,3,1};
        arr = selectionSort(arr);

        for(int e: arr){
            System.out.println(e);
        }

        List<Integer> myList = new LinkedList<Integer>();
        myList.add(6);
        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(2);
        myList.add(1);
        selectionSortGenerics(myList);
        for(Integer e: myList){
            System.out.println(e);
        }
    }

}
