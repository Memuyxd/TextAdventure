public abstract class Character {
    public String name;
    public int maxHp, hp;

    public Character(String name, int maxHp, int hp) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
    }

    public Character() {

    }

    public abstract int attack();

    public abstract int defend();
}
