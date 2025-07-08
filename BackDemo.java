
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


class BankAccount {
    private double balance;
    private static final double MIN_BALANCE = 500.0;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if ((balance - amount) < MIN_BALANCE) {
            throw new InsufficientBalanceException(
                    "Withdrawal denied: Minimum balance of ₹500 must be maintained."
            );
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
    }

    public double getBalance() {
        return balance;
    }
}


public class BackDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        try {
            account.withdraw(600.0); // Try withdrawing ₹600
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        }
        System.out.println("Total Balance: "+account.getBalance());
    }
}
