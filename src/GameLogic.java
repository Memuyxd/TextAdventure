import java.util.Scanner;

public class GameLogic {
public static int act = 1;
        public static int encountersEngaged = 0;
    static Scanner scanner = new Scanner(System.in);

    public class PlayerHealth {

        double totalHealth;

        int attackStat;
        int defenseStat;

        public static final int EMOTIONAL_DAMAGE = 1;
        public static final int RUSSIAN_HAND_SLAP = 1;
        public static final int LONG_SWORD = 5;
        public static final int KUNGFU_PUNCH = 1;
        public static final int IRONFIST_PUNCH = 10;
        public static final int SPELL_TORNADO = 10;
        public static final int SPELL_LIGHTNING = 25;
        public static final int SPELL_FIREBALL = 25;

        public void calculateHitPoints(int handStrike) {
            totalHealth = (handStrike + (.02 * totalHealth)) - totalHealth;
        }

    }
        //clear lines
        public static void clearConsole(){
            for(int i = 0; i <100; i++);
            System.out.println();
        }
        //separators
        public static void printSeperator(int n){
            for(int i = 0; i < n; i++);
            System.out.println("-");
            System.out.println();
        }
        //heading
        public static void printHeading(String title){
        printSeperator(30);
            System.out.println(title);
            printSeperator(30);
        }
    public static void AnythingToContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter anything to continue...");
        scanner.next();
    }
    public static void checkAct(){

        if(act == 1 && encountersEngaged == 1 ) {

        act = 2;
            Lore.FirstAct();}
    }
    public static void characterInfo() {
            clearConsole();
        System.out.println("======Character Info======");
        System.out.println("HP:" + currentHealth + "/" + totalHealth);
        printSeperator(20);
        System.out.println();

        GameLogic.AnythingToContinue();

    }
    //prints menu
    public static void printMenu(){
            clearConsole();
        System.out.println("======MENU======");
        System.out.println("What will you do?:");
        printSeperator(20);
        System.out.println("(1) Journey forth");
        System.out.println("(2) Character Info");
        System.out.println("Give Up");
    }

    }
