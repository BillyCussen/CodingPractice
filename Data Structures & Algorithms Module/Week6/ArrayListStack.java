/*
ArrayListStack.java
Billy Cussen
01/10/2020
*/

import java.util.List;
import java.util.ArrayList;

public class ArrayListStack<T> implements StackInterface<T>{

    List<T> arrayList;
    T last;

    public ArrayListStack(){
        this.arrayList = new ArrayList<T>();
    }

    @Override
    public void push(T e){
        this.arrayList.add(e);
        this.last = e;
    }
    
    @Override
    public T pop(){
        return this.arrayList.remove(size()-1);
    }

    @Override
    public T peek(){
        return this.arrayList.get(size()-1);
    }

    @Override
    public int size(){
        int size = 0;
        for(T e: this.arrayList){
            if(e != null){
                size++;
            }
        }
        return size;
    }

    @Override
    public String toString(){
        String result = "***ARRAY LIST STACK TRAVERSAL***\n";
        int position = 0;
        for(T e: this.arrayList){
            result+="Position: "+position+", Element: "+e+"\n";
            position++;
        }
        return result;
    }
}