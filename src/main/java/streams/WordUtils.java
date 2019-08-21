package streams;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class WordUtils {
    @SneakyThrows
    public static long countWords(File file) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        return bufferedReader.lines()
                .flatMap(line -> Arrays.stream(line.split("\\W+")))
                .count();
    }

    @SneakyThrows
    public static double avgLength(File file) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        return bufferedReader.lines()
                .flatMap(line -> Arrays.stream(line.split("\\W+")))
                .mapToInt(String::length)
                .average().getAsDouble();

    }
}









