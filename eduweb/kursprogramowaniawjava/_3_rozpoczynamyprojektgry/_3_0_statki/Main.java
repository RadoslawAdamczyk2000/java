package eduweb.kursprogramowaniawjava._3_rozpoczynamyprojektgry._3_0_statki;

public class Main {
    public static void main(String[] args){
        printLetters(10);
        System.out.print('\n'); 
        printBoard(10);
    }

    static void printLetters(int size){
        System.out.print("  "); 
        for(int i=0; i < size; i++){
            System.out.print((char)('A' + i)); 

        }
    }
    static void printBoard(int size){
        for(int i=1; i <= 10; i++){
            if(i < 10){
                System.out.print(' '); 
            }
            System.out.print(i); 
            for(int j=0;j<10;j++){
                char shipValue = getRandomShip();
               System.out.print(shipValue);
            }
            System.out.println('\n'); 

        }
    }

    private static char getRandomShip() {
        if(Math.random() < 0.2){
            return '0';
        }else{
            return ' ';
        }
    }
   
}
