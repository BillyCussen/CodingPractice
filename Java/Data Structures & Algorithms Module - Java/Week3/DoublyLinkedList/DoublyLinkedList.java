/*
DoublyLinkedList.java
Billy Cussen
11/09/2020 - Refactored on 12/09, 13/09 & 14/09 as Double Link was not working correctly
*/

public class DoublyLinkedList<T> implements DoublyLinkedListInterface<T>{

    DLLNode<T> first;
    DLLNode<T> last;

    @Override
    public boolean isEmpty(){
    return first==null;
    }

    @Override
    public int size(){
        return sizeHelper(first);
    }

    @Override
    public void addByElement(T element){
        if(isEmpty()){
            first = new DLLNode<T>(element,null,null);
            last = first;
        } else{
            DLLNode<T> current = first;
            while(current.successor!=null){
                current = current.successor;
            }
            if(last == current){
                current.successor = new DLLNode<T>(element,current.successor,null);
                last = current.successor;
                last.previous = current;
            }
        }
    }
    
    @Override
    public void addByIndex(T element, int index){
        if(isEmpty()||index==size()){
            addByElement(element);
        } else if(index < 0 || index > size()){
            throw new NullPointerException();
        } else if(index == 0){
            first = new DLLNode<T>(element,null,first);
            first.successor.previous = first;
        } else{
            DLLNode<T> newNode = new DLLNode<T>(element);
            DLLNode<T> rightNode = getNodeByIndex(index);
            DLLNode<T> leftNode = rightNode.previous;
            leftNode.successor = newNode;
			newNode.previous = leftNode;
			newNode.successor = rightNode;
			rightNode.previous = newNode;
        }
    }

    @Override
    public void addFirst(T element){
        addByIndex(element,0);
    }
    
    @Override
    public void addAtEnd(T element){
        addByIndex(element,size());
    }
    
    @Override
    public void addBefore(T element, T target){
        int index = getIndex(target);
        addByIndex(element,index);
    }
    
    @Override
    public T getByIndex(int index){
        DLLNode<T> current = first;
        for(int i = 0; i < index - 1; i++){
            current = current.successor;
        }
        return current.successor.element;
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
        }else{
            DLLNode<T> current = first;
            for(int i = 0; i < index - 1; i++){
                current = current.successor;
            }
            T element = current.successor.element;
            current.successor = current.successor.successor;
            if (current.successor == null) {
                last = current;
            } else{
                current.successor.previous = current;
            }

            return element;
        }
        
    }

    @Override
    public String toStringBackward(){
        DLLNode<T> current = last;
        String result = new String();
        int position = size()-1;

        return toStringHelper1(current, result, position);
    }

    @Override
    public String toStringForward(){
        DLLNode<T> current = first;
        String result = new String();
        int position = 0;

        return toStringHelper2(current, result, position);
    }

    private int sizeHelper(DLLNode<T> current){
        if(current==null){
            return 0;
        }
        return 1 + sizeHelper(current.successor);
    } 

    private int getIndex(T target){
        DLLNode<T> current = first;
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

    private DLLNode<T> getNodeByIndex(int index){
        DLLNode<T> current = first;
        for(int i = 0; i < index ; i++){
            current = current.successor;
        }
        return current;
    }

    private String toStringHelper1(DLLNode<T> current, String result, int position){
        if(current == null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        position--;
        return toStringHelper1(current.previous, result, position);
    }

    private String toStringHelper2(DLLNode<T> current, String result, int position){
        if(current == null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        position++;
        return toStringHelper2(current.successor, result, position);
    }

}