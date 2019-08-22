package design_patterns.strategy.heroes;

/**
 * @author Evgeny Borisov
 */
public class Sword implements Weapon {
    @Override
    public void kick(Hero attacker, Hero defender) {
        int damage = RandomUtil.getRandomInRange(0, attacker.getPower());
        defender.decreaseHp(damage);
        System.out.println(attacker.getClass().getSimpleName()+" kicked "+defender.getClass().getSimpleName()+" damage = "+damage);
    }
}
