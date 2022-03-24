package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int damage = RPG_Game.random.nextInt(40);
        boss.setHealth(boss.getHealth()-(this.getDamage()+damage));
        this.setHealth(this.getHealth()-(boss.getDamage())-damage);







    }
}
