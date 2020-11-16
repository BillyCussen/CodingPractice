/*
ArrayListStack.java
Billy Cussen
16/11/2020
*/

import java.util.List;
import java.util.ArrayList;

public class ArrayListStack<T>{

    List<T> myList;

    ArrayListStack(List<T> myList){
        this.myList = myList;
    }

    public static void main(String [] args){

        List<Integer> myList = new ArrayList<Integer>();
        ArrayListStack<Integer> myArrayListStack = new ArrayListStack<Integer>(myList);

        try{
            System.out.println("Is Empty: "+myArrayListStack.isEmpty());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        } finally{
            try{
                System.out.println("Size: "+myArrayListStack.getSize());
            } catch(Exception e){
                System.out.println(e.getMessage());
            } finally{
                try{
                    System.out.println("Pop: "+myArrayListStack.pop());
                } catch(Exception e){
                    System.out.println(e.getMessage());
                } finally{
                    try{
                        System.out.println(myArrayListStack.toStringArrayListStack());
                    } catch(Exception e){
                        System.out.println(e.getMessage()+"\n");
                    } 
                }    
            }    
        }

        myArrayListStack.push(2);
        myArrayListStack.push(4);
        myArrayListStack.push(6);
        myArrayListStack.push(8);
        myArrayListStack.push(10);

        try{
            System.out.println("Is Empty: "+myArrayListStack.isEmpty());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        } finally{
            try{
                System.out.println("Size: "+myArrayListStack.getSize());
            } catch(Exception e){
                System.out.println(e.getMessage());
            } finally{
                try{
                    System.out.println("Pop: "+myArrayListStack.pop());
                } catch(Exception e){
                    System.out.println(e.getMessage());
                } finally{
                    try{
                        System.out.println(myArrayListStack.toStringArrayListStack());
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    } 
                }    
            }    
        }
        
        while(!myArrayListStack.isEmpty()){
            System.out.println(myArrayListStack.pop());
        }

        try{
            System.out.println("Is Empty: "+myArrayListStack.isEmpty());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        } finally{
            try{
                System.out.println("Size: "+myArrayListStack.getSize());
            } catch(Exception e){
                System.out.println(e.getMessage());
            } finally{
                try{
                    System.out.println("Pop: "+myArrayListStack.pop());
                } catch(Exception e){
                    System.out.println(e.getMessage());
                } finally{
                    try{
                        System.out.println(myArrayListStack.toStringArrayListStack());
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    } 
                }    
            }    
        }

    }

    void push(T element){
        if(isEmpty()){
            this.myList.add(element);
        } else{
            this.myList.add(0, element);
        }
    }

    T pop(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Can't Pop, Stack is Empty!");
        } else{
            T element = this.myList.get(0);
            this.myList.remove(0);
            return element;
        }
    }

    T peek(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Can't peek, Stack is Empty!");
        } else{
            return this.myList.get(0);
        }
    }

    int getSize(){
        int size = 0;
        for(T e: this.myList){
            if (e != null){
                size++;
            }
        }
        return size;
    }

    boolean isEmpty(){
        return getSize() == 0;
    }

    String toStringArrayListStack(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Can't traverse, Stack is Empty!");
        }
        String result = "***ARRAY STACK TRAVERSAL***\n";
        int position = 0;
        return toStringHelper(this.myList,result, position);
    }

    String toStringHelper(List<T> current, String result, int position){
        if(isEmpty()){
            result+="***END***\n";
            return result;
        }
        result+="Position "+position+", Element: "+current.get(0)+"\n";
        current.remove(0);
        return toStringHelper(current, result, ++position);
    }
}
