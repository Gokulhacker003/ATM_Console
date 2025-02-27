package Account;

// Customer class to represent customer details and actions
public class Customer extends Account {
    private long balance;// Customer account balance

    // Constructor to initialize a customer with ID, password, and name
    public Customer(String ID, String pass, String name) {
        super(ID,pass,name);
    }

    // Default constructor
    public Customer() {
    }

    public void setPass(String newpass) {
        super.pass=newpass;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
