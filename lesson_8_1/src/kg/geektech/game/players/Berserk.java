package kg.geektech.game.players;

public class Berserk extends Hero {
    public Berserk(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int bossDamage2= boss.getDamage();
        int bladeMail = bossDamage2 / 5;
        boss.setHealth(boss.getHealth()- bladeMail);
        System.out.println("boss got damage back: "+ bladeMail);

    }
}
