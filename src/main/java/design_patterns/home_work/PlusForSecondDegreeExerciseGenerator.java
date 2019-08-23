package design_patterns.home_work;

/**
 * @author Evgeny Borisov
 */
public class PlusForSecondDegreeExerciseGenerator implements ExerciseGenerator {

    private GeneratorAssistant generatorAssistant = new GeneratorAssistantImpl(0, 100);

    @Override
    public Exercise generate() {
        Exercise exercise = generatorAssistant.generateTemplate();
        exercise.setOperation(Operation.PLUS);
        exercise.setAnswer(exercise.getA()+exercise.getB());
        return exercise;
    }
}
