package Lesson7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args)  {

        Path path = Path.of("AmountStorage.txt");

        try {
            Files.createFile(path);

        } catch (IOException e) {
            e.printStackTrace();
        }
        {
            System.out.println("Файл AmountStorage.txt уже существует");
        }
        System.out.println(Files.isRegularFile(path));
        System.out.println("Готово");
        //      Files.delete(path);
        System.out.println(Files.isRegularFile(path));
    }
}
