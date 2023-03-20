package eduweb.kursprogramowaniawjava._3_rozpoczynamyprojektgry._3_2_tablice;

public class Main {
    public static void main(String[] args){
        // int[] array = new int[]{1,2,3,4,5,6,123,123,321,123,123,312,123,1234523,423};
        String[] array = new String[10];
        fill(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(String.format("array [%d] = %s",i,array[i]));
        }
    }

    static void fill(String[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = "val" + i;
        }
    }

}
