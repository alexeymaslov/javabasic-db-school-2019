package design_patterns;

/**
 * @author Evgeny Borisov
 */
@TemplateCode(3)
public class GoodByeMailGenerator implements MailGenerator {
    @Override
    public String generateMail() {
        return "<html> не забудьте сделать домашку </html>";
    }
}
