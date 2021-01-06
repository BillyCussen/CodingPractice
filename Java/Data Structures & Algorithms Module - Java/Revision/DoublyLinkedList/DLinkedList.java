/*
DLinkedList.java
Billy Cussen
06/01/2021
*/
public class DLinkedList<T> {
    
    DLNode<T> first;
    DLNode<T> last;

    public DLinkedList(){
        this.first = null;
        this.last = null;
    }

    public void add(T element){
        if(isEmpty()){
            this.first = new DLNode<T>(element, null, null);
            this.last = this.first;
        } else{
            DLNode<T> current = this.first;
            while(current.successor != null){
                current = current.successor;
            }
            current.successor = new DLNode<T>(element, current, null);
            last = current.successor;
            current.successor.previous = current;
        }
    }

    public void addByIndex(T element, int index){
        if(isEmpty()){
            throw new NullPointerException("Can't add "+element+" to index "+index+", DLL is empty!");
        } else if(index < 0 || index > size()){
            throw new NullPointerException("Unable to add "+element+", index out of bounds");
        } else if(index == 0){
            this.first = new DLNode<T>(element, null, this.first);
            this.first.successor.previous = this.first;
        } else if(index == size()){
            add(element);
        } else{
            DLNode<T> current = this.first;
            for(int i = 0; i < index - 1; i++){
                current = current.successor;
            }
            DLNode<T> newNode = new DLNode<T>(element, null, null);
            DLNode<T> leftNode = current;
            DLNode<T> rightNode = current.successor;
            newNode.previous = leftNode;
            leftNode.successor = newNode;
            newNode.successor = rightNode;
            rightNode.previous = newNode;
        }
    }

    public T removeByElement(T element){

        int index = getIndex(this.first, element);
        return removeByIndex(index);
    }

    public T removeByIndex(int index){
        if(index < 0 || index > size()){
            throw new NullPointerException("Can't find index, unable to remove element!");
        } else if(index == 0){
            T element = first.element;
            first = first.successor;
            first.previous = null;
            if(first.successor == null){
                last = first;
            }
            return element;
        } else{
            DLNode<T> current = first;
            for(int i = 0; i < index - 1; i++){
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

    public int getIndex(DLNode<T> current, T element){
        int index = 0;
        while(current!=null){
            if(current.element.equals(element)){
                return index;
            }
            index++;
            current = current.successor;
        }

        return -1;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public int size(){
        if(isEmpty()){
            throw new NullPointerException("Can't get Size, DLL is Empty!");
        }
        return sizeHelper(this.first);
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
            throw new NullPointerException("Can't print DLL, its empty!");
        }
        String result = "***DLL TRAVERSAL***\n";
        int position = 1;
        return toStringHelper(this.first, result, position);
    }

    private String toStringHelper(DLNode<T> current, String result, int position){
        if(current==null){
            result+="***END***\n";
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.successor, result, ++position);
    }

    public String toStringBackwards(){
        if(isEmpty()){
            throw new NullPointerException("Can't print DLL, its empty!");
        }
        String result = "***DLL BACKWARDS TRAVERSAL***\n";
        int position = size();
        return toStringBackwardsHelper(this.last, result, position);
    }

    private String toStringBackwardsHelper(DLNode<T> current, String result, int position){
        if(current==null){
            result+="***END***\n";
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringBackwardsHelper(current.previous, result, --position);
    }

}
