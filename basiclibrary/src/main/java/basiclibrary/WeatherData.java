package basiclibrary;

import java.util.ArrayList;
import java.util.HashSet;

public class WeatherData {
    public boolean someLibraryMethod() {
        return true;
    }
    public String findMinMax (int[][] inputIntMatrix) {
        //create a hashset of type integer to iterate over the numbers and store them
        // also find the min and max
        int min = (int) Double.POSITIVE_INFINITY;
        int max = 0;
        HashSet<Integer> temp = new HashSet<>();
        // iterate over the numbers in the arrays and then enter it into the Hashset
        for (int[] arr: inputIntMatrix){
            for (int num:arr){
                max = num>max? num:max;
                min = num<min? num:min;
                if (!temp.contains(num)){
                    temp.add(num);
                }
            }
        }
        String newString = new String();
        newString += "High: "+max;
        newString += "\n"+"Low: "+min;
        for (int i = min; i<=max; i++){
            if (!temp.contains(i)){
                newString += "\n"+"Never saw temperature: "+i;
            }
        }
        return newString;
    }
}
