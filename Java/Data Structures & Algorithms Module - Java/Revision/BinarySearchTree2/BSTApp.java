/*
BSTApp.java
Billy Cusseb
25/01/2021
*/
public class BSTApp {
    
    public static void main(String [] args){

        BST<Integer> myBST = new BST<Integer>();

        myBST.inOrder();
        System.out.println("Max: "+myBST.max());
        System.out.println("Min: "+myBST.min());
        System.out.println("Size: "+myBST.size());
        System.out.println("Depth: "+myBST.depth());
        System.out.println("Contains 2: "+myBST.contains(2));
        System.out.println("Contains 18: "+myBST.contains(18));
        System.out.println("Contains 35: "+myBST.contains(35));
        System.out.println("Contains 17: "+myBST.contains(17));
        myBST.insert(20);
        myBST.insert(15);
        myBST.insert(17);
        myBST.insert(10);
        myBST.insert(30);
        myBST.insert(35);
        myBST.insert(40);
        myBST.inOrder();
        System.out.println("Max: "+myBST.max());
        System.out.println("Min: "+myBST.min());
        System.out.println("Size: "+myBST.size());
        System.out.println("Depth: "+myBST.depth());
        System.out.println("Contains 2: "+myBST.contains(2));
        System.out.println("Contains 18: "+myBST.contains(18));
        System.out.println("Contains 35: "+myBST.contains(35));
        System.out.println("Contains 17: "+myBST.contains(17));
    }

}
