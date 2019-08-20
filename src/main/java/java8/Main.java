package java8;

import java.util.List;
import java.util.function.Function;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Function<String, Integer> function = Integer::new;
//        List<Point> points = asList(new Point(12), new Point(13));
//        points.forEach(Point::printX);
    }
}
