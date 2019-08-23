package design_patterns.home_work;

/**
 * @author Evgeny Borisov
 */
public class MultiplyForSecondDegreeExerciseGenerator implements ExerciseGenerator {

    private GeneratorAssistant generatorAssistant = new GeneratorAssistantImpl(2, 10);

    @Override
    public Exercise generate() {
        Exercise exercise = generatorAssistant.generateTemplate();
        exercise.setOperation(Operation.MULTIPLY);
        exercise.setAnswer(exercise.getA()*exercise.getB());
        return exercise;
    }
}
