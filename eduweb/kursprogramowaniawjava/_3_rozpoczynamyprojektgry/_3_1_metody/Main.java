package eduweb.kursprogramowaniawjava._3_rozpoczynamyprojektgry._3_1_metody;

public class Main {
    public static void main(String[] args) {
        double x = 210;
        double val = f(x);   
        printValue(val);
       
    }
    // Deklaracja metody
    static double f(double x){
        return x*x+3;
    }

    // Deklaracja metody, od której nieoczekujemy zwrócenia żadnej wartości
    static void printValue(double value){
        System.out.print(value);
    }
}
