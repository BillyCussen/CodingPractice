public class Practice{

    public static void main(String [] args){
        InterfacePractice<Integer> myDLL = new PracticeDLL<Integer>();
        myDLL.addByElement(1000);
        myDLL.addByElement(1000);
        myDLL.addByIndex(99999,0);
        myDLL.addByIndex(99999,myDLL.size());
        myDLL.addByIndex(99999,2);
        myDLL.addFirst(999999999);
        myDLL.addAtEnd(999999999);
        myDLL.addBefore(1,999999999);
        myDLL.addBefore(1,999999999);
        myDLL.addBefore(1,1000);
        myDLL.removeByElement(1);
        myDLL.removeByElement(1);
        myDLL.removeByElement(1);
        myDLL.removeByIndex(0);
        myDLL.removeByIndex(myDLL.size()-1);
        myDLL.removeByElement(1000);
        myDLL.removeByElement(1000);

        System.out.println("***FORWARD TRAVERSAL***");
        long startTime = System.nanoTime();
        System.out.println(myDLL.toStringForward());
        long endTime = System.nanoTime();
        long startTime1 = System.nanoTime();
        System.out.println("***BACKWARD TRAVERSAL***");
        long endTime1 = System.nanoTime();
        System.out.println(myDLL.toStringBackward());

        System.out.println("Forward Traversal took "+(endTime-startTime)+" nanoseconds");
        System.out.println("Backward Traversal took "+(endTime1-startTime1)+" nanoseconds");
    }

}

interface InterfacePractice<T>{
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

class NodePractice<T>{

    T element;
    NodePractice<T> previous;
    NodePractice<T> successor;

    public NodePractice(T element){
        this.element = element;
    }

    public NodePractice(T element, NodePractice<T> previous, NodePractice<T> successor){
        this.element = element;
        this.previous = previous;
        this.successor = successor;
    }
}

class PracticeDLL<T> implements InterfacePractice<T>{

    NodePractice<T> first;
    NodePractice<T> last;

    @Override
    public boolean isEmpty(){
        return first == null;
    }
    
    @Override
    public int size(){
        return sizeHelper(first);
    }

    private int sizeHelper(NodePractice<T> current){
        if(current==null){
            return 0;
        }

        return 1 + sizeHelper(current.successor);
    }

    @Override
    public void addByElement(T element){
        if(isEmpty()){
            first = new NodePractice<T>(element,null,null);
            last = first;
        } else{
            NodePractice<T> current = first;
            while(current.successor != null){
                current = current.successor;
            }
            if(last == current){
                current.successor = new NodePractice<T>(element,current.successor,null);
                last = current.successor;
                last.previous = current;
            }
        }
    }
    
    @Override
    public void addByIndex(T element, int index){
        if(isEmpty()||index == size()){
            addByElement(element);
        } else if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        } else if (index == 0){
            NodePractice<T> current = first;
            first = new NodePractice<T>(element,null,current);
            first.successor.previous = first;
        } else{
            NodePractice<T> newNode = new NodePractice<T>(element);
            NodePractice<T> rightNode = getNodeByIndex(index);
            NodePractice<T> leftNode = rightNode.previous;
            newNode.successor = rightNode;
            newNode.previous = leftNode;
            rightNode.previous = newNode;
            leftNode.successor = newNode;
            
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

    private int getIndex(T target){
        int index = 0;
        NodePractice<T> current = first;
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
        NodePractice<T> current = first;
        for(int i = 0; i < index - 1; i++){
            current = current.successor;
        }
        return current.successor.element;
    }

    private NodePractice<T> getNodeByIndex(int index){
        NodePractice<T> current = first;
        for(int i = 0; i < index ; i++){
            current = current.successor;
        }
        return current;
    }

    @Override
    public T removeByElement(T element){
        return removeByIndex(getIndex(element));
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
            NodePractice<T> current = first;
            for(int i = 0 ; i < index - 1; i++){
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
    public String toStringForward(){
        int position = 0;
        NodePractice<T> current = first;
        String result = new String();

        return toStringForwardHelper(position,current,result);
    }

    private String toStringForwardHelper(int position, NodePractice<T> current, String result){
        if(current == null){
            return result;
        }
        
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringForwardHelper(++position, current.successor,result);
    }

    @Override
    public String toStringBackward(){
        int position = size()-1;
        NodePractice<T> current = last;
        String result = new String();

        return toStringBackwardHelper(position,current,result);
    }

    private String toStringBackwardHelper(int position, NodePractice<T> current, String result){
        if(current == null){
            return result;
        }
        
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringBackwardHelper(--position, current.previous,result);
    }

}