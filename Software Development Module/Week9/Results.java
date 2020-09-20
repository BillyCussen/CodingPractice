/*
Results.java
Billy Cussen
18/07/2020
*/

public class Results {
    
    //Data Members
    private int[][] examResults;
    private int average;
    private int min;
    private int max;
    private int averageTotal;
    private int minTotal;
    private int maxTotal;
    private String result;

    //Constructor & Setter
    public Results(int[][] examResults){
        this.examResults = examResults;
        this.average = 0;
        this.min = 0;
        this.max = 0;
        this.averageTotal = 0;
        this.minTotal = 0;
        this.maxTotal = 0;
        this.result = new String();
    }

    //Compute & Getter
    public String computeAndGetResults(){

        String resultsAverage = new String();
        this.result += "\n\n";

        for(int i = 0; i < this.examResults.length;i++){

            this.average = 0;
            this.min = this.examResults[0][0];
            this.max = this.examResults[0][0];


            for(int j = 0; j < this.examResults[0].length; j++){

                this.result += "Student "+(i+1)+", Exam "+(j+1)+": "+this.examResults[i][j]+"\n";

                this.average += this.examResults[i][j]; 

                if(this.examResults[i][j] < this.min){
                    this.min = this.examResults[i][j];
                }

                if(this.examResults[i][j] > this.max){
                    this.max = this.examResults[i][j];
                }

            }

            this.averageTotal += this.average;
            
            if(i == 0){
                this.minTotal = min;
                this.maxTotal = max;
            }

            this.average = this.average / this.examResults[0].length;
            this.result += "Student "+(i+1)+", Average Result: "+this.average+", Lowest Grade: "+this.min+", Highest Grade: "+this.max+"\n\n";

            if(min < this.minTotal){
                this.minTotal = min;
            }

            if(max > this.maxTotal){
                this.maxTotal = max;
            }

        }

        this.averageTotal = this.averageTotal / (this.examResults.length * this.examResults[0].length);
        this.result += "Average Grade of all Students: "+this.averageTotal+"\n";
        this.result += "Lowest Grade of all Students: "+this.minTotal+"\n";
        this.result += "Highest Grade of all Students: "+this.maxTotal+"\n";

        return this.result;
    }

}