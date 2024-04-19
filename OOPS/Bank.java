package OOPS;
public class Bank {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(123456, 200);


        savingsAccount.deposit(50);
        savingsAccount.withdraw(30);
        savingsAccount.withdraw(150);
    }
}

class BankAccount {
    
    int accountNumber;
    double balance;
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: $" + amount);
        displayBalance();
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal: $" + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance requirement not met.");
        }
    }
}
