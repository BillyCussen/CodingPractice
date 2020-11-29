/*
BSTApp.java
Billy Cussen
29/11/2020
*/
public class BSTApp<T>{

    public static void main(String[]args){

        BST<Integer> myBST = new BST<Integer>();

        System.out.println("Empty: "+myBST.isEmpty());

        try{
            System.out.println("Size: "+myBST.size());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Max: "+myBST.max());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Min: "+myBST.min());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Contains: "+myBST.contains(2000));
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Depth: "+myBST.depth());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Find Node: "+myBST.findNode(2));
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Find Parent: "+myBST.findParent(3));
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
        myBST.insert(7);
        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(20);
        myBST.insert(17);
        myBST.insert(22);


        System.out.println("Empty: "+myBST.isEmpty());

        try{
            System.out.println("Size: "+myBST.size());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Max: "+myBST.max());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Min: "+myBST.min());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Contains 2000: "+myBST.contains(2000));
            System.out.println("Contains 22: "+myBST.contains(22));
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Depth: "+myBST.depth());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Find Node: "+myBST.findNode(2));
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Find Parent: "+myBST.findParent(15));
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Find Parent 17: "+myBST.findParent(17));
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