/*
SelectionSort3.java
Billy Cussen
15/02/2021
*/

import java.util.List;
import java.util.LinkedList;

public class SelectionSort3 {
    
    public static void selectionSortArrays(int [] arr){
        for(int i = 1; i < arr.length; i++){
            int minIndex = i;
            for(int j = 0; j < arr.length-1;j++){
                if(arr[j] > arr[minIndex]){
                    int temp = arr[j];
                    arr[j] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
    }

    public static<T extends Comparable<T>> void selectionSortGenerics(List<T> myList){
        for(int i = 1; i < myList.size(); i++){
            int minIndex = i;
            for(int j = 0; j < myList.size()-1; j++){
                if(myList.get(j).compareTo(myList.get(minIndex))>=1){
                    T temp = myList.get(j);
                    myList.set(j, myList.get(minIndex));
                    myList.set(minIndex, temp);
                }
            }
        }
    }

    public static void main(String [] args){

        int[] arr = new int[]{5,4,3,2,1};
        int[] arr1 = new int[]{1, 55, 3, 73, 2};
        selectionSortArrays(arr);
        selectionSortArrays(arr1);
        System.out.println("***SELECTION SORT ARRAYS");
        for(int i: arr){
            System.out.println(i);
        }
        for(int i: arr1){
            System.out.println(i);
        }

        List<Integer> myList = new LinkedList<Integer>();
        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(2);
        myList.add(1);

        List<Integer> myList1 = new LinkedList<Integer>();
        myList1.add(1);
        myList1.add(55);
        myList1.add(3);
        myList1.add(73);
        myList1.add(2);

        selectionSortGenerics(myList);
        selectionSortGenerics(myList1);

        System.out.println("***SELECTION SORT GENERICS");
        for(Integer e: myList){
            System.out.println(e);
        }
        for(Integer e: myList1){
            System.out.println(e);
        }
    }

}
