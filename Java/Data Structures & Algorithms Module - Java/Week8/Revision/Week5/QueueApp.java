/*
QueueApp.java
Billy Cussen
13/11/2020
*/

public class QueueApp{

    public static void main(String[] args){

        QueueInterface<Integer> myQueue = new Queue<Integer>();

        try{
            System.out.println("Empty: "+myQueue.isEmpty());
        }catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            try{
                System.out.println("Size: "+myQueue.size());
            }catch(Exception e){
                System.out.println(e.getMessage());
            } finally{
                try{
                    System.out.println("Dequeue: "+myQueue.deQueue());
                }catch(Exception e){
                    System.out.println(e.getMessage());
                } finally{
                    try{
                        System.out.println(myQueue.toString());
                    }catch(Exception e){
                        System.out.println(e.getMessage()+"\n");
                    } 
                }
            }
        }

        myQueue.enQueue(2);
        myQueue.enQueue(4);
        myQueue.enQueue(6);
        myQueue.enQueue(8);
        myQueue.enQueue(10);
        myQueue.enQueue(12);

        try{
            System.out.println("Empty: "+myQueue.isEmpty());
        }catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            try{
                System.out.println("Size: "+myQueue.size());
            }catch(Exception e){
                System.out.println(e.getMessage());
            } finally{
                try{
                    System.out.println("Dequeue: "+myQueue.deQueue());
                }catch(Exception e){
                    System.out.println(e.getMessage());
                } finally{
                    try{
                        System.out.println(myQueue.toString());
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    } 
                }
            }
        }

        while(!myQueue.isEmpty()){
            System.out.println("Dequeue: "+myQueue.deQueue());
        }

        try{
            System.out.println("Empty: "+myQueue.isEmpty());
        }catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            try{
                System.out.println("Size: "+myQueue.size());
            }catch(Exception e){
                System.out.println(e.getMessage());
            } finally{
                try{
                    System.out.println("Dequeue: "+myQueue.deQueue());
                }catch(Exception e){
                    System.out.println(e.getMessage());
                } finally{
                    try{
                        System.out.println(myQueue.toString());
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    } 
                }
            }
        }


    }

}