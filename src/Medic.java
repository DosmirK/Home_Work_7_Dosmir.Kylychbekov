public class Medic extends Hero{

    private  int healPoints;
    @Override
    public void applySuperAbility() {
        System.out.println("Medic used super power HEALIHG");
    }

    public Medic(int health, int damage, String superAbility, int healPoints) {
        super(health,damage,superAbility);
        this.healPoints = healPoints;
    }

    public  void increaseExperience() {
        healPoints += healPoints * 0.10;
    }
}
