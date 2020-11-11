/*
DLLinkedList.java
Billy Cussen
11/11/2020
*/
public class DLLinkedList<T> implements DLLinkedInterface<T>{

    DLNode<T> first;
    DLNode<T> last;

    @Override
    public void add(T element){
        if(isEmpty()){
            first = new DLNode<T>(element);
            last = first;
        } else{
            DLNode<T> current = first;
            while(current.successor != null){
                current = current.successor;
            }
            current.successor = new DLNode<T>(element, current.successor, null);
            last = current.successor;
            current.successor.previous = current;
        }
    }
    
    @Override
    public void addByIndex(T element, int index){
        if(isEmpty()||index == size()){
            add(element);
        } else if (index == 0){
            first = new DLNode<T>(element,null,first);
            first.successor.previous = first;
        } else{
            DLNode<T> current = first;
            for(int i = 0; i < index; i++){
                current = current.successor;
            }
            DLNode<T> leftNode = current.previous;
            DLNode<T> rightNode = current;
            DLNode<T> newNode = new DLNode<T>(element);
            newNode.previous = leftNode;
            leftNode.successor = newNode;
            newNode.successor = rightNode;
            rightNode.previous = newNode;
        }
    }
    
    @Override
    public void addBefore(T element, T target){
        addByIndex(element, getIndex(target));
    }
    
    @Override
    public void addAfter(T element, T target){
        addByIndex(element, getIndex(target)+1);
    }

    private int getIndex(T target){
        DLNode<T> current = first;
        int index = 0;
        while(current !=null){
            if(current.element.equals(target)){
                return index;
            }
            index++;
            current = current.successor;
        }
        return -1;
    }
    
    @Override
    public T removeByElement(T element){
        return removeByIndex(getIndex(element));
    }
    
    @Override
    public T removeByIndex(int index){
        if(isEmpty()||index < 0 || index >= size()){
            throw new NullPointerException();
        } else if(index == 0){
            T element = first.element;
            first = first.successor;
            if(first==null){
                last=null;
            } else{
                first.previous = null;
            }
            return element;
        } else{
            DLNode<T> current = first;
            for(int i = 0; i < index-1; i++){
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
    public boolean isEmpty(){
        return first == null;
    }

    @Override
    public int size(){
        return sizeHelper(first);
    }

    private int sizeHelper(DLNode<T> current){
        if(current == null){
            return 0;
        }
        return 1 + sizeHelper(current.successor);
    }

    @Override
    public String toString(){
        if(isEmpty()){
            return "The list is Empty, can't do a traversal!";
        }
        String result = "***DOUBLE LINKED LIST TRAVERSAL***\n";
        int position = 0;
        return toStringHelper(first,result,position);
    }

    private String toStringHelper(DLNode<T> current, String result, int position){
        if(current==null){
            result+="***END***";
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.successor,result,++position);
    }

    @Override
    public String toStringBackwards(){
        if(isEmpty()){
            return "The list is Empty, can't do a backwards traversal!";
        }
        String result = "***DOUBLE LINKED LIST BACKWARDS TRAVERSAL***\n";
        int position = size()-1;
        return toStringBackwardsHelper(last,result,position);
    }

    private String toStringBackwardsHelper(DLNode<T> current, String result, int position){
        if(current==null){
            result+="***END***";
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringBackwardsHelper(current.previous,result,--position);
    }

}