/*
DLListRevision.java
Billy Cussen
22/10/2020
*/

//Created again to ensure I understand the logic of adding by Index and relinking the list properly

public class DLListRevision<T> implements DLListRevisionInterface<T>{

    DLListRevisionNode<T> first;
    DLListRevisionNode<T> last;

    public static void main(String [] args){

        DLListRevision<Integer> myList = new DLListRevision<Integer>();
        myList.addByElement(2);
        myList.addByElement(4);
        myList.addByElement(6);
        myList.addByIndex(60,0);
        myList.addByIndex(60,myList.size());
        myList.addByIndex(600,2);
        myList.removeByElement(600);
        myList.removeByIndex(0);
        myList.removeByIndex(myList.size()-1);

        System.out.println(myList.toString());
        System.out.println(myList.toStringBackwards());
    }

    @Override
    public void addByElement(T element){
        if(isEmpty()){
            first = new DLListRevisionNode<T>(element);
            last = first;
        } else{
            DLListRevisionNode<T> current = first;
            while(current.successor!=null){
                current = current.successor;
            }
            if(last == current){
                current.successor = new DLListRevisionNode<T>(element, current, null);
                last = current.successor;
                last.previous = current;
            }
        }
    }
    
    @Override
    public void addByIndex(T element, int index){
        if(isEmpty()||index == size()){
            addByElement(element);
        } else if(index == 0){
            first = new DLListRevisionNode<T>(element, null, first);
            first.successor.previous = first;
        } else{
            DLListRevisionNode<T> newNode = new DLListRevisionNode<T>(element);
            DLListRevisionNode<T> rightNode = getNode(index);
            DLListRevisionNode<T> leftNode = rightNode.previous;
            leftNode.successor = newNode;
            newNode.previous = leftNode;
            newNode.successor = rightNode;
            rightNode.previous = newNode;
        }
    }

    private DLListRevisionNode<T> getNode(int index){
        if(index == 0){
            return first;
        } else{
            DLListRevisionNode<T> current = first;
            for(int i = 0; i < index; i++){
                current = current.successor;
            }
            return current;
        }
    }
    
    @Override
    public T removeByElement(T element){
        int index = getIndex(element);
        return removeByIndex(index);
    }
    
    @Override
    public T removeByIndex(int index){
        if(isEmpty()||index<0||index>size()){
            throw new NullPointerException();
        } else if(index == 0){
            T element = first.element;
            first = first.successor;
            first.previous = null;
            return element;
        } else{
            DLListRevisionNode<T> current = first;
            for(int i = 0; i < index -1 ; i++){
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

    private int getIndex(T target){
        DLListRevisionNode<T> current = first;
        int index = 0;
        while(current!=null){
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
        return toSizeHelper(last);
    }

    private int toSizeHelper(DLListRevisionNode<T> current){
        if(current==null){
            return 0;
        }
        return 1 + toSizeHelper(current.previous);
    }
    
    @Override
    public boolean isEmpty(){
        return first==null;
    }
    
    @Override
    public String toString(){
        DLListRevisionNode<T> current = first;
        int position = 0;
        String result = "***DLList Traversal***\n";
        return toStringHelper(current, position, result);
    }

    private String toStringHelper(DLListRevisionNode<T> current, int position, String result){
        if(current==null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.successor,++position,result);
    }

    @Override
    public String toStringBackwards(){
        String result = "***DLL Backwards Traversal***\n";
        int position = size()-1;
        DLListRevisionNode<T> current = last;
        return toStringBackwardsHelper(result, position, current);
    }

    private String toStringBackwardsHelper(String result, int position, DLListRevisionNode<T> current){
        if(current == null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringBackwardsHelper(result,--position,current.previous);
    }
}

interface DLListRevisionInterface<T>{

    void addByElement(T element);
    void addByIndex(T element, int index);
    T removeByElement(T element);
    T removeByIndex(int index);
    int size();
    boolean isEmpty();
    String toStringBackwards();
}

class DLListRevisionNode<T>{

    T element;
    DLListRevisionNode<T> previous;
    DLListRevisionNode<T> successor;

    DLListRevisionNode(T element){
        this.element = element;
    }

    DLListRevisionNode(T element, DLListRevisionNode<T> previous, DLListRevisionNode<T> successor){
        this.element = element;
        this.previous = previous;
        this.successor = successor;
    } 

}