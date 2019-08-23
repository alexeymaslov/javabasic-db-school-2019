package design_patterns.strategy.heroes;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class RandomUtil {
    private static Random random = new Random();




    public static int getRandomInRange(int min, int max) {

        return random.ints(min, max).findAny().getAsInt();
    }



}
