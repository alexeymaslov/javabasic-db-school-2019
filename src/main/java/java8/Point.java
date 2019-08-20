package java8;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
@Data
public class Point {
    private int x;

    public static void printX(Point point) {
        System.out.println(point.getX());
    }

    public void printX() {
        System.out.println(x);
    }
















}
