package design_patterns.strategy.heroes;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class Knight extends Hero {
    @Setter
    private Weapon weapon = new Sword();

    @Override
    protected int getInitialHp() {
        return RandomUtil.getRandomInRange(2, 12);
    }

    @Override
    protected int getInitialPower() {
        return RandomUtil.getRandomInRange(2, 12);
    }

    @Override
    public void kick(Hero enemy) {
        weapon.kick(this,enemy);
    }
}


