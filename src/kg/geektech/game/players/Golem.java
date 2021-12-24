package kg.geektech.game.players;

public class Golem extends Hero {
    public Golem(int health, int damage, SuperAbility superAbility, String name) {
        super(health, damage, SuperAbility.DAMAGE_ABSORPTION, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getHealth() > 0) {
                heroes[i].setHealth((heroes[i].getHealth() + (boss.getDamage() / 5)));
            }
        }

    }
}
