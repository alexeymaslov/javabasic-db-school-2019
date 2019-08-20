package java8;

import lombok.SneakyThrows;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class ListUtil<T> {


    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Action<T> action) {
        for (T t : list) {
            action.doAction(t);
            Thread.sleep(delay);
        }
    }


    public static <T> int countDuplicate(T t, List<T> list,Equalator<T> equalator) {
        int counter=0;
        for (T t1 : list) {
            if (equalator.equals(t,t1)) {
                counter++;
            }
        }
        return counter;

    }

    public static void main(String[] args) {
        List<Integer> list = asList(12, 3, 4, 5);
        forEachWithDelay(list,250,x -> System.out.println(x));
    }



















}




