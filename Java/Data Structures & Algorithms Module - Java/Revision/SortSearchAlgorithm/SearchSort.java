/*
SearchSort.java
Billy Cussen
22/02/2021
*/

import java.util.List;
import java.util.LinkedList;

public class SearchSort {
    
    public static<T extends Comparable<T>> void bubbleSort(List<T> list){
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size()-1;j++){
                if(list.get(j).compareTo(list.get(j+1))>=1){
                    T temp = list.get(j+1);
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static<T extends Comparable<T>> void selectionSort(List<T> list){
        for(int i = 1; i < list.size();i++){
            int minIndex = i;
            for(int j = 0; j < list.size()-1;j++){
                if(list.get(minIndex).compareTo(list.get(j))<=-1){
                    T temp = list.get(j);
                    list.set(j, list.get(minIndex));
                    list.set(minIndex, temp);
                }
            }
        }
    }

    public static<T extends Comparable<T>> boolean linearSearch(List<T> list, T key){
            for(int j = 0; j < list.size(); j++){
                if(list.get(j).compareTo(key)==0){
                    return true;
                }
            }
        return false;
    }

    public static void main(String [] args){

        List<Integer> myList1 = new LinkedList<Integer>();
        myList1.add(6);
        myList1.add(5);
        myList1.add(4);
        myList1.add(3);
        myList1.add(2);
        myList1.add(1);
        bubbleSort(myList1);
        System.out.println("Contains 6: "+linearSearch(myList1, 6));
        System.out.println("Contains 1: "+linearSearch(myList1, 1));
        System.out.println("Contains 7: "+linearSearch(myList1, 7));

        for(Integer e: myList1){
            System.out.println(e);
        }

        List<Integer> myList2 = new LinkedList<Integer>();
        myList2.add(6);
        myList2.add(5);
        myList2.add(4);
        myList2.add(3);
        myList2.add(2);
        myList2.add(1);
        selectionSort(myList2);
        System.out.println("Contains 6: "+linearSearch(myList2, 6));
        System.out.println("Contains 1: "+linearSearch(myList2, 1));
        System.out.println("Contains 7: "+linearSearch(myList2, 7));

        for(Integer e: myList2){
            System.out.println(e);
        }
    }


}
