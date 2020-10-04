package Lesson7;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, NotEnouthMoneyException, UnknownAccountException {

        FileService fileService = new FileService();
        ArrayList<Account> listAccount = new ArrayList<>();
        MyAccountService mas = new MyAccountService();
        Scanner scanner = new Scanner(System.in);
        int operationType;
        int accountFrom;
        int accountTo;
        int amount;

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
        System.out.println("Текущие счета");
        for (int i = 0; i < listAccount.size(); i++) {
            System.out.print(listAccount.get(i).getId() + " ");
            System.out.print(listAccount.get(i).getHolder() + " ");
            System.out.println(listAccount.get(i).getAmount());
        }

        System.out.println("Выберите операцию:");
        System.out.println("1 - Списание со счета");
        System.out.println("2 - Запрос баланса");
        System.out.println("3 - Внесение средств на счет");
        System.out.println("4 - Перевод средств со счета на счет");
        operationType = scanner.nextInt();

        switch (operationType) {
            case (1): {
                System.out.println("Списание со счета");
                System.out.println("Введите номер счета и сумму");
                accountFrom = scanner.nextInt();
                amount = scanner.nextInt();
                mas.withdraw(accountFrom,amount);
                break;
            }
            case (2): {
                System.out.println("Запрос баланса");
                System.out.println("Введите номер счета");
                accountFrom = scanner.nextInt();
                mas.balance(accountFrom);
                break;
            }
            case (3): {
                System.out.println("Внесение средств на счет");
                System.out.println("Введите номер счета и сумму");
                accountTo = scanner.nextInt();
                amount = scanner.nextInt();
                mas.withdraw(accountTo,amount);
                break;
            }
            case (4): {
                System.out.println("Перевод средств со счета на счет");
                System.out.println("Введите номер счета откуда и номер счета куда переводить и сумму");
                accountFrom = scanner.nextInt();
                accountTo = scanner.nextInt();
                amount = scanner.nextInt();
                mas.transfer(accountFrom,accountTo,amount);
                break;
            }
            default: {
                break;
            }

        }

        listAccount = new ArrayList<>();
        fileService.readAccounts(listAccount);

        System.out.println("Новое состояние счетов");
        for (int i = 0; i < listAccount.size(); i++) {
            System.out.print(listAccount.get(i).getId() + " ");
            System.out.print(listAccount.get(i).getHolder() + " ");
            System.out.println(listAccount.get(i).getAmount());
        } //*/
    }
}

