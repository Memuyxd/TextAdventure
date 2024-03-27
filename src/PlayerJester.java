public class PlayerJester extends Character {
    public int numAtkUpgrades, numDefUpgrades;
    //skill array
    public String[] atkUpgrades = {"Killing Joke", "Mocking Laughter", "Fool's Fury", "Finale"};
    public String[] defUpgrades = {"Tricksters Shuffle", "Jester's Resilience", "Harlequin's Harmony", "Fool's Fortune"};
    public PlayerJester(String name, int maxHp, int hp) {
        super(name, maxHp, hp);

        //setting # of upgrades to 0
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        //let them choose traits
        chooseJesterTrait();
    }

    public PlayerJester() {
        super();
    }

    public PlayerJester(String name) {
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
    public void chooseJesterTrait(){
        GameLogic.clearConsole();
        System.out.println("Choose A Trait");
        System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2) " + defUpgrades[numDefUpgrades]);
        int input = GameLogic.readInt("-> ", 2);
        GameLogic.clearConsole();
        //offensive and defensive selection case
        if(input == 1) {
            System.out.println("You chose " + atkUpgrades[numAtkUpgrades]);
            numAtkUpgrades++;

        }else{
            System.out.println("You chose " + defUpgrades[numDefUpgrades]);
            numDefUpgrades++;
        }
        GameLogic.AnythingToContinue();
    }
}
