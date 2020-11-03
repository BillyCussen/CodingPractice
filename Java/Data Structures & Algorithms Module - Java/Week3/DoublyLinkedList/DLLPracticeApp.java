public class DLLPracticeApp{

    public static void main(String [] args){

        DoublyLinkedListInterface<Integer> myDLL = new DoublyLinkedList<Integer>();
        myDLL.addByElement(2);
        myDLL.addByElement(4);
        myDLL.addByElement(6);
        myDLL.addByIndex(100,0);
        myDLL.addByIndex(100,myDLL.size());
        myDLL.addByIndex(999,1);
        myDLL.addByIndex(999,3);
        myDLL.addByIndex(999,5);
        myDLL.addByIndex(999,8);
        myDLL.addFirst(99999);
        myDLL.addAtEnd(99999);
        myDLL.addBefore(777666,2);
        myDLL.addBefore(777666,4);
        myDLL.addBefore(777666,6);
        myDLL.removeByElement(99999);
        myDLL.removeByElement(99999);
        myDLL.removeByElement(777666);
        myDLL.removeByElement(777666);
        myDLL.removeByElement(777666);
        myDLL.removeByElement(999);
        myDLL.removeByElement(999);
        myDLL.removeByElement(999);
        myDLL.removeByIndex(myDLL.size()-1);
        System.out.println("***FORWARD TRAVERSAL***");
        System.out.println(myDLL.toStringForward());
        System.out.println("***BACKWARD TRAVERSAL***");
        System.out.println(myDLL.toStringBackward());
    }

}
