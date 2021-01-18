/*
BSTApp.java
Billy Cussen
18/01/2021
*/
public class BSTApp {
    public static void main(String[]args){

        BST<Integer> myBST = new BST<Integer>();
        System.out.println("Size: "+myBST.size());
        System.out.println("Is Empty: "+myBST.isEmpty());
        System.out.println("Depth: "+myBST.depth());
        myBST.insert(20);
        myBST.insert(12);
        myBST.insert(5);
        myBST.insert(14);
        myBST.insert(30);
        myBST.insert(25);
        myBST.insert(35);
        System.out.println("Size: "+myBST.size());
        System.out.println("Is Empty: "+myBST.isEmpty());
        System.out.println("Depth: "+myBST.depth());
        System.out.println("Max: "+myBST.max());
        System.out.println("Min: "+myBST.min());
        System.out.println(myBST.inOrder());
    }

}
