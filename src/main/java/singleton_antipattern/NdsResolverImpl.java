package singleton_antipattern;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class NdsResolverImpl implements NdsResolver {

    private final double nds;

    public NdsResolverImpl() {
        this.nds=takeNdsFromCentralBank();
    }

    @SneakyThrows
    private double takeNdsFromCentralBank() {
        Thread.sleep(2000);
        return 0.15;
    }

    @Override
    public double getNds() {
        return nds;
    }
}
