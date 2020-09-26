package Lesson7;

public interface AccountService {

    void withdraw (int accountId, int amount) throws NotEnouthMoneyExeption, UnknownAccountExeption;
    void balance (int amount) throws UnknownAccountExeption;
    void deposit (int accountId, int amount) throws NotEnouthMoneyExeption, UnknownAccountExeption;
    void transfer (int accountIdFrom, int accountIdTo, int amount) throws NotEnouthMoneyExeption, UnknownAccountExeption;
}
