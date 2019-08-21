package casting;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class AnimalFactory {
    private Random random = new Random();

    private List<Supplier<Animal>> suppliers = asList(
            Cat::new,
            Dog::new
    );


    public Animal createRandomAnimal() {

        int i = random.nextInt(suppliers.size());
        Supplier<Animal> supplier = suppliers.get(i);
        return supplier.get();
    }

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        animalFactory.createRandomAnimal().makeVoice();
        animalFactory.createRandomAnimal().makeVoice();
        animalFactory.createRandomAnimal().makeVoice();
        animalFactory.createRandomAnimal().makeVoice();
    }
}






