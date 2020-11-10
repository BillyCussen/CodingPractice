/*
LinkedListApp.java
Billy Cussen
10/11/2020
*/
public class LinkedListApp{

    public static void main(String[]args){

        LinkedList<Integer> myList = new LinkedList<Integer>();

        myList.add(2);
        myList.add(4);
        myList.addByIndex(20,0);
        myList.addByIndex(40,2);
        myList.addByIndex(6,myList.size());
        myList.addBefore(60,6);
        myList.addBefore(200,20);
        myList.addAfter(400,2);
        myList.addAfter(800,6);
        myList.removeByElement(60);
        myList.removeByElement(400);
        myList.removeByIndex(0);
        myList.removeByIndex(myList.size()-1);

        System.out.println(myList.toString());

    }

}