/*
BubbleSort.java
Billy Cussen
14/12/2020
*/
import java.util.List;
import java.util.ArrayList;

public class BubbleSort<T>{

    public static void bubbleSortArray(int [] arr){

        for(int i = 0; i < arr.length -1 ; i++){
            System.out.println("Bubble Sort Starting at position "+(i+1));
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j]>arr[j+1]){
                    System.out.println("Need to swap "+arr[j]+" with "+arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static <T extends Comparable<T>> void bubbleSortGenerics(List<T> list){
        
        for(int i = 0; i < list.size() -1 ; i++){
            System.out.println("Bubble Sort starting at position "+(i+1));
            for(int j = 0; j < list.size()- i -1; j++){
                if(list.get(j).compareTo(list.get(j+1)) >= 1){
                    System.out.println("Need to swap "+list.get(j)+" with "+list.get(j+1));
                    T temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }

    }

    public static void main(String [] args){

        int[] arr = new int[]{5,4,3,2,1};
        bubbleSortArray(arr);
        System.out.println("\n***BUBBLE SORT ARRAYS***");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("***END***\n");

        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        bubbleSortGenerics(list);
        System.out.println("\n***BUBBLE SORT GENERICS***");
        for(Integer e: list){
            System.out.println(e);
        }
        System.out.println("***END***");

    }

}