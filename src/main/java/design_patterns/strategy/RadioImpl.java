package design_patterns.strategy;

/**
 * @author Evgeny Borisov
 */
public class RadioImpl implements Radio {
    @Override
    public void a() {
        System.out.println("AAAAAAAAA");
    }

    @Override
    public void b() {
        System.out.println("BBBBBBBBBB");
    }
}
