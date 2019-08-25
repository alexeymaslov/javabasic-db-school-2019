package my_spring;

public interface ApplicationContextObjectConfigurator extends ObjectConfigurator {
    void setApplicationContext(ApplicationContext applicationContext);
    ApplicationContext getApplicationContext();
}
