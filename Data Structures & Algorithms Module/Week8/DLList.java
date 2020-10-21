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
            first.successor.previous = first;
        } else{
            DLNode<T> current = first;
            for(int i = 0; i < index - 1; i++){
                current = current.successor;
            }
            DLNode<T> newNode = new DLNode<T>(element);
            DLNode<T> rightNode = getNode(index);
            DLNode<T> leftNode = rightNode.previous;
            leftNode.successor = newNode;
            newNode.previous = leftNode;
            newNode.successor = rightNode;
            rightNode.previous = newNode;
        }
    }

    private DLNode<T> getNode(int index){
        if(index < 0 || index > size()){
            throw new NullPointerException();
        } else if(index == 0){
            return first;
        } else{
            DLNode<T> current = first;
            for(int i = 0; i < index; i++){
                current = current.successor;
            }
            return current;
        }
    }
    
    @Override
    public void addBefore(T element, T target){
        addByIndex(element,getIndex(target));
    }
    
    @Override
    public void addAfter(T element, T target){
        addByIndex(element,getIndex(target)+1);
    }

    private int getIndex(T target){
        DLNode<T> current = first;
        int index = 0;
        while(current != null){
            if(current.element.equals(target)){
                return index;
            }
            index++;
            current = current.successor;
        }
        return -1;
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
        return removeByIndex(getIndex(target));
    }
    
    @Override
    public T removeByIndex(int index){
        if(index < 0 || index > size() || isEmpty()){
            throw new NullPointerException();
        } else if(index == 0){
            T element = first.element;
            first = first.successor;
            first.previous = null;
            return element;
        } else{
            DLNode<T> current = first;
            for(int i = 0; i < index-1;i++){
                current = current.successor;
            }
            T element = current.successor.element;
            current.successor = current.successor.successor;
            if(current.successor == null){
                last = current;
            } else{
                current.successor.previous = current;
            }
            return element;
        }
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
        myList.addByIndex(200,0);
        myList.addByIndex(60,myList.size());
        myList.addByIndex(400,2);
        myList.addBefore(600,60);
        myList.addBefore(10,200);
        myList.addAfter(1,10);
        myList.removeByElement(10);
        myList.removeByIndex(0);
        myList.removeByElement(60);
        myList.removeByIndex(myList.size()-1);
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