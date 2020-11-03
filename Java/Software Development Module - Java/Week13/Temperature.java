/*
Temperature.java
Billy Cussen
27/07/2020
*/

public class Temperature{

    //Data Members
    private String[] temperatureWeek;
    private String result;

    //Constructor
    public Temperature(){

    }

    public Temperature(String[] temperatureWeek){
        this.temperatureWeek = temperatureWeek;
        this.result = new String();
    }

    public String getResult(){

        int week1Average = 0;
        int week2Average = 0;
        int week3Average = 0;
        String[] weekCheck;

        for(int i = 0; i < this.temperatureWeek.length; i++){
            weekCheck = this.temperatureWeek[i].split(",");

            for(String day : weekCheck){

                if(i+1 == 1){
                    week1Average+= Integer.parseInt(day);
                } else if(i + 1 == 2){
                    week2Average+= Integer.parseInt(day);
                } else{
                    week3Average+= Integer.parseInt(day);
                }

            }

        }

        weekCheck = null;

        week1Average = week1Average / 7;
        //System.out.println("Week 1: "+ week1Average);
        week2Average = week2Average / 7;
        //System.out.println("Week 2: "+ week2Average);
        week3Average = week3Average / 7;
        //System.out.println("Week 3: "+ week3Average);

        this.result = "Week 1 Average: "+week1Average+"\nWeek 2 Average: "+week2Average+"\nWeek 3 Average: "+week3Average;
        this.temperatureWeek = null;

        return this.result;
    }

}