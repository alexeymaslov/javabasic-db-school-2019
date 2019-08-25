package my_spring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class JavaConfig implements Config {
    private Map<Class, Class> ifc2ImplClass = new HashMap<>();
    private Set<Class> singletons = new HashSet<>();
    private String prefix;

    public JavaConfig(String prefix) {
        this.prefix = prefix;

        ifc2ImplClass.put(Speaker.class, ConsoleSpeaker.class);
        ifc2ImplClass.put(Cleaner.class, CleanerImpl.class);

        // TODO make singletons for concrete classes
        singletons.add(Speaker.class);
    }

    @Override
    public String getPrefix() {
        return prefix;
    }

    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return ifc2ImplClass.get(type);
    }

    @Override
    public boolean isSingleton(Class type) {
        return singletons.contains(type);
    }
}




