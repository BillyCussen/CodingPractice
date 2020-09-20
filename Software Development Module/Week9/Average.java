/*
Average.java
Billy Cussen
18/07/2020
*/

public class Average {
    
    //Data Members
    private int[] input;
    private int average;
    private int min;
    private int max;
    private String output;

    //Constructor & Setter
    public Average(int[] input){
        this.input = input;
        this.average = average;
        this.min = 0;
        this.max = 0;
        this.output = new String();
    }

    //Compute & Getter
    public String computeAverage(){

        int total = 0;
        this.min = this.input[0];
        this.max = this.input[0];

        for(int i = 0; i < this.input.length;i++){

            total += this.input[i];

            if(this.input[i] < this.min){
                this.min = this.input[i];
            }

            if(this.input[i] > this.max){
                this.max = this.input[i];
            }

        }

        this.average = total/this.input.length;
        this.output = "Average of numbers submitted: "+this.average+"\nSmallest Number included: "+this.min+"\nLargest Number included: "+this.max;
        return this.output;
    } 

}