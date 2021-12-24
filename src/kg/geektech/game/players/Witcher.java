package kg.geektech.game.players;

public class Witcher extends Hero{
    public Witcher(int health, int damage, SuperAbility superAbility, String name) {
        super(health, damage, SuperAbility.CHANCE_TO_REVIVE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()<=0){
                heroes[i].setHealth(heroes[i].getHealth() + heroes[6].getHealth());
                heroes[6].setHealth(0);
                System.out.println("Ведьмак отдал свою жизнь: " + heroes[i].getClass().getSimpleName());
            }
        }
    }
}
