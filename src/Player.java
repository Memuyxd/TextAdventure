import java.util.Scanner;

public class Player extends Character {
    Scanner scanner = new Scanner(System.in);
    public int numAtkUpgrades, numDefUpgrades;
    //skill array
    public String[] atkUpgrades = {"Fool's Fury", "Mocking Laughter", "Fool's Fury", "Finale"};
    public String[] defUpgrades = {"Whimsical Resilience", "Jester's Resilience", "Harlequin's Harmony", "Fool's Fortune"};

    public Player(String name) {
        super(name, 200, 0);

        //setting # of upgrades to 0
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        //let them choose traits
        chooseTrait();
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    //trait selection
    public void chooseTrait() {
        GameLogic.clearConsole();
        GameLogic.printHeading("Choose A Trait");
        System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2) " + defUpgrades[numDefUpgrades]);
        int input = GameLogic.readInt("->", 2);
        GameLogic.clearConsole();
        //offensive and defensive selection case
        if (input == 1) {
            System.out.println("You chose " + atkUpgrades[numAtkUpgrades]);
            numAtkUpgrades++;

        } else {
            System.out.println("You chose " + defUpgrades[numDefUpgrades]);
            numDefUpgrades++;
        }
        GameLogic.AnythingToContinue();
    }
}
