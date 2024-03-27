public class PlayerMage extends Character {

    public String[] atkUpgrades = {"Fireball", "Arcane Blast", "Frost Nova", "Mind Blast"};
    public String[] defUpgrades = {"Arcane Shield", "Mana Barrier", "Evasion Rune", "Warding Aura"};
    public PlayerMage(String name, int maxHp, int hp) {
        super(name, maxHp, hp);
    }

    public PlayerMage() {

    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }
}
