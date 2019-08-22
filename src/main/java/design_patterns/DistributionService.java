package design_patterns;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
public class DistributionService {
    private Map<Integer, MailGenerator> map = new HashMap<>();

    private static int getTemplateCode(Class<? extends MailGenerator> c) {
        return c.getAnnotation(TemplateCode.class).value();
    }

    @SneakyThrows
    private static MailGenerator getGenerator(Class<? extends MailGenerator> c) {
        return c.getDeclaredConstructor().newInstance();
    }

    @SneakyThrows
    public DistributionService() {
        initMap();

       /* for (Class<? extends MailGenerator> aClass : set) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                TemplateCode annotation = aClass.getAnnotation(TemplateCode.class);
                int mailCode = annotation.value();
                MailGenerator mailGenerator = aClass.getDeclaredConstructor().newInstance();
                if (map.containsKey(mailCode)) {
                    throw new IllegalStateException(mailCode + " already in use");
                }
                map.put(mailCode, mailGenerator);
            }
        }*/
    }

    private void initMap() {
        Reflections scanner = new Reflections("design_patterns");
        Set<Class<? extends MailGenerator>> set = scanner.getSubTypesOf(MailGenerator.class);

        map = set.stream()
                .filter(aClass -> !Modifier.isAbstract(aClass.getModifiers()))
                .filter(aClass -> aClass.isAnnotationPresent(TemplateCode.class))
                .collect(toMap(DistributionService::getTemplateCode, DistributionService::getGenerator));
    }

    public void sendMail() {
        int mailCode = DBUtils.getMailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode + " not supported yet");
        }
        String html = mailGenerator.generateMail();
        send(html);
    }



    private void send(String html) {
        System.out.println("html was sent: " + html);
    }
}



