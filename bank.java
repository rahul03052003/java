class Account {
    public int balance;
    public int accountNo;

    void displayBalance() {
        System.out.println("Updated Balance = " + balance);
    }

    synchronized void deposit(int amount) {
        System.out.println(amount + " is deposited");
        balance = balance + amount;
        displayBalance();
    }

    synchronized void withdraw(int amount) {
        System.out.println(amount + " is withdrawn");
        balance = balance - amount;
        displayBalance();
    }
}

class TransactionDeposit implements Runnable {
    int amount;
    Account accountX;

    TransactionDeposit(Account X, int amount) {
        accountX = X;
        this.amount = amount;
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (accountX) {
            accountX.deposit(amount);
        }
    }
}

public class bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.balance = 1000;
        account.accountNo = 12345;

        new TransactionDeposit(account, 500);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        account.withdraw(300);
    }
}


o/p
  
500 is deposited
Updated Balance = 1500
300 is withdrawn
Updated Balance = 1200
