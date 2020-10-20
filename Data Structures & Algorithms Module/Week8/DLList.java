/*
DLList.java
Billy Cussen
20/10/2020
*/

public class DLList<T> implements DLInterface<T>{

    DLNode<T> first;
    DLNode<T> last;

    @Override
    public void add(T element){
        if(isEmpty()){
            first = new DLNode<T>(element);
            last = first;
        } else{
            DLNode<T> current = first;
            while(current.successor!=null){
                current = current.successor;
            }
            current.successor = new DLNode<T>(element,current,null);
            last = current.successor;
            last.previous = current;
        }
    }

    @Override
    public void addByIndex(T element, int index){
        if(isEmpty()||index == size()){
            add(element);
        } else if(index == 0){
            first = new DLNode<T>(element,null,first);
        } else{
            DLNode<T> current = first;
            for(int i = 0; i < index - 1; i++){
                current = current.successor;
            }
            DLNode<T> new = new DLNode<T>(element);
            //To be continued...
        }
    }
    
    @Override
    public void addBefore(T element, T target){

    }
    
    @Override
    public void addAfter(T element, T target){

    }
    
    @Override
    public int size(){
        return sizeHelper(first);
    }
    
    private int sizeHelper(DLNode<T>current){
        if(current == null){
            return 0;
        }

        return 1 + sizeHelper(current.successor);
    }

    @Override
    public boolean isEmpty(){
        return first==null;
    }

    @Override
    public T removeByElement(T target){
        return null;
    }
    
    @Override
    public T removeByIndex(int index){
        return null;
    }

    @Override
    public String toString(){
        String result = "***DLL Traversal***\n";
        int position = 0;
        DLNode<T> current = first;
        return toStringHelper(result, position, current);
    }

    private String toStringHelper(String result, int position, DLNode<T> current){
        if(current == null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(result,++position,current.successor);
    }

    @Override
    public String toStringBackwards(){
        String result = "***DLL Backwards Traversal***\n";
        int position = size()-1;
        DLNode<T> current = last;
        return toStringBackwardsHelper(result, position, current);
    }

    private String toStringBackwardsHelper(String result, int position, DLNode<T> current){
        if(current == null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringBackwardsHelper(result,--position,current.previous);
    }

    public static void main(String[] args){
        DLList<Integer> myList = new DLList<Integer>();
        myList.add(20);
        myList.add(40);

        System.out.println(myList.toString());
        System.out.println(myList.toStringBackwards());

    }

}

interface DLInterface<T>{
    void add(T element);
    void addByIndex(T element, int index);
    void addBefore(T element, T target);
    void addAfter(T element, T target);
    int size();
    boolean isEmpty();
    T removeByElement(T target);
    T removeByIndex(int index);
    String toStringBackwards();
}

class DLNode<T>{

    T element;
    DLNode<T> previous;
    DLNode<T> successor;

    DLNode(T element){
        this.element = element;
    }

    DLNode(T element, DLNode<T> previous, DLNode<T> successor){
        this.element = element;
        this.previous = previous;
        this.successor = successor;
    }

}