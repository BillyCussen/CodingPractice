/*
LinkedStack.java
Billy Cussen
16/11/2020
*/
public class LinkedStack<T>{

    Node<T> first;

    public static void main(String [] args){
        LinkedStack<Integer> myLinkedStack = new LinkedStack<Integer>();

        try{
            System.out.println("Is Empty: "+myLinkedStack.isEmpty());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        } finally{
            try{
                System.out.println("Size: "+myLinkedStack.getSize());
            } catch(Exception e){
                System.out.println(e.getMessage());
            } finally{
                try{
                    System.out.println("Pop: "+myLinkedStack.pop());
                } catch(Exception e){
                    System.out.println(e.getMessage());
                } finally{
                    try{
                        System.out.println(myLinkedStack.toStringLinkedStack());
                    } catch(Exception e){
                        System.out.println(e.getMessage()+"\n");
                    } 
                }    
            }    
        }

        myLinkedStack.push(2);
        myLinkedStack.push(4);
        myLinkedStack.push(6);
        myLinkedStack.push(8);
        myLinkedStack.push(10);

        try{
            System.out.println("Is Empty: "+myLinkedStack.isEmpty());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        } finally{
            try{
                System.out.println("Size: "+myLinkedStack.getSize());
            } catch(Exception e){
                System.out.println(e.getMessage());
            } finally{
                try{
                    System.out.println("Pop: "+myLinkedStack.pop());
                } catch(Exception e){
                    System.out.println(e.getMessage());
                } finally{
                    try{
                        System.out.println(myLinkedStack.toStringLinkedStack());
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    } 
                }    
            }    
        }
        
        while(!myLinkedStack.isEmpty()){
            System.out.println("Pop: "+myLinkedStack.pop());
        }

        try{
            System.out.println("Is Empty: "+myLinkedStack.isEmpty());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        } finally{
            try{
                System.out.println("Size: "+myLinkedStack.getSize());
            } catch(Exception e){
                System.out.println(e.getMessage());
            } finally{
                try{
                    System.out.println("Pop: "+myLinkedStack.pop());
                } catch(Exception e){
                    System.out.println(e.getMessage());
                } finally{
                    try{
                        System.out.println(myLinkedStack.toStringLinkedStack());
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    } 
                }    
            }    
        }

    }

    void push(T element){
        if(isEmpty()){
            this.first = new Node<T>(element, null);
        } else{
            this.first = new Node<T>(element,this.first);
        }
    }

    T pop(){
        if(isEmpty()){
            throw new NullPointerException("Can't Pop, the Stack is Empty!");
        } else{
            T element = this.first.element;
            this.first = this.first.next;
            return element;
        }
    }

    T peek(){
        if(isEmpty()){
            throw new NullPointerException("Can't Peek, the Stack is Empty!");
        } else{
            return this.first.element;
        }
    }

    int getSize(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Size, the Stack is Empty!");
        } else{
            return sizeHelper(this.first);
        }
    }

    int sizeHelper(Node<T> current){
        if(current == null){
            return 0;
        }
        return 1 + sizeHelper(current.next);
    }

    boolean isEmpty(){
        return first == null;
    }

    String toStringLinkedStack(){
        if(isEmpty()){
            throw new NullPointerException("Can't Traverse, the Stack is Empty!");
        } else{
            String result = "***LINKED STACK TRAVERSAL***\n";
            int position = 0;
            return toStringLinkedStackHelper(this.first, result, position);
        }
    }

    String toStringLinkedStackHelper(Node<T> current, String result, int position){
        if(current == null){
            return result+"***END***\n";
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringLinkedStackHelper(current.next, result, ++position);
    }
}

class Node<T>{

    T element;
    Node<T> next;

    Node(T element, Node<T> next){
        this.element = element;
        this.next = next;
    }

}