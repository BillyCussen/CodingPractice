/*
LinkedStackApp.java
Billy Cussen
12/11/2020
*/
public class LinkedStackApp{

    public static void main(String [] args){
        StackInterface<Integer> myLinkedStack = new LinkedStack<Integer>();

        System.out.println("\n***LINKED STACK***\n");
        System.out.println("Is Empty: "+myLinkedStack.isEmpty());
        try{
            System.out.println("Size: "+myLinkedStack.size());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Peek: "+myLinkedStack.peek());
            }catch(Exception e){
                System.out.println(e.getMessage());
        }
        try{
            System.out.println("Pop: "+myLinkedStack.pop());
            }catch(Exception e){
                System.out.println(e.getMessage());
        }
        System.out.println(myLinkedStack.toString()+"\n");

        myLinkedStack.push(2);
        myLinkedStack.push(4);
        myLinkedStack.push(6);
        myLinkedStack.push(8);
        myLinkedStack.push(10);
        System.out.println("Is Empty: "+myLinkedStack.isEmpty());
        try{
            System.out.println("Size: "+myLinkedStack.size());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Peek: "+myLinkedStack.peek());
            }catch(Exception e){
                System.out.println(e.getMessage());
        }
        try{
            System.out.println("Pop: "+myLinkedStack.pop());
            }catch(Exception e){
                System.out.println(e.getMessage());
        }
        System.out.println(myLinkedStack.toString());

        while(!myLinkedStack.isEmpty()){
            myLinkedStack.pop();
        }
        System.out.println("Is Empty: "+myLinkedStack.isEmpty());
        try{
            System.out.println("Size: "+myLinkedStack.size());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Peek: "+myLinkedStack.peek());
            }catch(Exception e){
                System.out.println(e.getMessage());
        }
        try{
            System.out.println("Pop: "+myLinkedStack.pop());
            }catch(Exception e){
                System.out.println(e.getMessage());
        }
        System.out.println(myLinkedStack.toString());
    }
}