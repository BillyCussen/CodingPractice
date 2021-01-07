/*
ArrayStackApp.java
Billy Cussen
07/01/2021
*/
public class ArrayStackApp {
  
    public static void main(String [] args){
        ArrayStack<Integer> myStack = new ArrayStack<Integer>(2);
        myStack.push(2);
        myStack.push(4);
        myStack.push(6);
        myStack.push(8);
        myStack.push(10);

        System.out.println(myStack.toString());

        myStack.pop();
        myStack.pop();
        System.out.println("Size: "+myStack.size());
        System.out.println("Peek: "+myStack.peek());
        System.out.println(myStack.toString());        
    }

}
