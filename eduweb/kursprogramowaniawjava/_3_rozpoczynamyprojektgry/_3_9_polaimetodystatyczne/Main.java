package eduweb.kursprogramowaniawjava._3_rozpoczynamyprojektgry._3_9_polaimetodystatyczne;

public class Main {

    int value;
    static int staticValue;

    void show() {
        System.out.println("v:" + value+"\nsv:" + staticValue + "\n");
    }
    static void staticShow(Main main) {
        System.out.println("v:" + main.value+"\nsv:" + staticValue + "\n");
    }
    public static void main(String[] args){
        Main main1 = new Main();
        Main main2 = new Main();


        main1.value = 1;
        main1.staticValue = 1;
        main1.staticShow(main1);
        // main1.show();
        // main2.show();
        
        main2.value = 2;
        main2.staticValue = 2;
        main1.staticShow(main1);

        // main2.show();

    }
}
