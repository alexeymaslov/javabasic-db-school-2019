package demo;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Evgeny Borisov
 */
public class MainToWrite {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("c:\\tmp\\data.obj");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
        objectOutputStream.writeObject(Person.builder().age(18).name("Sasha").build());

    }
}











