package eduweb.kursprogramowaniawjava._3_rozpoczynamyprojektgry._3_8_enkapsulacja.math;

public class Complex {
    private double real;
    private double img;

    public Complex(double r, double i){
        real = r;
        img = i;
    }

    public void setReal(double r){
        real = r;
    }
    public void setImg(double i){
        img = i;
    }

    public void show(){
        System.out.println("Real: " + real + ". Img: " + img);
    }

    public Complex add(Complex z) {
        return new Complex(real + z.real, img + z.img);
    }
}
