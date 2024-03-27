import java.util.Scanner;

public class GameLogic {
    static Player player;
    public static boolean isRunning;
    public static int act = 1, place = 0;
    double totalHealth;

    int attackStat = 10;
    int defenseStat = 7;
    public static String[] encounters = {"Battle", "Battle", "Rest", "Rest"};
    public static String[] monsters = {"Mushroom", "Goblin", "Thief", "Slime", "Mushroom"};
    public static int encountersEngaged = 0;
    static Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt, int userChoices) {
        int input;
        do {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                input = -1;
                System.out.println("Please enter an integer!");
            }
        } while (input < 1 || input > userChoices);
        return input;
    }

    public class PlayerHealth {

        public static final int KILLING_JOKE = 2;
        public static final int MOCKING_LAUGHTER = 4;
        public static final int FOOLS_FURY = 6;
        public static final int FINALE = 10;
        public static final int TRICKSTERS_SHUFFLE = 2;
        public static final int JESTERS_RESILIENCE = 6;
        public static final int HARLEQUINS_HARMONY = 10;
        public static final int FOOLS_FORTUNE = 14;


        public void calculateHitPoints(int KILLING_JOKE) {
            player.maxHp = (int) ((KILLING_JOKE + (.02 * player.hp)) - player.hp);
        }


    }

    //clear lines
    public static void clearConsole() {
        for (int i = 0; i < 100; i++) ;
        System.out.println();
    }

    //separators
    public static void printSeperator(int n) {
        for (int i = 0; i < n; i++) ;
        System.out.println("-");
        System.out.println();
    }

    //heading
    public static void printHeading(String title) {
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }

    public static void AnythingToContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter anything to continue...");
        scanner.next();
    }

    public static void startGame() {
        boolean nameSet = false;
        String name;
        //print title
        clearConsole();
        printSeperator(20);
        printSeperator(20);
        System.out.println("EVIL MUSHROOM PROBLEM");
        printSeperator(20);
        printSeperator(20);
        AnythingToContinue();
        do {
            clearConsole();
            printHeading("Enter your name  ");
            name = scanner.next();
            printHeading("Your name is " + name + "?" + "\n is that correct?");
            System.out.println("(1) Yes");
            System.out.println("(2) No");
            int input = readInt("-> ", 2);
            if (input == 1)
                nameSet = true;

        } while (!nameSet);

        //PRINTS INTRO OF STORY
        Lore.printIntro();

        //PRINT JESTER
        Lore.printJester();

        GameLogic.printSeperator(100);
        System.out.println("Your adventure... Begins!");
        GameLogic.clearConsole();
        GameLogic.printSeperator(50);

        //player object
        player = new Player(name);
        isRunning = true;

        gameLoop();
    }

    public static void gameLoop() {
        while (isRunning) {
            printMenu();
            int input = readInt("->", 3);
            if (input == 1) {
                journeyForth();

            } else if (input == 2) {
                characterInfo();
            } else
                isRunning = false;
        }
    }

    public static void checkAct() {

        if (act == 1 && encountersEngaged == 1) {
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
        } else if (act == 1 && encountersEngaged == 0) {
            randomEncounter();


        }
    }

    //RANDOM ENCOUNTER CONTROL
    public static void randomEncounter() {
        //random number from 0 to array length
        int encounter = (int) (Math.random() * encounters.length);
        if (encounters[encounter].equals("Battle")) ;
        //randomBattle();
        // else(encounters[encounter].equals("Rest"))
        //takeRest();
    }

    public static void journeyForth() {
        //check if act must be increased
        checkAct();
        //check if final act
        if (act != 3) {
            randomEncounter();
        }
    }

    public static void characterInfo() {
        clearConsole();
        System.out.println("======Character Info======");
        System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHp);
        printSeperator(20);
        //TRAITS PRINTING
        if (player.numAtkUpgrades > 0) {
            System.out.println("Offensive trait: " + player.atkUpgrades[player.numAtkUpgrades - 1]);
            printSeperator(20);
        }
        if (player.numDefUpgrades > 0) {
            System.out.println("Defensive Trait: " + player.defUpgrades[player.numDefUpgrades - 1]);
            printSeperator(20);
            AnythingToContinue();
        }


    }

    //prints menu
    public static void printMenu() {
        clearConsole();
        System.out.println("======MENU======");
        System.out.println("What will you do?:");
        printSeperator(20);
        System.out.println("(1) Journey forth");
        System.out.println("(2) Character Info");
        System.out.println("(3)Give Up");
    }

}
