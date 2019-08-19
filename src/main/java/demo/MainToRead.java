package demo;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author Evgeny Borisov
 */
public class MainToRead {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("c:\\tmp\\data.obj");

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person o = (Person) ois.readObject();
        System.out.println("o = " + o);

    }
}











