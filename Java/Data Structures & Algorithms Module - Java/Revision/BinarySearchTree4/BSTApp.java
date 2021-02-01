/*
BSTApp.java
Billy Cussen
01/02/2021
*/

public class BSTApp {
  
    public static void main(String [] args){

        BST<Integer> myBST = new BST<Integer>();
        myBST.insert(20);
        myBST.insert(10);
        myBST.insert(15);
        myBST.insert(17);
        myBST.insert(14);
        myBST.insert(25);
        myBST.insert(30);
        System.out.println("Size: "+myBST.size());
        System.out.println("Max: "+myBST.max());
        System.out.println("Min: "+myBST.min());
        System.out.println("Depth: "+myBST.depth());
        System.out.println("Is Empty: "+myBST.isEmpty());
        System.out.println("Find Node 30: "+myBST.findNode(30).toString());
        System.out.println("Contains 30: "+myBST.contains(30));
        myBST.inOrder();
    }

}
