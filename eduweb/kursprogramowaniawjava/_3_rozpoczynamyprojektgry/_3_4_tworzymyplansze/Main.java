package eduweb.kursprogramowaniawjava._3_rozpoczynamyprojektgry._3_4_tworzymyplansze;

public class Main {
    public static void main(String[] args){
        printLetter();
        printBoard();
    }

    static void printLetter(){
        System.out.print("  ");
        for(int i = 0; i < 10; i++){
            System.out.print((char)('A' + i));
        }
        System.out.print('\n');
    }

    static void printBoard(){
        for(int i = 0; i <= 10; i++){
            if(i < 10){
                System.out.print(' ');
            }
            System.out.print(i);
            for(int j = 0;j < 10; j++){
                char shipValue = getRandomShip(Math.random());
                System.out.print(shipValue);
            }
            System.out.print('\n');
        }
    }

    private static char getRandomShip(double ships){
        if(ships < 0.2){
            return '0';
        }else{
            return ' ';
        }
    }
}
