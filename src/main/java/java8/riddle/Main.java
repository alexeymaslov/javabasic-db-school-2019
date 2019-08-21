package java8.riddle;

import java.util.*;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Arnold", "van dam", "Chuck", "Stallone"));

        list.removeIf(next -> next.equalsIgnoreCase("Chuck"));

        Map<Integer, String> map = new HashMap<>(Map.ofEntries(Map.entry(1, "java")));

        String s = map.getOrDefault(2,"sds");
        System.out.println("s = " + s);
        map.compute(1, (integer, s1) -> s1.toUpperCase());
        System.out.println(map);
    }
}




