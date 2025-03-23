public class BankAccount implements Transaction {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Error: Balance cannot be negative.");
        } // end if
        balance = initialBalance;
    } // end constructor

    public double getBalance() {
        return balance;
    }
    
    @Override

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Error: Deposit amount must be greater than 0.");
        } // end if 
        balance += amount;
        System.out.println("Deposit successful! New balance: $" + balance);
    } // end constructor

    @Override

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Error: Withdrawal amount must be positive.");
        } // end if 
        if (amount > balance) {
            throw new IllegalArgumentException("Error: Insufficient funds.");
        } // end if 
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: $" + balance);
    } // end constructor 
} // end class
