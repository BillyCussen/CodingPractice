/*
PracticeTest.java
Billy Cussen
30/09/2020
*/

//This is based on a Sample Mid-Term Test for Data Structures & Algorithms
//Problem: Create a Doubly Linked Implementation of the following interface (Interface will be below main class here See "List")

public class PracticeTest{
    public static void main(String [] args){

        List<Integer> myDLList = new DLLList<Integer>();
        System.out.println("Is the List Empty: "+myDLList.isEmpty());
        System.out.println("Current Size: "+myDLList.size());
        System.out.println("Get Last Element: "+myDLList.get(myDLList.size()));
        System.out.println("Get First Element: "+myDLList.get(0));
        myDLList.add(2);
        myDLList.add(4);
        myDLList.add(6);
        System.out.println(myDLList.toString());
        System.out.println(myDLList.toStringBackwards());

        System.out.println("Is the List Empty: "+myDLList.isEmpty());
        System.out.println("Current Size: "+myDLList.size());
        System.out.println("Get Last Element: "+myDLList.get(myDLList.size()));
        System.out.println("Get First Element: "+myDLList.get(0));
        myDLList.add(0,20);
        myDLList.add(2,40);
        myDLList.add(4,60);
        myDLList.add(myDLList.size(),600);
        System.out.println(myDLList.toString());
        System.out.println(myDLList.toStringBackwards());

        System.out.println("Is the List Empty: "+myDLList.isEmpty());
        System.out.println("Current Size: "+myDLList.size());
        myDLList.remove(20);
        myDLList.remove(40);
        myDLList.remove(60);
        myDLList.remove(600);
       
        System.out.println(myDLList.toString());
        System.out.println(myDLList.toStringBackwards());

        System.out.println("Is the List Empty: "+myDLList.isEmpty());
        System.out.println("Current Size: "+myDLList.size());
        myDLList.prepend(9999);
        myDLList.addBefore(9999,11111);
        myDLList.addAfter(11111,22222);
        myDLList.addAfter(6,9999);
       
        System.out.println(myDLList.toString());
        System.out.println(myDLList.toStringBackwards());
    }
}

interface List<T>{
    //Add item at the end
    void add(T element);
    //add item at index specified
    void add(int index, T element);
    //adds an element to the list in the position after to the first occurrence of the the target element
    void addAfter(T target, T element);
    //adds an element to the list in the position previous to the first occurrence of the the target element
    void addBefore(T target, T element);
    //Retreive element at index
    T get(int index);
    //return true if it is empty
    boolean isEmpty();
    //add at the start
    void prepend(T element);
    //removes the first occurance of the target from the list
    T remove(T target);
    //return current size of list
    int size();

    //Adding this in to Display if List has been Doubly Linked Correctly
    String toStringBackwards();

}

//Node Class Created for Basis of Doubly Linked List
class DLLNode<T>{

    T element;
    DLLNode<T> previous;
    DLLNode<T> successor;

    public DLLNode(T element){
        this.element = element;
    }

    public DLLNode(T element, DLLNode<T> previous, DLLNode<T> successor){
        this.element = element;
        this.previous = previous;
        this.successor = successor;
    }

}

class DLLList<T> implements List<T>{

    DLLNode<T> first;
    DLLNode<T> last;

    //Add item at the end
    @Override
    public void add(T element){
        if(isEmpty()){
            this.first = new DLLNode<T>(element);
            this.last = this.first;
        } else{
            DLLNode<T> current = this.first;
            while(current.successor!=null){
                current = current.successor;
            }
            current.successor = new DLLNode<T>(element, current,null);
            this.last = current.successor;
            this.last.previous = current;
        }
    }
    //add item at index specified
    @Override
    public void add(int index, T element){
        if(index < 0 || index > size()){
            throw new NullPointerException();
        }else if(isEmpty() || index == size()){
            add(element);
        } else if(index == 0){
            prepend(element);
        } else{
            DLLNode<T> newNode = new DLLNode<T>(element);
            DLLNode<T> rightNode = getCurrentNode(index);
            DLLNode<T> leftNode = rightNode.previous;
            leftNode.successor = newNode;
            newNode.previous = leftNode;
            newNode.successor = rightNode;
            rightNode.previous = newNode;
        }
    }

    private DLLNode<T> getCurrentNode(int index){
        DLLNode<T> current = this.first;
        for(int i = 0; i < index; i++){
            current = current.successor;
        }
        return current;       
    }

    //adds an element to the list in the position after to the first occurrence of the the target element
    @Override
    public void addAfter(T target, T element){
        int index = getIndex(target)+1;
        add(index,element);
    }
    //adds an element to the list in the position previous to the first occurrence of the the target element
    @Override
    public void addBefore(T target, T element){
        int index = getIndex(target);
        add(index, element);
    }
    //Retreive element at index
    @Override
    public T get(int index){
        if(isEmpty()){
            return null;
        } else{ 
            DLLNode<T> current = first;
            for(int i = 0; i < index - 1; i++){
                current = current.successor;
            }
            return current.element;
        }
    }

    //return true if it is empty
    @Override
    public boolean isEmpty(){
        return this.first == null;
    }
    //add at the start
    @Override
    public void prepend(T element){
        if(isEmpty()){
            add(element);
        } else{
            this.first = new DLLNode<T>(element, null, this.first);
            this.first.successor.previous = this.first;
        }
    }

    //removes the first occurance of the target from the list
    @Override
    public T remove(T target){
        int index = getIndex(target);
        if(index < 0 || index > size() || isEmpty()){
            throw new NullPointerException();
        } else if(index == 0){
            T element = first.element;
            first = first.successor;
            first.previous = null;
            return element;
        } else{
            DLLNode<T> current = getCurrentNode(index-1);
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
        DLLNode<T> current = this.first;
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

    //return current size of list
    @Override
    public int size(){
        return sizeHelper(this.first);
    }

    private int sizeHelper(DLLNode<T> current){
        if(current == null){
            return 0;
        }
        return 1 + sizeHelper(current.successor);
    }

    @Override
    public String toString(){
        DLLNode<T> current = this.first;
        int position = 0;
        String result = "***DOUBLY LINKED LIST TRAVERSAL***\n";
        return toStringHelper(current,position,result);
    }

    private String toStringHelper(DLLNode<T> current, int position, String result){
        if(current==null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringHelper(current.successor, ++position, result);
    }

    @Override
    public String toStringBackwards(){
        DLLNode<T> current = this.last;
        int position = size()-1;
        String result = "***DOUBLY LINKED LIST BACKWARDS TRAVERSAL***\n";
        return toStringBackwardsHelper(current,position,result);
    }

    private String toStringBackwardsHelper(DLLNode<T> current, int position, String result){
        if(current==null){
            return result;
        }
        result+="Position "+position+", Element: "+current.element+"\n";
        return toStringBackwardsHelper(current.previous, --position, result);
    }

}