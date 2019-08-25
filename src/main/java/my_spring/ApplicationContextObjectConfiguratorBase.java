package my_spring;

public abstract class ApplicationContextObjectConfiguratorBase implements ApplicationContextObjectConfigurator {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public abstract void configure(Object t);
}
