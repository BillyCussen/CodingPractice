/*
InsertionSort2.java
Billy Cussen
17/12/2020
*/

import java.util.List;
import java.util.ArrayList;

public class InsertionSort2<T> {
    
    public static <T extends Comparable<T>> List<T> insertSort(List<T> myList){
        for(int i = 1; i < myList.size(); i++){
            T key = myList.get(i);
            int j = i - 1;
            while(j >= 0 && myList.get(j).compareTo(key)>=1){
                myList.set(j+1, myList.get(j));

                j-=1;
            }
            myList.set(j+1, key);
        }
        return myList;
    }

    public static int[] insertionSortArray(int [] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j-=1;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    public static void main(String [] args){

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(10);
        myList.add(8);
        myList.add(6);
        myList.add(4);
        myList.add(2);

        myList = insertSort(myList);

        for(Integer e: myList){
            System.out.print(e+" ");
        }

        int[] arr = new int[]{10,8,6,4,2};
        arr = insertionSortArray(arr);
        for(int i = 0; i < arr.length;i++){
            if(i == 0){
                System.out.println("\n");
            }
            System.out.print(arr[i]+" ");
        }
    }

}
