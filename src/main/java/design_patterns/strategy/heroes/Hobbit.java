package design_patterns.strategy.heroes;

/**
 * @author Evgeny Borisov
 */
public class Hobbit extends Hero {
    @Override
    protected int getInitialHp() {
        return 3;
    }

    @Override
    protected int getInitialPower() {
        return 0;
    }

    @Override
    public void kick(Hero enemy) {
        cry();
    }

    private void cry() {
        System.out.println("Я плачу");
    }
}
