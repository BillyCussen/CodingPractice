/*
BubbleSort2.java
Billy Cussen
15/02/2021
*/
import java.util.List;
import java.util.LinkedList;

public class BubbleSort2 {
    
    public static void bubbleSortArrays(int[] arr){
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

    public static<T extends Comparable<T>> void bubbleSortGenerics(List<T> myList){
        for(int i = 0; i < myList.size(); i++){
            for(int j = 0; j < myList.size()-1; j++){
                if(myList.get(j).compareTo(myList.get(j+1))>=1){
                    T temp = myList.get(j);
                    myList.set(j, myList.get(j+1));
                    myList.set(j+1, temp);
                }
            }
        }
    }

    public static void main(String [] args){

        int[] arr = new int[]{5,4,3,2,1};
        int[] arr1 = new int[]{1, 55, 2, 45,76, 3};
        bubbleSortArrays(arr);
        bubbleSortArrays(arr1);
        
        System.out.println("***BUBBLE SORT ARRAYS***");
        for(int i: arr){
            System.out.println(i);
        }
        for(int i: arr1){
            System.out.println(i);
        }

        List<Integer> myList1 = new LinkedList<Integer>();
        myList1.add(5);
        myList1.add(4);
        myList1.add(3);
        myList1.add(2);
        myList1.add(1);
        List<Integer> myList2 = new LinkedList<Integer>();
        myList2.add(1);
        myList2.add(55);
        myList2.add(2);
        myList2.add(45);
        myList2.add(76);
        myList2.add(3);

        bubbleSortGenerics(myList1);
        bubbleSortGenerics(myList2);

        System.out.println("***BUBBLE SORT GENERICS***");
        for(Integer e: myList1){
            System.out.println(e);
        }

        for(Integer e: myList2){
            System.out.println(e);
        }

    }

}
