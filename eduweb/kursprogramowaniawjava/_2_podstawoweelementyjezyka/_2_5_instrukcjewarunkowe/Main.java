package eduweb.kursprogramowaniawjava._2_podstawoweelementyjezyka._2_5_instrukcjewarunkowe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Wpisz wartość a: ");
        int a = new Scanner(System.in).nextInt();
        if(a == 3){
            System.out.println("A jest równe 3");
        }else if(a > 3){
            System.out.println("A jest większe od 3");
        }else{
            if(a < 0){
                System.out.println("A jest mniejsze od 0");

            }else if(a == 0){
                System.out.println("A jest równe 0");
            }else{
                System.out.println("A jest mniejsze od 3");
            }
        }
    }
}
