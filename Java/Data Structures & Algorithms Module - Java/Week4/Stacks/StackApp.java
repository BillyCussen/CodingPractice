/*
StackApp.java
Billy Cussen
16/09/2020
*/

public class StackApp{
    public static void main(String[] args){

        StackInterface<Integer> myStack = new LinkedStack<Integer>();
        System.out.println(myStack.isEmpty());
        myStack.push(2);
        myStack.push(4);
        myStack.push(6);
        myStack.push(8);
        
        try{
            System.out.println("Peek: "+myStack.peek());
        }catch(IndexOutOfBoundsException e){
            System.out.println("The Stack is empty!");
        }
        System.out.println("Size: "+myStack.size());
        System.out.println("\n***LINKED STACK TRAVERSAL***");
        System.out.println(myStack.toString());

        StackInterface<Integer> myStack1 = new ArrayStack<Integer>(5);
        System.out.println(myStack1.isEmpty());
        myStack1.push(2);
        myStack1.push(4);
        myStack1.push(6);
        myStack1.push(8);

        try{
            System.out.println("Peek: "+myStack1.peek());
        }catch(IndexOutOfBoundsException e){
            System.out.println("The Stack is empty!");
        }
        System.out.println("Size: "+myStack1.size());
        System.out.println("\n***ARRAY STACK TRAVERSAL***");
        System.out.println(myStack1.toString());
    }
}