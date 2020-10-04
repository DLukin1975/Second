package Lesson7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    Path path = Path.of("AmountStorage.txt");
    ArrayList<Account> listAccount = new ArrayList<>();

    public void writeAccounts(ArrayList<Account> listAccount) {
        this.listAccount = listAccount;
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(String.valueOf(path)));
            for (int i = 0; i < listAccount.size(); i++) {
                writer.println(listAccount.get(i).getId() + " " + listAccount.get(i).getHolder()
                        + " " + listAccount.get(i).getAmount());
            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void readAccounts(ArrayList<Account> listAccount) throws FileNotFoundException {
        this.listAccount = listAccount;
        Account account = new Account();
        BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(path)));

        try {
            String str;
            while ((str = reader.readLine()) != null) {
                String[] arr = str.split(" ");
                account.setId(Integer.parseInt(arr[0]));
                account.setHolder(arr[1]);
                account.setAmount(Integer.parseInt(arr[2]));
                listAccount.add(new Account(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2])));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




