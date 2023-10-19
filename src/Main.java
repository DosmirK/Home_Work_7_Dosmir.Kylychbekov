public class Main {
    public static void main(String[] args) {

        Hero[] heroes = new Hero[3];
        heroes[0] = new Medic(100, 10, "HEALING", 50);
        heroes[1] = new Magic(150, 15,"MAGIC STRIKE");
        heroes[2] = new Warrior(200, 20, "CRITICAL DAMAGE");

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}
