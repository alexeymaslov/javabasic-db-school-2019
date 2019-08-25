package my_spring;

/**
 * @author Evgeny Borisov
 */
public interface Config {
    String getPrefix();
    <T> Class<T> getImplClass(Class<T> type);
    boolean isSingleton(Class type);
}
