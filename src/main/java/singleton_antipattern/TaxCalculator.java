package singleton_antipattern;

/**
 * @author Evgeny Borisov
 */
public class TaxCalculator {

    private NdsResolver ndsResolver;

    public TaxCalculator(NdsResolver ndsResolver) {
        this.ndsResolver = ndsResolver;
    }

    public double withNds(double price) {
        return ndsResolver.getNds() * price+price;
    }


}
