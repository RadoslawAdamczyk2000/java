package eduweb.kursprogramowaniawjava._2_podstawoweelementyjezyka._2_2_operatory;

public class Main {
    public static void main(String[] args){
        float a=2.0f, b=3.0f;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("a = a + b: " +( a+ b));
        System.out.println("a = a - b: " +( a-b));
        System.out.println("a = a * b: " +( a*b));
        System.out.println("a = a / b: " +( a/b));
        System.out.println("a = a**: " + Math.pow(b,a*a));
        // System.out.println("a = a % b: " +( a&b));
    }
}
