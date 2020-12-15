/*
BubbleSort1.java
Billy Cussen
15/12/2020
*/

import java.util.List;
import java.util.ArrayList;

public class BubbleSort1<T>{

    public static String bubbleSortArrays1(int[] arr){
        String result = "";
        int position = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return printArrays(arr, result, position);
    }

    private static String printArrays(int[] arr, String result, int position){
        if(position == arr.length){
            return result;
        }
        result+=arr[position]+" ";
        return printArrays(arr, result, ++position);
    }

    public static <T extends Comparable<T>> String bubbleSortGenerics1(List<T> myList){
        String result = "";
        for(int i = 0; i < myList.size(); i++){
            for(int j = 0; j < myList.size()-1; j++){
                if(myList.get(j).compareTo(myList.get(j+1))>=1){
                    T temp = myList.get(j);
                    myList.set(j,myList.get(j+1));
                    myList.set(j+1,temp);
                }
            }
        }
        return printList(myList,result);
    }

    private static String printList(List myList, String result){
        if(myList.size()<=0){
            return result;
        }
        result+=myList.get(0)+" ";
        myList.remove(0);
        return printList(myList,result);
    }

    public static void main(String [] args){

        int[] arr1 = new int[]{5,4,3,2,1};

        System.out.println("***ARRAY BEFORE BUBBLE SORT***");
        for(int i = 0; i < arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\n***ARRAY AFTER BUBBLE SORT***\n"+bubbleSortArrays1(arr1)+"\n");


        List<Integer> myList = new ArrayList<Integer>();
        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(2);
        myList.add(1);

        System.out.println("***GENERIC LIST BEFORE BUBBLE SORT***");
        for(Integer e: myList){
            System.out.print(e + " ");
        }
        System.out.println("\n***GENERIC LIST AFTER BUBBLE SORT***\n"+bubbleSortGenerics1(myList)+"\n");
    }


}