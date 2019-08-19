package casting;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("гав");
    }

    public void дайЛапу(){
        System.out.println("На");
    }


}
