package eduweb.kursprogramowaniawjava._3_rozpoczynamyprojektgry._3_3_tablicedwuwymiarowe;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // deklaracja tablicy wielowymiarowej
        int [][] array = new int[2][];
        array[0] = new int[3];
        array[1] = new int[3];
        // System.out.println(array[0][2]);

        // autoinicjalizacja tablicy wielowymiarowej
        int [][] autoArray = new int[][]{
            // new int[3], new int[2]
            new int[]{3,4,5}, 
            new int[]{0,2,4}
        };
        // System.out.println(Arrays.toString(autoArray[1]));

        // wielowymiarowe tablice symetryczne
        int [][] symetricArray = new int[2][4];
        symetricArray[1][2] = 5;
        // System.out.println(Arrays.toString(symetricArray));

        // tablice dwuwymiarowe i pętle for
        for(int i = 0; i < symetricArray.length;i++){
            for(int j = 0; j < symetricArray[i].length;j++){
                System.out.print(symetricArray[i][j] + " ");
                
            }
        }
    }
}
