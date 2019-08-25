package my_spring;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class InjectByTypeAnnotationObjectConfigurator extends ApplicationContextObjectConfiguratorBase {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Set<Field> fields = ReflectionUtils.getAllFields(t.getClass(), field -> field.isAnnotationPresent(InjectByType.class));
        for (Field field : fields) {
            field.setAccessible(true);
            Object object = getApplicationContext().getObject(field.getType());
            field.set(t,object);
        }
    }
}

