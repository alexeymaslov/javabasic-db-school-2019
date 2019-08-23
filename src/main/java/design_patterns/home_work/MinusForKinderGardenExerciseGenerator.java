package design_patterns.home_work;

import design_patterns.strategy.heroes.RandomUtil;

/**
 * @author Evgeny Borisov
 */
public class MinusForKinderGardenExerciseGenerator implements ExerciseGenerator {
    @Override
    public Exercise generate() {
        int a = RandomUtil.getRandomInRange(0, 100);
        int b = RandomUtil.getRandomInRange(0, a);

        return Exercise.builder()
                .a(a)
                .b(b)
                .operation(Operation.MINUS)
                .answer(a - b)
                .build();
    }
}
