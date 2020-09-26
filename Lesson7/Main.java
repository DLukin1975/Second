package Lesson7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args){

  //      Files.createFile(Path.of("c:\Q123.txt"));

        System.out.println(Files.isRegularFile(Path.of("C:\\readme.txt")));
        System.out.println("Готово");
    }
}
