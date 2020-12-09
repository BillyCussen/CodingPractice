/*
BSTApp.java
Billy Cussen
09/12/2020
*/

public class BSTApp<T>{

    public static void main(String [] args){

        BST<Integer> myBST = new BST<Integer>();

        try{
            myBST.inOrder();
        }catch(NullPointerException e){
            System.out.println("EXCEPTION: "+e.getMessage());
        }
        System.out.println("Empty: "+myBST.isEmpty());
        System.out.println("Size: "+myBST.size());
        System.out.println("Depth: "+myBST.depth());
        System.out.println("Contains 20: "+myBST.contains(20));
        System.out.println("Contains 2000: "+myBST.contains(2000));
        try{
            System.out.println("Max: "+myBST.max());
        }catch(NullPointerException e){
            System.out.println("EXCEPTION: "+e.getMessage());
        }
        try{
            System.out.println("Min: "+myBST.min());
        }catch(NullPointerException e){
            System.out.println("EXCEPTION: "+e.getMessage());
        }

        myBST.insert(20);
        myBST.insert(15);
        myBST.insert(10);
        myBST.insert(5);
        myBST.insert(7);
        myBST.insert(25);
        myBST.insert(22);

        myBST.inOrder();
        System.out.println("Empty: "+myBST.isEmpty());
        System.out.println("Size: "+myBST.size());
        System.out.println("Max: "+myBST.max());
        System.out.println("Min: "+myBST.min());
        System.out.println("Depth: "+myBST.depth());
        System.out.println("Contains 20: "+myBST.contains(20));
        System.out.println("Contains 2000: "+myBST.contains(2000));

    }

}