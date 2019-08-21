package streams;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class WordUtilsTest {

    private static File file = new File("lines.txt");

    @Test
    public void average() {
        double avgLength = WordUtils.avgLength(file);
        Assert.assertEquals(4,avgLength,0.00001);
    }

    @Test
    public void countWords() {
        long amount = WordUtils.countWords(file);
        Assert.assertEquals(6,amount);
    }














}