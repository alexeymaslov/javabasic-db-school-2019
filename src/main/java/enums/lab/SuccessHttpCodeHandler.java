package enums.lab;

/**
 * @author Evgeny Borisov
 */
public class SuccessHttpCodeHandler implements HttpCodeHandler {
    @Override
    public void handle() {
        System.out.println("success was handled...");
    }
}
