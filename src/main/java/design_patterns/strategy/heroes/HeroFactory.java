package design_patterns.strategy.heroes;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

/**
 * @author Evgeny Borisov
 */
public class HeroFactory {

    private List<Class<? extends Hero>> heroClasses;

    public HeroFactory() {
        Reflections scanner = new Reflections("design_patterns.strategy.heroes");
        Set<Class<? extends Hero>> classes = scanner.getSubTypesOf(Hero.class);
        heroClasses = classes.stream().filter(aClass -> !Modifier.isAbstract(aClass.getModifiers()))
                .collect(toList());
    }


    @SneakyThrows
    public Hero getRandomHero() {
        int i = RandomUtil.getRandomInRange(0, heroClasses.size());
        return heroClasses.get(i).getDeclaredConstructor().newInstance();
    }
}



