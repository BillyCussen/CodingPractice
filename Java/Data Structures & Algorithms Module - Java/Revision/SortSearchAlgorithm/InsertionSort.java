/*
InsertionSort.java
Billy Cussen
24/02/2021
*/

public class InsertionSort {
  
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            String string="";
            for(int k=0;k<=i;k++){
                string+= arr[k]+", ";
            }
            System.out.println("Placing "+ temp + " into the sorted portion "+string);
            while(j>=0 && arr[j]>temp){
                System.out.println("Comparing " + temp + " to " + arr[j]);
                arr[j+1] = arr[j];
                j = j -1;
            }
            System.out.println("Placing " + temp + " before " + arr[j+2]);
            arr[j+1] = temp;
        }
    }

    public static void insertionSort2(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int value = arr[i];
            int j = i - 1;
            String str = new String();
            for(int k = 0; k <= i; k++){
                if(k==i){
                    str+= arr[k];
                } else{
                    str += arr[k]+", ";
                }
            }
            System.out.println("Placing "+value+" into sorted portion: "+str);
            while(j>=0 && arr[j]>=value){
                System.out.println("Comparing "+value+" with "+arr[j]);
                arr[j+1] = arr[j];
                j-=1;
            }
            System.out.println("Placing "+value+" before "+arr[j+2]);
            arr[j+1] = value;
        }
    }

    public static<T extends Comparable<T>> void insertionSortGenerics(T[] arr){
        for(int i = 1; i < arr.length; i++){
            T value = arr[i];
            int j = i - 1;
            String str = new String();
            for(int k = 0; k <= i; k++){
                if(k == i){
                    str+=arr[k];
                } else{
                    str+= arr[k]+", ";
                }
            }
            System.out.println("Placing "+value+" into Sorted Portion: "+str);

            while(j >= 0 && value.compareTo(arr[j])<=-1){
                System.out.println("Comparing "+value+" with "+arr[j]);
                arr[j+1]=arr[j];
                j -= 1;
                
            }
            System.out.println("Placing "+value+" before "+arr[j+2]);
            arr[j+1] = value;
        }
    }

    public static void main(String[] args){

        int[] arr = new int[]{5,4,3,2,1};
        insertionSort2(arr);

        for(int e: arr){
            System.out.println(e);
        }

        Integer[] arr2 = new Integer[]{5,4,3,2,1};
        insertionSortGenerics(arr2);
        for(Integer e: arr2){
            System.out.println(e);
        }
    }

}
