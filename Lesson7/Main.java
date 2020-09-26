package Lesson7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("AmountStorage.txt");
        PrintWriter writer = new PrintWriter(new FileWriter(String.valueOf(path)));
        BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path)));


        ArrayList<Account> listAccount = new ArrayList<>();
        listAccount.add(new Account(0, "SteveJobs", 10));
        listAccount.add(new Account(1, "SteveJobs", 10));
        listAccount.add(new Account(2, "BillGates", 10));
        listAccount.add(new Account(3, "BillGates", 10));
        listAccount.add(new Account(4, "ElonMusk", 10));
        listAccount.add(new Account(5, "ElonMusk", 10));
        listAccount.add(new Account(6, "JackMa", 10));
        listAccount.add(new Account(7, "JackMa", 10));
        listAccount.add(new Account(8, "Me", 100));
        listAccount.add(new Account(9, "Me", 100));


  /*      for (int i = 0; i < listAccount.size(); i++) {
            writer.println(listAccount.get(i).getId() + " "
                    + listAccount.get(i).getHolder() + " "
                    + listAccount.get(i).getAmount());
        }
        writer.close(); //*/

        System.out.println("Готово");
        List<String> list = Files.readAllLines(path);
        for (String str : list) {
            String[] arr = str.split(" ");
            System.out.print(arr[1] + " ");
            System.out.println(str);
        }

        reader.close();
    }
}
