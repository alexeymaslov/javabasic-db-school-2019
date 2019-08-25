package my_spring;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.*;

public class ApplicationContext {
    private ObjectFactory objectFactory;
    private Map<Class, Object> singletonByTypeMap;
    private Config config;

    @SneakyThrows
    public ApplicationContext(Config config) {
        this.config = config;

        List<ObjectConfigurator> configurators = new ArrayList<>();
        Reflections scanner = new Reflections(config.getPrefix());
        Set<Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                ObjectConfigurator objectConfigurator = aClass.getDeclaredConstructor().newInstance();
                configurators.add(objectConfigurator);
                if (ApplicationContextObjectConfigurator.class.isAssignableFrom(aClass)) {
                    ((ApplicationContextObjectConfigurator) objectConfigurator).setApplicationContext(this);
                }
            }
        }

        objectFactory = new ObjectFactory(config, configurators);
        singletonByTypeMap = new HashMap<>();
    }

    public <T> T getObject(Class<T> type) {
        if (config.isSingleton(type)) {
            Object singleton = singletonByTypeMap.get(type);
            if (singleton != null) {
                return (T) singleton;
            } else {
                T newSingleton = objectFactory.createObject(type);
                singletonByTypeMap.put(type, newSingleton);
                return newSingleton;
            }
        } else {
            return objectFactory.createObject(type);
        }
    }
}
