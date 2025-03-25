package BankAccount;

class BankAcc {
    private int accNum;
    private String accName;
    private double balance;

    public BankAcc(int accNum, String accName, double initialBalance) {
        this.accNum = accNum;
        this.accName = accName;
        this.balance = initialBalance >= 0 ? initialBalance : 0;
    }

    public int getAccNum() {
        return accNum;
    }

    public String getAccName() {
        return accName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        BankAcc account = new BankAcc(101, "Varsha", 5000);

        System.out.println("Account Holder: " + account.getAccName());
        System.out.println("Account Number: " + account.getAccNum());
        System.out.println("Current Balance: " + account.getBalance());

        account.deposit(2000);
        account.withdraw(8000);
        account.withdraw(3000);
    }
}
