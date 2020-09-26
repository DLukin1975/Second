package Lesson7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("readme.txt");
        Files.createFile(path);

        System.out.println(Files.isRegularFile(path));
        System.out.println("Готово");
        Files.delete(path);
        System.out.println(Files.isRegularFile(path));
    }
}
