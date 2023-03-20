package eduweb.kursprogramowaniawjava._3_rozpoczynamyprojektgry._3_0_statki;

public class Main {
    public static void main(String[] args){
        topLabel(10);
        System.out.print('\n'); 
        board(10);
    }

    static void topLabel(int size){
        System.out.print("  "); 
        for(int i=0; i < size; i++){
            System.out.print((char)('A' + i)); 

        }
    }
    static void board(int size){
        for(int i=1; i <= 10; i++){
            if(i < 10){
                System.out.print(' '); 
            }
            System.out.print(i); 
            ships();
            System.out.println('\n'); 

        }
    }
    static void ships(){
        for(int j=0;j<10;j++){
            if(Math.random() < 0.2){
                System.out.print('O');
            }else{
                System.out.print(' ');
            }
        }
    }
}
