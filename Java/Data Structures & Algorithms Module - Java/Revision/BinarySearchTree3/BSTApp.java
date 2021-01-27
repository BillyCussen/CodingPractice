/*
BSTApp.java
Billy Cussen
27/01/2021
*/

public class BSTApp {
  
    public static void main(String[]args){

        BST<Integer> myBST = new BST<Integer>();
        System.out.println("Is Empty: "+myBST.isEmpty());
        System.out.println("Size: "+myBST.size());
        myBST.inOrder();

        myBST.insert(40);
        myBST.insert(20);
        myBST.insert(60);
        myBST.insert(30);
        myBST.insert(10);
        myBST.insert(5);
        myBST.insert(80);
        myBST.insert(50);
        myBST.insert(45);
 
        System.out.println("Is Empty: "+myBST.isEmpty());
        System.out.println("Size: "+myBST.size());
        myBST.inOrder();

        System.out.println("Find Node 40 -> "+myBST.findNode(40).toString());
        System.out.println("Find Node 50 -> "+myBST.findNode(50).toString());
        System.out.println("Find Node 5 -> "+myBST.findNode(5).toString());
        System.out.println("Find Node 200 -> "+myBST.findNode(200));

        System.out.println("Find Parent Node 40 -> "+myBST.findParent(40));
        System.out.println("Find Parent Node 50 -> "+myBST.findParent(50).toString());
        System.out.println("Find Parent Node 5 -> "+myBST.findParent(5).toString());
        System.out.println("Find Parent Node 200 -> "+myBST.findParent(200));
    }
}
