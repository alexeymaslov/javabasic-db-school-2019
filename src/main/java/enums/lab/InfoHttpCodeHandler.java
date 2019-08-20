package enums.lab;

/**
 * @author Evgeny Borisov
 */
public class InfoHttpCodeHandler implements HttpCodeHandler {
    @Override
    public void handle() {
        System.out.println("info was handled...");
    }
}
