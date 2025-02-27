package Action;

import Account.*;

import java.util.ArrayList;

public interface Action {

    // Method for admin login
    Account login(ArrayList<Account> adminList);
}
