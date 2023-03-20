package eduweb.kursprogramowaniawjava._2_podstawoweelementyjezyka._2_6_petle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Pętla do while
        int a;
        do {    
            System.out.println("Wpisz wartość A: ");
            a = new Scanner(System.in).nextInt();
        }while(a > 10);
        // Pętla while
        System.out.println("Wpisz wartość B:");
        int b =  new Scanner(System.in).nextInt();
        while(b < 15){
            System.out.println("Wartość B: " + b);
            b+=2;
        }
        // Pętla for
        System.out.println("Wpisz wartość C: ");
        int c = new Scanner(System.in).nextInt();
        if(c > 100){
            for(int d = c ; d < 0; d-- ){  
                System.out.println("Wartość C: " + c);
            }
        }else if(c < 100){
            for(int d = c ; d > 100; d++ ){  
                System.out.println("Wartość C: " + c);
            }
        }else{
            System.out.println("C ma wartość: " + c);
        }

    }
}
