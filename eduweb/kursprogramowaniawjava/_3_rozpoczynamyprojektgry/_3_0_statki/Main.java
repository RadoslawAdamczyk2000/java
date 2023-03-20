package eduweb.kursprogramowaniawjava._3_rozpoczynamyprojektgry._3_0_statki;

public class Main {
    public static void main(String[] args){
        // Narsowanie planszy
        System.out.print("  "); 
        for(int i=0; i < 10; i++){
            System.out.print((char)('A' + i)); 
            // Jak to działa?
            // System.out.println('A' + 1); Zwraca 6666... ponieważ 'A' jest kompliowane na ciąg liczb
            //  Aby temu zapobiec stosuje się przekompliowanie na char, czyli pojednyczy znak
            // System.out.println((char)'A'); 

        }
        System.out.print('\n'); 
        for(int i=1; i <= 10; i++){
            if(i < 10){
                System.out.print(' '); 
            }
            System.out.print(i); 
            // Dodawanie wartości
            for(int j=0;j<10;j++){
                //  Random
                if(Math.random() < 0.2){
                    System.out.print('O');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println('\n'); 

        }

        
    }
}
