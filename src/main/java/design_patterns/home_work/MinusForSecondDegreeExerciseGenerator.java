package design_patterns.home_work;

/**
 * @author Evgeny Borisov
 */
public class MinusForSecondDegreeExerciseGenerator implements ExerciseGenerator {

    private GeneratorAssistant generatorAssistant = new GeneratorAssistantImpl(0, 100);

    @Override
    public Exercise generate() {
        Exercise exercise = generatorAssistant.generateTemplate();
        exercise.setOperation(Operation.MINUS);
        exercise.setAnswer(exercise.getA()-exercise.getB());
        return exercise;
    }
}
