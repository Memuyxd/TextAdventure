import java.util.Scanner;

public class GameLogic {
public static int act = 1, place = 0;
    double totalHealth;

    int attackStat;
    int defenseStat;
    public static String[] encounters = {"Battle", "Battle", "Rest", "Rest"};
    public static String[] monsters = {"Mushroom", "Goblin", "Thief", "Slime", "Mushroom" };
        public static int encountersEngaged = 0;
    static Scanner scanner = new Scanner(System.in);
public static int readInt(String prompt, int userChoices){
    int input;
    do {
        System.out.println(prompt);
        try{
            input = Integer.parseInt(scanner.next());
        }catch(Exception e){
            input =-1;
            System.out.println("Please enter an integer!");
        }
    }while(input < 1 || input > userChoices);
    return input;
    }

    public class PlayerHealth {



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
        place = 1;
        act = 2;
            Lore.FirstAct();
            //new monster
        monsters[0] = "Mushroom";
        monsters[1] = "Goblin";
        monsters[2] = "Kangaroo";
        monsters[3] = "Ogre";
        monsters[4] = "Thief";
        //new encounter value
        encounters[0] = "Battle";
        encounters[1] = "Battle";
        encounters[2] = "Rest";
        encounters[3] = "Battle";
        encounters[4] = "Battle";
        }
        else if (act == 1 && encountersEngaged == 0) {


        }
    }
    //RANDOM ENCOUNTER CONTROL
    public static void randomEncounter(){
        //random number from 0 to array length
        int encounter = (int) (Math.random()* encounters.length);
        if(encounters[encounter].equals("Battle"));
            //randomBattle();
           // else(encounters[encounter].equals("Rest"))
                //takeRest();
    }

    public static void journeyForth(){
        //check if act must be increased
        checkAct();
        //check if final act
        if(act != 3){
            randomEncounter();
        }
    }
    public static void characterInfo() {
            clearConsole();
        System.out.println("======Character Info======");
        System.out.println("HP:100");
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
