package demo.riddles;

/**
 * @author Evgeny Borisov
 */
public class Son extends Parent {
    private final double PI = 3.14;


    public Son() {
        printPi();
    }

    @Override
    public void printPi() {
        System.out.println(PI);
    }
}
