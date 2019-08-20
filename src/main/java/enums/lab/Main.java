package enums.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        HttpCodeEnum.findByHttpCode(150);
    }


    public void appendToFile(File file, String text) {
        if (file.exists()) {
            try {
                new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                // it will never happen
            }
        }
    }

}
