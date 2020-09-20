/*
DestinationCity.java
Billy Cussen
10/09/2020
*/

//You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. 
//Return the destination city, that is, the city without any path outgoing to another city.
//It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

import java.util.List;
import java.util.Arrays;

public class DestinationCity{

    public static void main(String[]args){

        //Objects
        List<List<String>> paths1 = Arrays.asList(Arrays.asList("London","New York"),Arrays.asList("New York","Lima"),Arrays.asList("Lima","Sao Paulo"));
        List<List<String>> paths2 = Arrays.asList(Arrays.asList("B","C"),Arrays.asList("D","B"),Arrays.asList("C","A"));
        List<List<String>> paths3 = Arrays.asList(Arrays.asList("A","Z"));
        DestinationCityHelper myDestinationCity = new DestinationCityHelper();

        System.out.println(myDestinationCity.destCity(paths1));
        paths1 = null;
        System.out.println(myDestinationCity.destCity(paths2));
        paths2 = null;
        System.out.println(myDestinationCity.destCity(paths3));
        paths3 = null;
        myDestinationCity = null;
    }

}

class DestinationCityHelper{

    //Solution 1
    //103 / 103 test cases passed.
    //Runtime: 10 ms
    //Memory Usage: 39.2 MB
    public String destCity(List<List<String>> paths) {
        String destination = new String();
        int count = 0;
        for(int i = 0; i < paths.size(); i++){
            count=0;
            for(int j = 0; j < paths.size(); j++){
                if(paths.get(i).get(1).equals(paths.get(j).get(0))){
                    break;
                } else{
                    count++;
                    if(count == paths.size()){
                        destination = paths.get(i).get(1);
                    }
                }
            }
        }
        return destination;
    }


}