/*
LinearSearch.java
Billy Cussen
09/02/2021
*/

import java.util.List;
import java.util.LinkedList;

public class LinearSearch<T> {
    
    public static boolean linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }

    public static<T extends Comparable<T>> boolean linearSearchGenerics(List<T> list, T key){
        for(T e: list){
            if(e.compareTo(key)==0){
                return true;
            }
        }
        return false;
    }

    public static void main(String [] args){

        int[] arr = new int[]{5,4,3,2,1};

        List<Integer> myList = new LinkedList<Integer>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);

        List<String> myList1 = new LinkedList<String>();
        myList1.add("abc");
        myList1.add("def");
        myList1.add("ghi");
        myList1.add("jkl");

        System.out.println(linearSearch(arr,1));
        System.out.println(linearSearch(arr,40));
        System.out.println(linearSearchGenerics(myList, 40));
        System.out.println(linearSearchGenerics(myList, 1));

        System.out.println(linearSearchGenerics(myList1, "jkl"));
        System.out.println(linearSearchGenerics(myList1, "mno"));

        if(linearSearchGenerics(myList1, "jkl")){
            for(String e: myList1){
                if(e.equals("jkl")){
                    System.out.println(e.charAt(0));
                }
            }
        }
       

    }

}
