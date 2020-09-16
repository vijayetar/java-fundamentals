package basiclibrary;

import java.util.Arrays;

public class ArrayListsImports {
    public boolean someLibraryMethod() {
        return true;
    }
    public int[] roll(int n) {
        int[] newArray = new int[n];
        for (int i = 0; i<n; i++){
            int val = (int) (Math.random()*10);
            while (val>6) {
                val = (int) (Math.random()*10);
            }
            System.out.println("this is the val" + val);
            newArray[i] = val;
        }
        return newArray;
    }
    public boolean containsDuplicates(int[] inputArray){
        for (int i = 0; i<inputArray.length; i++){
            for (int j = i+1; j<inputArray.length; j++){
                if (inputArray[i]==inputArray[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isEven(int num){
        return num%2 == 0? true:false;
    }
    public int avgOfArray(int[] inputArray){
        int sum = 0;
        for (int num: inputArray){
            sum+= num;
        }
        return sum/inputArray.length;
    }

    public int[] findLowestAvgArray(int[][] inputMatrix){
        int returnIndex=0;
        double lowestAvg = Double.POSITIVE_INFINITY;
        double currentAvg;
        int sum;
        for (int i = 0; i< inputMatrix.length; i++){
            sum=0;
            if (inputMatrix[i].length !=0){
                for (int num:inputMatrix[i]){
                    sum+=num;
                }
                currentAvg = sum/inputMatrix[i].length;
                if (currentAvg<lowestAvg){
                    returnIndex = i;
                    lowestAvg = currentAvg;
                }
            }

        }
        return inputMatrix[returnIndex];
    }

}
