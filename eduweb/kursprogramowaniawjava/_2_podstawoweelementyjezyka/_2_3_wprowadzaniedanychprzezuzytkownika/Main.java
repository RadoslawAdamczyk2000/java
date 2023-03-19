package eduweb.kursprogramowaniawjava._2_podstawoweelementyjezyka._2_3_wprowadzaniedanychprzezuzytkownika;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // System.out.println("Wpisz cyfrę: ");
        // // Wdrażanie treści
        // Scanner scanner = new Scanner(System.in);
        // // int a = scanner.nextInt();
        // String text = scanner.next();
        // String b = new Scanner(System.in).nextLine();
        // // String textA = scanner.nextLine();
        // System.out.println("text: " + b);

        System.out.println("Witaj, podaj swoje imię:");
        String firstName = new Scanner(System.in).next();
        System.out.println("Ile masz lat?");
        int age = new Scanner(System.in).nextInt();
        System.out.println("Witaj " + firstName + "! Masz " + age + " lat."); 

    }
}
