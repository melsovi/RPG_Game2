package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage, SuperAbility superAbility, String name) {
        super(health, damage, SuperAbility.DEAFEN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coefficient  = RPG_Game.random.nextInt(2);
        if (boss.getHealth() > 0 && coefficient == 1) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0 ){
                    heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage() -(boss.getDamage() / 5) );
                }
            }
            System.out.println("Top оглушил Босса " );
        } else {
            System.out.println("Тор облажался");
        }
    }
}
