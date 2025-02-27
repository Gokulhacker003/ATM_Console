package Action;

import Account.Customer;
import Note.Note;
import Transaction.Transaction;

import java.util.ArrayList;

public interface Customer_action extends Action{
    void changePassword(String uid, String oldPassword);
    void addTransaction(Transaction trans, Customer cus);
    void depositAmt (Customer customer);
    void withdrawAmt(Customer customer) throws CloneNotSupportedException;
    double perform_Withdrawal(double Amount,ArrayList<String> note_Tr,Note note);
}
