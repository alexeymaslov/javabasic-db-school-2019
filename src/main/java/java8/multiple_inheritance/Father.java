package java8.multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public interface Father {
   default void talkToChildren(){
       System.out.println("Иди сюда");
   }
}
