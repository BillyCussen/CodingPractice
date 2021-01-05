/*
LinkedListApp.java
Billy Cussen
05/01/2021
*/
public class LinkedListApp {
  
    public static void main(String [] args){

        LinkedList<Integer> myList = new LinkedList<Integer>();

        System.out.println("Is Empty: "+myList.isEmpty());
        try{
            System.out.println(myList.size());
        }catch(Exception e){
            System.out.println(e.toString());
        }
        try{
            System.out.println(myList.toString());
        }catch(Exception e){
            System.out.println(e.toString());
        }

        myList.add(2);
        myList.add(4);
        myList.add(6);

        System.out.println("Is Empty: "+myList.isEmpty());
        System.out.println(myList.size());
        System.out.println(myList.toString());

        myList.addByIndex(20, 0);
        myList.addByIndex(40, 2);
        myList.addByIndex(60, myList.size());

        System.out.println("Is Empty: "+myList.isEmpty());
        System.out.println(myList.size());
        System.out.println(myList.toString());

        myList.removeByIndex(0);
        myList.removeByIndex(1);
        myList.removeByIndex(myList.size()-1);

        System.out.println("Is Empty: "+myList.isEmpty());
        System.out.println(myList.size());
        System.out.println(myList.toString());
    }
}
