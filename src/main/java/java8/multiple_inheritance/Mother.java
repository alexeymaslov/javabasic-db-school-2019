package java8.multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public interface Mother {
    default void talkToChildren(){
        System.out.println("ИДИ СЮДА!!!!!!!!!!");
    }
}
