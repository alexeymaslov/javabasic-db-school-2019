package streams;

import casting.Cat;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7);

        Map<Boolean, List<Integer>> map = stream.collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println(map);
    }
}
