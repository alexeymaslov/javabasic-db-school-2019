package design_patterns;

/**
 * @author Evgeny Borisov
 */
public class DistributionService {
    public void sendMail() {
        int mailCode = DBUtils.getMailCode();
        if (mailCode == 1) {
            //20 lines of code
            System.out.println("Welcome to our company");
        } else if (mailCode == 2) {
            //40 lines of code
            System.out.println("don't call us we call you");
        }
    }
}
