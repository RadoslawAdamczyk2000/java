package eduweb.kursprogramowaniawjava._3_rozpoczynamyprojektgry._3_7_konstruktory;

public class Main {

    static class Complex {
        double real;
        double img;

        Complex(double r, double i){
            real = r;
            img = i;
        }

        void show(){
            System.out.println("Real: " + real + ". Img: " + img);
        }

        Complex add(Complex z) {
            return new Complex(real + z.real, img + z.img);
        }
    }

    public static void main(String[] args){
        Complex z1 = new Complex(2.5,-3.6);
        Complex z2 = new Complex(-2.5,3.6);
        z1.show();
        z2.show();
        Complex sum = z1.add(z2);
        sum.show();
    }
}
