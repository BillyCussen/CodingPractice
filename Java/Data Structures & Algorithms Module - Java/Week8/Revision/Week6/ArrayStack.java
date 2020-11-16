/*
ArrayStack.java
Billy Cussen
16/11/2020
*/

import java.util.Arrays;

public class ArrayStack<T>{

    int size;
    int top;
    T[] myArray;

    ArrayStack(int size){
        this.size = size;
        this.top = -1;
        this.myArray = (T[])new Object[this.size];
    }

    public static void main(String[] args){
        ArrayStack<Integer> myArrayStack = new ArrayStack<Integer>(2);

        try{
            System.out.println("Is Empty: "+myArrayStack.isEmpty());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        } finally{
            try{
                System.out.println("Size: "+myArrayStack.getSize());
            } catch(Exception e){
                System.out.println(e.getMessage());
            } finally{
                try{
                    System.out.println("Pop: "+myArrayStack.pop());
                } catch(Exception e){
                    System.out.println(e.getMessage());
                } finally{
                    try{
                        System.out.println(myArrayStack.toStringArrayStack());
                    } catch(Exception e){
                        System.out.println(e.getMessage()+"\n");
                    } 
                }    
            }    
        }

        myArrayStack.push(2);
        myArrayStack.push(4);
        myArrayStack.push(6);
        myArrayStack.push(8);
        myArrayStack.push(10);

        try{
            System.out.println("Is Empty: "+myArrayStack.isEmpty());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        } finally{
            try{
                System.out.println("Size: "+myArrayStack.getSize());
            } catch(Exception e){
                System.out.println(e.getMessage());
            } finally{
                try{
                    System.out.println("Pop: "+myArrayStack.pop());
                } catch(Exception e){
                    System.out.println(e.getMessage());
                } finally{
                    try{
                        System.out.println(myArrayStack.toStringArrayStack());
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    } 
                }    
            }    
        }
        
        while(!myArrayStack.isEmpty()){
            System.out.println("Pop: "+myArrayStack.pop());
        }

        try{
            System.out.println("Is Empty: "+myArrayStack.isEmpty());
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        } finally{
            try{
                System.out.println("Size: "+myArrayStack.getSize());
            } catch(Exception e){
                System.out.println(e.getMessage());
            } finally{
                try{
                    System.out.println("Pop: "+myArrayStack.pop());
                } catch(Exception e){
                    System.out.println(e.getMessage());
                } finally{
                    try{
                        System.out.println(myArrayStack.toStringArrayStack());
                    } catch(Exception e){
                        System.out.println(e.getMessage());
                    } 
                }    
            }    
        }
    }

    void push(T element){
        if(this.top == this.size - 1){
            reallocate();
        }
        this.top++;
        this.myArray[this.top] = element;
    }

    void reallocate(){
        this.size*=2;
        this.myArray = Arrays.copyOf(this.myArray,this.size);
    }

    T pop(){
        if (isEmpty()){
            throw new NullPointerException("The Array is empty, can't pop!");
        } else{
            T element = this.myArray[this.top];
            this.top--;
            return element;
        }
    }

    T peek(){
        if (isEmpty()){
            throw new NullPointerException("The Array is empty, can't Peek!");
        } else{
            return this.myArray[this.top];
        }
    }

    boolean isEmpty(){
        return this.top == -1;
    }

    int getSize(){
        int size = 0;
        for(int i = 0; i < this.myArray.length;i++){
            if(this.myArray[i]!=null){
                size++;
            }
        }
        return size;
    }

    String toStringArrayStack(){
        if (isEmpty()){
            throw new NullPointerException("The Array is empty, can't Traverse!");
        } else{
            int position = 0, index = this.top;
            String result = "***ARRAY STACK TRAVERSAL***\n";
            while(index >= 0){
                result+="Position "+position+", Element: "+this.myArray[index]+"\n";
                position++;
                index--;
            }
            return result;
        }
    }
}