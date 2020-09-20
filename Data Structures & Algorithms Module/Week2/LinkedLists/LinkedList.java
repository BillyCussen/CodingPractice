/*
LinkedList.java
Billy Cussen
09/09/2020
Refactored on 11/09 - IndexOutOfBounds Exceptions fixed
*/

public class LinkedList<T> implements LinkedListInterface<T>{

    //Data Members
    Node<T> first;

    //Constructor
    public LinkedList(){
        this.first = null;
    }

    @Override
    public int size(){
        int count = 0;
        Node<T> current = first;
        while(current!=null){
            current = current.next;
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty(){
        return this.first == null;
    }

    @Override
    public void addByElement(T element){
        if(isEmpty()){
            first = new Node<T>(element);
        } else{
            Node<T> current = first;
            while(current.next!=null){
                current = current.next;
            }
            current.next = new Node<T>(element);
        }
    }

    @Override
    public void addByIndex(T element, int index){
        if(index < 0 || index > size()){
            throw new IndexOutOfBoundsException();
        } else if(index == 0){
            Node<T> current = first;
            first = new Node<T>(element, current);
        } else{
            Node<T> current = first;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            current.next = new Node<T>(element,current.next);
        }
    }

    @Override
    public T removeByIndex(int index){
        if(isEmpty()||index>size()||index < 0){
            throw new IndexOutOfBoundsException();
        } else if(index == 0){
            T element = first.element;
            first = first.next;
            return element;
        } else{
            Node<T>current = first;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            T element = current.next.element;
            current.next = current.next.next;
            return element;
        }
    }

    @Override
    public String toString(){
        Node<T> current = first;
        String result = new String();
        int position = 0;
        while(current != null){
            result+="Position "+position+", Element: "+current.element+"\n";
            position++;
            current = current.next;
        }
        return result;
    }


    //Tutorial Exercises - Coded on 10/09/2020
    //This method adds an element to the list in the position before the Target Element
    @Override
    public void addBefore(T element, T target){
        int index = getIndex(target);
        addByIndex(element,index);
    }

    //This method adds an element to the list in the position after the Target Element
    @Override
    public void addAfter(T element, T target){
        int index = getIndex(target);
        addByIndex(element,index+1);
    }
    
    //This method removes the first occurance of the target from the list
    @Override
    public T removeByElement(T target){
        //Get Index from Helper Method
        int index = getIndex(target);
        //Re-use remove method that removes by Index
        return removeByIndex(index);
    }

    //This is a Helper method to get the Index of a Target element in a LinkedList
    private int getIndex(T target){
        int index = 0;
        Node<T> current = first;
        while(current!=null){
            
            if(current.element.equals(target)){
                return index;
            } 
            index++;
            current = current.next;
        }
        return index;
    }

    //Test for Tutorial Exercises
    public static void main(String [] args){

        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.addByElement(2);
        myLinkedList.addByElement(4);
        myLinkedList.addByElement(6);
        myLinkedList.addBefore(200,2);
        myLinkedList.addBefore(400,4);
        myLinkedList.addBefore(600,6);
        myLinkedList.addAfter(200,2);
        myLinkedList.addAfter(400,4);
        myLinkedList.addAfter(600,6);
        myLinkedList.removeByElement(2);
        myLinkedList.removeByElement(4);
        myLinkedList.removeByElement(6);
        myLinkedList.removeByIndex(0);
        myLinkedList.removeByIndex(1);
        myLinkedList.removeByIndex(3);
        System.out.println(myLinkedList.toString());

    }

}