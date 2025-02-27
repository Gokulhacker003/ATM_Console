package Account;
import Transaction.*;

import java.util.ArrayList;

public abstract class Account {
    protected String id; //ID
    protected String pass; // password
    protected String name; // name
    protected ArrayList<Transaction> Transactions = new ArrayList<>(); //transaction history

    protected Account(String ID, String PASS, String NAME) {
        this.id = ID;
        this.pass = PASS;
        this.name = NAME;
    }
    protected Account(){

    }

    public String getName(){return name;
    }

    public String getPass(){return pass ;}

    public String getId(){return  id;}

    public ArrayList<Transaction> getTransactions(){return  Transactions;}
}
