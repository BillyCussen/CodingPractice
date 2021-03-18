/*
LinkedStack.java
Billy Cussen
17/03/2021
*/

/*
1A. Write a commented interface for a Stack ADT in java, which supports the following operations:
- pop
- push
- top
- size
- isEmpty

1B. Write a Node/Link based Java class, called LinkedStack<T>, which implements the Stack<T>
interface representing the Stack ADT described in 1A.
*/


public class LinkedStack<T> implements Stack<T>{

    Node<T> first;

    LinkedStack(){
        this.first = null;
    }

    @Override
    public T pop(){
        if(isEmpty()){
            return null;
        } else{
            T element = this.first.element;
            this.first = this.first.next;
            return element;
        }
    }

    @Override
    public void push(T element){
        if(isEmpty()){
            this.first = new Node<T>(element, null);
        } else{
            Node<T> oldFirst = this.first;
            this.first = new Node<T>(element, oldFirst);
        }
    }

    @Override
    public T top(){
        if(isEmpty()){
            return null;
        } else{
            return this.first.element;
        }
    }

    @Override
    public int size(){
        if(isEmpty()){
            return 0;
        }
        return size(this.first);
    }

    private int size(Node<T> current){
        if(current == null){
            return 0;
        }
        return 1 + size(current.next);
    }

    @Override
    public boolean isEmpty(){
        return this.first == null;
    }

    @Override
    public String toString(){
        if(isEmpty()){
            return "Can't perform Stack Traversal, it is Empty!";
        }
        String result = "***LINKED STACK TRAVERSAL***\n";
        return toString(this.first, result, 1);
    }

    private String toString(Node<T> current, String result, int position){
        if(current == null){
            result += "***END***\n";
            return result;
        }
        result += "Position "+position+", Element: "+current.element+"\n";
        return toString(current.next, result, ++position);
    }

    public static void main(String [] args){

        LinkedStack<Integer> myStack = new LinkedStack<Integer>();

        System.out.println("Top: "+myStack.top());
        System.out.println("Pop "+myStack.top()+": "+myStack.pop());
        System.out.println("Size: "+myStack.size());
        System.out.println("Is Empty: "+myStack.isEmpty());
        System.out.println(myStack.toString());

        myStack.push(2);
        myStack.push(4);
        myStack.push(6);
        myStack.push(8);

        System.out.println("Top: "+myStack.top());
        System.out.println("Pop "+myStack.top()+": "+myStack.pop());
        System.out.println("Size: "+myStack.size());
        System.out.println("Is Empty: "+myStack.isEmpty());
        System.out.println(myStack.toString());

        System.out.println("Pop "+myStack.top()+": "+myStack.pop());
        System.out.println("Pop "+myStack.top()+": "+myStack.pop());
        System.out.println("Pop "+myStack.top()+": "+myStack.pop());
        System.out.println("Pop "+myStack.top()+": "+myStack.pop());

        System.out.println("Top: "+myStack.top());
        System.out.println("Size: "+myStack.size());
        System.out.println("Is Empty: "+myStack.isEmpty());
        System.out.println(myStack.toString());
    }

}

interface Stack<T>{

    //Remove the First Element of the Stack (Stack is a LIFO - "Last in First Out" ADT)
    T pop();

    //Add a new element to the Stack
    void push(T element);

    //Return the first element in the Stack
    T top();

    //Return the number of Nodes in the Stack
    int size();

    //Confirm if the Stack is Empty or not
    boolean isEmpty();

}


class Node<T>{

    T element;
    Node<T> next;

    Node(T element, Node<T> next){
        this.element = element;
        this.next = next;
    }

}