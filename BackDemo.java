import java.util.Scanner;

// Custom exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount class
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

// Main class to run the app
public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ₹");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        System.out.print("Enter withdrawal amount: ₹");
        double withdrawalAmount = scanner.nextDouble();

        try {
            account.withdraw(withdrawalAmount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        }

        System.out.println("Total Balance: ₹" + account.getBalance());

        scanner.close();
    }
}
