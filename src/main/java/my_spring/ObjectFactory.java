package my_spring;

import design_patterns.strategy.heroes.RandomUtil;
import lombok.SneakyThrows;
import net.sf.cglib.proxy.Enhancer;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

import javax.annotation.PostConstruct;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    private Config config;
    private List<ObjectConfigurator> configurators;

    @SneakyThrows
    public ObjectFactory(Config config, List<ObjectConfigurator> configurators) {
        this.config = config;
        this.configurators = configurators;
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        type = resolveImpl(type);
        T t = create(type);
        configure(t);
        invokeInit(t);
        t = tryToWrapObjectIntoBenchmarkProxyIfHasAnnotation(t);
//        Proxy.newProxyInstance(type.getClassLoader(),)
//        Enhancer.
        return t;
    }

    private <T> void invokeInit(T t) throws IllegalAccessException, InvocationTargetException {
        Class<?> type = t.getClass();
        Set<Method> initMethods = ReflectionUtils.getAllMethods(type, method -> method.isAnnotationPresent(PostConstruct.class));
        for (Method initMethod : initMethods) {
            initMethod.invoke(t);
        }
    }

    private <T> void configure(T t) {
        configurators.forEach(configurator -> configurator.configure(t));
    }

    private <T> T create(Class<T> type) throws InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException, NoSuchMethodException {
        return type.getDeclaredConstructor().newInstance();
    }

    private <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }
        return type;
    }

    private <T> T tryToWrapObjectIntoBenchmarkProxyIfHasAnnotation(T object) {
        Class<?> aClass = object.getClass();

        if (aClass.isAnnotationPresent(Benchmark.class)) {
            InvocationHandler invocationHandler = (proxy, method, args) -> {
                long start = System.nanoTime();
                Object invoke = method.invoke(object, args);
                long end = System.nanoTime();
                System.out.println(method.getName() + ": " + (end-start) + " ns");
                return invoke;
            };

            return (T) Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), invocationHandler);
        }

        // TODO use cglib

        return object;
    }
}
