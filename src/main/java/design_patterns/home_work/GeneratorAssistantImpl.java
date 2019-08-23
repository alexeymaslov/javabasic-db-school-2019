package design_patterns.home_work;

import design_patterns.strategy.heroes.RandomUtil;
import lombok.AllArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public class GeneratorAssistantImpl implements GeneratorAssistant {
    private int min;
    private int max;

    @Override
    public Exercise generateTemplate() {
       return Exercise.builder()
                .a(RandomUtil.getRandomInRange(min,max))
                .b(RandomUtil.getRandomInRange(min,max))
               .build();

    }
}
