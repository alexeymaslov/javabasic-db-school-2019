package design_patterns;

/**
 * @author Evgeny Borisov
 */
@TemplateCode(2)
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        //20 lines of code
        return "<HTML> don't call us Nikolas</HTML>";
    }
}
