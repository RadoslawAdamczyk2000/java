package eduweb.kursprogramowaniawjava._3_rozpoczynamyprojektgry._3_7_konstruktory;

public class Main {

    static class Complex {
        double real;
        double img;

        void show(){
            System.out.println("Real: " + real + ". Img: " + img);
        }
    }

    public static void main(String[] args){
        Complex z1 = new Complex();
        Complex z2 = new Complex();
        z1.real = 2.5;
        z2.real = 5.5;
        z1.show();
    }
}
