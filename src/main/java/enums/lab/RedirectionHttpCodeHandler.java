package enums.lab;

/**
 * @author Evgeny Borisov
 */
public class RedirectionHttpCodeHandler implements HttpCodeHandler {
    @Override
    public void handle() {
        System.out.println("redirection was handled...");
    }
}
