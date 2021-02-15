/*
SelectionSort2.java
Billy Cussen 
10/02/2021
*/

import java.util.List;
import java.util.LinkedList;

public class SelectionSort2<T> {
  
    public static void selectionSort(int [] arr){
        for(int i = 0; i < arr.length-1;i++){
            int minIndex = i;
            for(int j = minIndex+1; j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static <T extends Comparable<T>> void selectionSortGenerics(List<T> list){
        for(int i = 0; i < list.size()-1; i++){
            int minIndex = i;
            for(int j = minIndex+1;j<list.size(); j++){
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

        int[] arr = new int[]{1, 30, 27, 50, 4, 2, 88};
        selectionSort(arr);

        for(int e: arr){
            System.out.println(e);
        }

        List<Integer> myList = new LinkedList<Integer>();
        myList.add(1);
        myList.add(30);
        myList.add(27);
        myList.add(50);
        myList.add(4);
        myList.add(2);
        myList.add(88);
        selectionSortGenerics(myList);
        for(Integer e: myList){
            System.out.println(e);
        }
    }

}
