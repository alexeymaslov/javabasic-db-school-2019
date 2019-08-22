package design_patterns.strategy.heroes;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();
        GameManager gameManager = new GameManager();
        gameManager.fight(heroFactory.getRandomHero(), heroFactory.getRandomHero());
    }
}
