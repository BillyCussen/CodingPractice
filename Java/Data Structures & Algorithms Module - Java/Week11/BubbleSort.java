/*
BubbleSort.java
Billy Cussen
14/12/2020
*/
public class BubbleSort{

    public static void bubbleSort(int [] arr){
        int len = arr.length;
        for(int i = 0; i < len-1; i++){
            System.out.println("Outer Loop Iteration: "+(i+1));
            for(int j = 0; j < len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    System.out.println("We need to swap "+arr[j]+" with "+arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void bubbleSort2(int [] arr){

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

    public static void main(String[]args){

        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort2(arr1);
        for(int i = 0; i < arr1.length;i++){
            System.out.println(arr1[i]);
        }

    }

}