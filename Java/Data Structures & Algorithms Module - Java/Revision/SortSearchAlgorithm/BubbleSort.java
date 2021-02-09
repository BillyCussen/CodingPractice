/*
BubbleSort.java
Billy Cussen
08/02/2021
*/
import java.util.List;
import java.util.LinkedList;

public class BubbleSort<T extends Comparable<T>>{


    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length -1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }

    public static <T extends Comparable<T>> void bubbleSortsGeneric(List<T> arr){
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size()-1; j++){
                if(arr.get(j).compareTo(arr.get(j+1))>=1){
                    T temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
    }



    public static void main(String [] args){

        int[] arr1 = new int[]{5,4,3,2,1};
        bubbleSort(arr1);

        for(int i = 0; i < arr1.length;i++){
            System.out.println(arr1[i]);
        }

        List<Integer> list1 = new LinkedList<Integer>();
        list1.add(10);
        list1.add(8);
        list1.add(6);
        list1.add(4);
        list1.add(2);

        bubbleSortsGeneric(list1);

        for(Integer e: list1){
            System.out.println(e);
        }
    }

}