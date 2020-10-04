package Lesson7;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface AccountService {

    void withdraw (int accountId, int amount) throws NotEnouthMoneyException, UnknownAccountException, IOException;
    void balance (int amount) throws UnknownAccountException, FileNotFoundException;
    void deposit (int accountId, int amount) throws NotEnouthMoneyException, UnknownAccountException, FileNotFoundException;
    void transfer (int accountIdFrom, int accountIdTo, int amount) throws NotEnouthMoneyException, UnknownAccountException, FileNotFoundException;
}
