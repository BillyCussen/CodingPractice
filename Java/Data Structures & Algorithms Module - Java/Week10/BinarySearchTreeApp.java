/*
BinarySearchTreeApp.java
Billy Cussen
24/11/2020
*/
public class BinarySearchTreeApp<T>{

    public static void main(String[]args){

        BinarySearchTree<Integer> myBST = new BinarySearchTree<Integer>();

        System.out.println("Empty: "+myBST.isEmpty());

        try{
            System.out.println("Size: "+myBST.size());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            myBST.inOrder();
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        myBST.insert(15);
        myBST.insert(10);
        myBST.insert(5);
        myBST.insert(25);
        myBST.insert(20);

        System.out.println("Empty: "+myBST.isEmpty());

        try{
            System.out.println("Size: "+myBST.size());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            myBST.inOrder();
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

    }

}