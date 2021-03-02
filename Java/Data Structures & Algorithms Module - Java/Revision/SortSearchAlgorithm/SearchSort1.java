/*
SearchSort1.java
Billy Cussen
02/03/2021
*/

import java.util.List;
import java.util.LinkedList;

public class SearchSort1 {
    
    public static<T extends Comparable<T>> boolean linearSearch(List<T> list, T key){
        for(int i = 0; i < list.size(); i++){
            if(key.compareTo(list.get(i))==0){
                return true;
            }
        }
        return false;
    }

    public static<T extends Comparable<T>> void bubbleSort(List<T> list){
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size()-1; j++){
                if(list.get(j+1).compareTo(list.get(j))<=-1){
                    T temp = list.get(j+1);
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static<T extends Comparable<T>> void selectionSort(List<T> list){
        for(int i = 0; i < list.size(); i++){
            int minIndex = i;
            for(int j = 0; j < list.size()-1; j++){
                if(list.get(minIndex).compareTo(list.get(j))<=-1){
                    T temp = list.get(minIndex);
                    list.set(minIndex, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static<T extends Comparable<T>> void insertionSort(List<T> list){
        for(int i = 1; i < list.size(); i++){
            int j = i - 1;
            T value = list.get(i);
            while(j >= 0 && list.get(j).compareTo(value)>=1){
                list.set(j+1, list.get(j));
                j = j - 1;
            }
            list.set(j+1, value);
        }
    }

    public static void main(String[] args){

        System.out.println("***LIST 1 (BUBBLE SORT)***");
        List<Integer> myList1 = new LinkedList<Integer>();
        myList1.add(5);
        myList1.add(4);
        myList1.add(3);
        myList1.add(2);
        myList1.add(1);
        bubbleSort(myList1);
        for(Integer e: myList1){
            System.out.println(e);
        }
        System.out.println("Contains 5: "+linearSearch(myList1, 5));
        System.out.println("Contains 1: "+linearSearch(myList1, 1));
        System.out.println("Contains 6: "+linearSearch(myList1, 6));

        System.out.println("***LIST 2 (SELECTION SORT)***");
        List<Integer> myList2 = new LinkedList<Integer>();
        myList2.add(10);
        myList2.add(9);
        myList2.add(8);
        myList2.add(7);
        myList2.add(6);
        selectionSort(myList2);
        for(Integer e: myList2){
            System.out.println(e);
        }
        System.out.println("Contains 6: "+linearSearch(myList2, 6));
        System.out.println("Contains 10: "+linearSearch(myList2, 10));
        System.out.println("Contains 11: "+linearSearch(myList2, 11));

        System.out.println("***LIST 3 (INSERTION SORT)***");
        List<Integer> myList3 = new LinkedList<Integer>();
        myList3.add(15);
        myList3.add(14);
        myList3.add(13);
        myList3.add(12);
        myList3.add(11);
        insertionSort(myList3);
        for(Integer e: myList3){
            System.out.println(e);
        }
        System.out.println("Contains 15: "+linearSearch(myList3, 15));
        System.out.println("Contains 11: "+linearSearch(myList3, 11));
        System.out.println("Contains 16: "+linearSearch(myList3, 16));
    }

}
