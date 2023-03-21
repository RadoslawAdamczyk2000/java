package eduweb.kursprogramowaniawjava._3_rozpoczynamyprojektgry._3_8_enkapsulacja;

import eduweb.kursprogramowaniawjava._3_rozpoczynamyprojektgry._3_8_enkapsulacja.math.Complex;

public class Main {
    public static void main(String[] args){
        Complex z1 = new Complex(2.5,-3.6);
        z1.show();
        z1.setReal(2);
        z1.setImg(3);
    }
}