/*
DLLinkedListApp.java
Billy Cussen
11/11/2020
*/
public class DLLinkedListApp<T>{

    public static void main(String [] args){

        DLLinkedInterface<Integer> myList = new DLLinkedList<Integer>();

        System.out.println("Is Empty: "+myList.isEmpty());
        System.out.println("Size: "+myList.size());
        System.out.println(myList.toString());
        System.out.println(myList.toStringBackwards()+"\n");

        myList.add(2);
        myList.add(4);
        myList.add(6);

        System.out.println("Is Empty: "+myList.isEmpty());
        System.out.println("Size: "+myList.size());
        System.out.println(myList.toString());
        System.out.println(myList.toStringBackwards()+"\n");

        myList.addByIndex(20,0);
        myList.addByIndex(80,myList.size());
        myList.addByIndex(40,2);
        myList.addByIndex(60,4);

        System.out.println("Is Empty: "+myList.isEmpty());
        System.out.println("Size: "+myList.size());
        System.out.println(myList.toString());
        System.out.println(myList.toStringBackwards()+"\n");

        myList.addBefore(200,20);
        myList.addBefore(800,80);
        myList.addAfter(8,80);
        myList.addAfter(400,2);

        System.out.println("Is Empty: "+myList.isEmpty());
        System.out.println("Size: "+myList.size());
        System.out.println(myList.toString());
        System.out.println(myList.toStringBackwards()+"\n");

        myList.removeByIndex(0);
        myList.removeByIndex(myList.size()-1);
        myList.removeByIndex(2);
        myList.removeByIndex(6);
        myList.removeByElement(80);
        myList.removeByElement(20);

        System.out.println("Is Empty: "+myList.isEmpty());
        System.out.println("Size: "+myList.size());
        System.out.println(myList.toString());
        System.out.println(myList.toStringBackwards()+"\n");

        for(int i = myList.size()-1; i >= 0; i--){
            myList.removeByIndex(i);
        }

        System.out.println("Is Empty: "+myList.isEmpty());
        System.out.println("Size: "+myList.size());
        System.out.println(myList.toString());
        System.out.println(myList.toStringBackwards()+"\n");
    }
}