/*
Numbers.java
Billy Cussen
08/07/2020
*/

//This Class will accept two integers as input, add them and display the output. It makes use of Instantiable Classes

public class Numbers{

    //Data Members
    private int a;
    private int b;
    private int sum;

    //Constructor
    public Numbers(){
        this.a=0;
        this.b=0;
    }

    //Setter
    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    //Compute Method
    public void computeSum(){
        this.sum = a + b;
    }

    //Getter
    public int getSum(){
        return sum;
    }

}
