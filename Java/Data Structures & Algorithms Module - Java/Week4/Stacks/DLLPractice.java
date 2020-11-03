/*
DLLPractice.java
Billy Cussen
20/09/2020
*/

public class DLLPractice{
    public static void main(String[] args){
        DLLInterface<Integer> myDLL = new DLL<Integer>();

        myDLL.addByElement(2);
        myDLL.addByElement(4);
        myDLL.addByElement(6);

        myDLL.addByIndex(10,0);
        myDLL.addByIndex(10,2);
        myDLL.addByIndex(10,4);
        myDLL.addByIndex(10,myDLL.size());
        myDLL.addFirst(9999);
        myDLL.addAtEnd(99999);
        myDLL.addBefore(12345,99999);
        myDLL.addBefore(12345,9999);

        myDLL.removeByElement(2);
        myDLL.removeByElement(4);
        myDLL.removeByElement(6);
        myDLL.removeByIndex(0);

        System.out.println(myDLL.toStringForward());
        System.out.println(myDLL.toStringBackward());
    }
}

interface DLLInterface<T>{
    boolean isEmpty();
    int size();
    void addByElement(T element);
    void addByIndex(T element, int index);
    void addFirst(T element);
    void addAtEnd(T element);
    void addBefore(T element, T target);
    T getByIndex(int index);
    T removeByElement(T element);
    T removeByIndex(int index);
    String toStringForward();
    String toStringBackward();
}

class DLLNode<T>{

    T element;
    DLLNode<T> previous;
    DLLNode<T> successor;

    DLLNode(T element){
        this.element = element;
    }

    DLLNode(T element, DLLNode<T> previous, DLLNode<T> successor){
        this.element = element;
        this.previous = previous;
        this.successor = successor;
    }

}

class DLL<T> implements DLLInterface<T>{

    DLLNode<T> first;
    DLLNode<T> last;

    @Override
    public boolean isEmpty(){
        return first == null;
    }
    
    @Override
    public int size(){
        return sizeHelper(first);
    }
    private int sizeHelper(DLLNode<T> current){
        if(current == null){
            return 0;
        }
        return 1 + sizeHelper(current.successor);
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
            last = new DLLNode<T>(element,current,null);
            current.successor = last;
        }
    }

    @Override
    public void addByIndex(T element, int index){
        if(isEmpty()||index==size()){
            addByElement(element);
        } else if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        } else if(index == 0){
            first = new DLLNode<T>(element, null, first);
            first.successor.previous = first;
        } else{
            DLLNode<T> rightNode = getNode(index);
            DLLNode<T> leftNode = rightNode.previous;
            DLLNode<T> newNode = new DLLNode<T>(element);
            leftNode.successor = newNode;
            newNode.previous = leftNode;
            newNode.successor = rightNode;
            rightNode.previous = newNode;
        }
    }

    private DLLNode<T> getNode(int index){
        DLLNode<T> current = first;
        for(int i = 0; i < index; i++){
            current = current.successor;
        }
        return current;
    }

    @Override
    public void addFirst(T element){
        addByIndex(element, 0);
    }

    @Override
    public void addAtEnd(T element){
        addByElement(element);
    }
    
    @Override
    public void addBefore(T element, T target){
        int index = getIndex(target);
        addByIndex(element,index);
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

    @Override
    public T getByIndex(int index){
        DLLNode<T> current = first;
        for(int i = 0; i < index ; i++){
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
            throw new IndexOutOfBoundsException();
        } else if(index == 0){
            T element = first.element;
            first = first.successor;
            first.previous = null;
            return element;
        } else{
            DLLNode<T> current = first;
            for(int i = 0; i < index - 1; i++){
                current = current.successor;
            }
            T element = current.successor.element;
            current.successor = current.successor.successor;
            if(current.successor==null){
                last = current;
            } else{
                current.successor.previous = current;
            }
            return element;
        }
    }

    @Override
    public String toStringForward(){
        String result = "***DLL FORWARD TRAVERSAL***\n";
        int position = 0;
        DLLNode<T> current = first;
        return toStringForwardHelper(result,position,current);
    }

    private String toStringForwardHelper(String result, int position, DLLNode<T> current){
        if(current==null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringForwardHelper(result,++position,current.successor);
    }

    @Override
    public String toStringBackward(){
        String result = "***DLL BACKWARD TRAVERSAL***\n";
        int position = size()-1;
        DLLNode<T> current = last;
        return toStringBackwardHelper(result,position,current);
    }

    private String toStringBackwardHelper(String result, int position, DLLNode<T> current){
        if(current==null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringBackwardHelper(result,--position,current.previous);     
    }
}