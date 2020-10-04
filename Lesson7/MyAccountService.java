package Lesson7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class MyAccountService implements AccountService {
    ArrayList<Account> listAccount = new ArrayList<>();
    FileService fileService = new FileService();

    @Override
    public void withdraw(int accountId, int amount) throws NotEnouthMoneyException, UnknownAccountException {
        try {
            listAccount = new ArrayList<>();
            fileService.readAccounts(listAccount);
            boolean accountCheck = false;
            for (int i = 0; i < listAccount.size(); i++) {
                if (listAccount.get(i).getId() == accountId) {
                    accountCheck = true;
                    if (listAccount.get(i).getAmount() < amount) {
                        throw new NotEnouthMoneyException();
                    }
                    listAccount.get(i).setAmount(listAccount.get(i).getAmount() - amount);
                }
            }
            if (!accountCheck) {
                throw new UnknownAccountException();
            }
            fileService.writeAccounts(listAccount);
        } catch (NotEnouthMoneyException ex1) {
            ex1.message();
        } catch (UnknownAccountException ex2) {
            ex2.message();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void balance(int accountId) throws UnknownAccountException {
        try {
            listAccount = new ArrayList<>();
            fileService.readAccounts(listAccount);
            boolean accountCheck = false;
            for (int i = 0; i < listAccount.size(); i++) {
                if (listAccount.get(i).getId() == accountId) {
                    accountCheck = true;
                    System.out.println("Информация о счете:");
                    System.out.println("Номер счета " + listAccount.get(i).getId());
                    System.out.println("Владелец счета " + listAccount.get(i).getHolder());
                    System.out.println("Баланс " + listAccount.get(i).getAmount());
                }
            }
            if (!accountCheck) {
                throw new UnknownAccountException();
            }
        } catch (UnknownAccountException ex) {
            ex.message();
        } catch (FileNotFoundException ex2) {
        }
    }

    @Override
    public void deposit(int accountId, int amount) throws
            UnknownAccountException, FileNotFoundException {
        try {
            listAccount = new ArrayList<>();
            fileService.readAccounts(listAccount);
            boolean accountCheck = false;
            for (int i = 0; i < listAccount.size(); i++) {
                if (listAccount.get(i).getId() == accountId) {
                    accountCheck = true;
                    listAccount.get(i).setAmount(listAccount.get(i).getAmount() + amount);
                }
            }
            if (!accountCheck) {
                throw new UnknownAccountException();
            }
            fileService.writeAccounts(listAccount);
        } catch (UnknownAccountException ex) {
            ex.message();
        } catch (FileNotFoundException ex2) {
        }
    }

    @Override
    public void transfer(int accountIdFrom, int accountIdTo, int amount) throws
            NotEnouthMoneyException, UnknownAccountException, FileNotFoundException {
        try {
            listAccount = new ArrayList<>();
            fileService.readAccounts(listAccount);
            boolean accountFromCheck = false;
            boolean accountToCheck = false;
            for (int i = 0; i < listAccount.size(); i++) {
                if (listAccount.get(i).getId() == accountIdFrom) {
                    accountFromCheck = true;
                    if (listAccount.get(i).getAmount() < amount) {
                        throw new NotEnouthMoneyException();
                    }
                    listAccount.get(i).setAmount(listAccount.get(i).getAmount() - amount);
                }
                if (listAccount.get(i).getId() == accountIdTo) {
                    accountToCheck = true;
                    listAccount.get(i).setAmount(listAccount.get(i).getAmount() + amount);
                }
            }
            if (!accountFromCheck || !accountToCheck) {
                throw new UnknownAccountException();
            }
            fileService.writeAccounts(listAccount);
        } catch (NotEnouthMoneyException ex1) {
            ex1.message();
        } catch (UnknownAccountException ex2) {
            ex2.message();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
