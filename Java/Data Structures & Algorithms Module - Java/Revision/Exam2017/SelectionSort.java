/*
SelectionSort.java
Billy Cussen
18/03/2021
*/

/*
Write a function that performs selection sort on an array of integers.
*/

public class SelectionSort {
   
    public static void selectionSort(int[] arr){

        for(int i = 1; i < arr.length; i++){
            int minIndex = i;
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j]>arr[minIndex]){
                    int temp = arr[j];
                    arr[j] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }

        }

    }

    public static void main(String [] args){

        int[] arr1 = new int[]{5,4,3,2,1};
        int[] arr2 = new int[]{1,2,3,4,5};

        selectionSort(arr1);
        selectionSort(arr2);

        for(int e: arr1){
            System.out.println(e);
        }

        for(int e: arr2){
            System.out.println(e);
        }

    }
}
