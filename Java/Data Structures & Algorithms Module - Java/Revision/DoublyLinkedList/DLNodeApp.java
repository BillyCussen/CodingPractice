/*
DLNodeApp.java
Billy Cussen
06/01/2020
*/

public class DLNodeApp {
    
    public static void main(String [] args){

        DLinkedList<Integer> myList = new DLinkedList<Integer>();
        myList.add(2);
        myList.add(4);
        myList.add(6);

        System.out.println(myList.toString());
        System.out.println(myList.toStringBackwards());

        myList.addByIndex(200,0);
        myList.addByIndex(400,2);
        myList.addByIndex(8,myList.size());
        myList.addByIndex(600,4);

        System.out.println(myList.toString());
        System.out.println(myList.toStringBackwards());
     
        myList.removeByElement(200);
        myList.removeByElement(400);
        myList.removeByElement(600);

        System.out.println(myList.toString());
        System.out.println(myList.toStringBackwards());


        myList.removeByIndex(0);
        myList.removeByIndex(myList.size()-1);
        myList.removeByIndex(myList.size()-1);

        System.out.println(myList.toString());
        System.out.println(myList.toStringBackwards());

    }

}
