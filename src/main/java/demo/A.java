package demo;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class A implements Comparable<A> {
    @Override
    @SneakyThrows
    public int compareTo(A o) {
        Thread.sleep(1);

        return 0;
    }
}
