import java.util.Scanner;
class TextAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n \n \n \n \n \n \n");
        System.out.println("Welcome to Mushroom Problem Solver!");
        Lore.printIntro();
        System.out.println("Select your class \n   (1) Mage (2) Jester");
        int characterSelect = scanner.nextInt();

        if (characterSelect == 1) {
            Lore.printMage();

        } else if (characterSelect == 2) {
            Lore.printJester();


        } else{ System.out.println("Wrong Input!");
        System.exit(0);}
        GameLogic.AnythingToContinue();
        GameLogic.clearConsole();


        GameLogic.printSeperator(100);
        System.out.println("Your adventure... Begins!");
        GameLogic.clearConsole();
        GameLogic.printSeperator(50);
    }

        }


