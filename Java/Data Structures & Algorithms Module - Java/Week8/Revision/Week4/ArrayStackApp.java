/*
ArrayStackApp.java
Billy Cussen
12/11/2020
*/
public class ArrayStackApp{

    public static void main(String [] args){
        StackInterface<Integer> myArrayStack = new ArrayStack<Integer>(2);

        System.out.println("\n***ARRAY STACK***\n");
        System.out.println("Is Empty: "+myArrayStack.isEmpty());
        try{
            System.out.println("Size: "+myArrayStack.size());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Peek: "+myArrayStack.peek());
            }catch(Exception e){
                System.out.println(e.getMessage());
        }
        try{
            System.out.println("Pop: "+myArrayStack.pop());
            }catch(Exception e){
                System.out.println(e.getMessage());
        }
        System.out.println(myArrayStack.toString()+"\n");

        myArrayStack.push(2);
        myArrayStack.push(4);
        myArrayStack.push(6);
        myArrayStack.push(8);
        myArrayStack.push(10);
        System.out.println("Is Empty: "+myArrayStack.isEmpty());
        try{
            System.out.println("Size: "+myArrayStack.size());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Peek: "+myArrayStack.peek());
            }catch(Exception e){
                System.out.println(e.getMessage());
        }
        try{
            System.out.println("Pop: "+myArrayStack.pop());
            }catch(Exception e){
                System.out.println(e.getMessage());
        }
        System.out.println(myArrayStack.toString());

        while(!myArrayStack.isEmpty()){
            myArrayStack.pop();
        }
        System.out.println("Is Empty: "+myArrayStack.isEmpty());
        try{
            System.out.println("Size: "+myArrayStack.size());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Peek: "+myArrayStack.peek());
            }catch(Exception e){
                System.out.println(e.getMessage());
        }
        try{
            System.out.println("Pop: "+myArrayStack.pop());
            }catch(Exception e){
                System.out.println(e.getMessage());
        }
        System.out.println(myArrayStack.toString());
    }
}