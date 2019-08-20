package java8;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = asList(1, 2, 3);
        list.forEach(x -> {
            System.out.println(x);
        });
    }
}
