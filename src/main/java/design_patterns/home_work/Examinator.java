package design_patterns.home_work;

import design_patterns.strategy.heroes.RandomUtil;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Evgeny Borisov
 */
public class Examinator {

    private List<ExerciseGenerator> exerciseGenerators = List.of(
            new PlusForSecondDegreeExerciseGenerator(),
            new MinusForKinderGardenExerciseGenerator(),
            new MultiplyForSecondDegreeExerciseGenerator());

    public List<Exercise> getExercises(int amount) {

        return IntStream.range(0, amount)
                .mapToObj(__ -> {
                    int i = RandomUtil.getRandomInRange(0, exerciseGenerators.size());
                    return exerciseGenerators.get(i).generate();
                }).collect(Collectors.toList());


    }

    public static void main(String[] args) {
        Examinator examinator = new Examinator();
        List<Exercise> exercises = examinator.getExercises(10);
        exercises.forEach(System.out::println);

    }
}



