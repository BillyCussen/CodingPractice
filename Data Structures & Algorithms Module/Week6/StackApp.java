/*
StackApp.java
Billy Cussen
01/10/2020
*/

public class StackApp{
    public static void main(String[]args){

        //Linked Stack
        StackInterface<Integer> myLinkedStack = new LinkedStack<Integer>();
        myLinkedStack.push(2);
        myLinkedStack.push(4);
        myLinkedStack.push(6);
        System.out.println(myLinkedStack.toString());
        System.out.println("Peek: "+myLinkedStack.peek());
        System.out.println("Size: "+myLinkedStack.size()+"\n");
        myLinkedStack.pop();
        System.out.println(myLinkedStack.toString());
        System.out.println("Peek: "+myLinkedStack.peek());
        System.out.println("Size: "+myLinkedStack.size()+"\n");        
        myLinkedStack = null;
        System.gc();

        //Array Stack
        StackInterface<Integer> myArrayStack = new ArrayStack<Integer>(3);
        myArrayStack.push(2);
        myArrayStack.push(4);
        myArrayStack.push(6);
        System.out.println(myArrayStack.toString());
        System.out.println("Peek: "+myArrayStack.peek());
        System.out.println("Size: "+myArrayStack.size()+"\n");
        myArrayStack.pop();
        System.out.println(myArrayStack.toString());
        System.out.println("Peek: "+myArrayStack.peek());
        System.out.println("Size: "+myArrayStack.size()+"\n");        
        myArrayStack = null;
        System.gc();

        //Array List Stack
        StackInterface<Integer> myArrayListStack = new ArrayListStack<Integer>();
        myArrayListStack.push(2);
        myArrayListStack.push(4);
        myArrayListStack.push(6);
        System.out.println(myArrayListStack.toString());
        System.out.println("Peek: "+myArrayListStack.peek());
        System.out.println("Size: "+myArrayListStack.size()+"\n");
        myArrayListStack.pop();
        System.out.println(myArrayListStack.toString());
        System.out.println("Peek: "+myArrayListStack.peek());
        System.out.println("Size: "+myArrayListStack.size()+"\n");        
        myArrayListStack = null;
        System.gc();
    }
}