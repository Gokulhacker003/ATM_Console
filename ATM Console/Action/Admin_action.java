package Action;

import Account.Admin;
import Transaction.Transaction;

public interface Admin_action extends Action {
    void addUser();
    void deleteUser(String userId);
    void viewAllAccounts();
    void viewAllTransactions();
    void addATMoney(Admin admin);
    void addAdTransaction(Transaction transaction, Admin admin);
}
