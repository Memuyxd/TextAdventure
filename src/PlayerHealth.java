public class PlayerHealth {

double totalHealth = 100;
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

