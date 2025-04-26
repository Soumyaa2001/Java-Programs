class ATM {
    private int accountNumber;
    private double balance;

    public ATM() {
        this(0, 0.0);
        System.out.println("ATM account created.");
    }

    public ATM(int accountNumber) {
        this(accountNumber, 0.0);
        System.out.println("ATM account number created.");
    }

    public ATM(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("ATM account with balance created.");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class Bank {
    private ATM atm;

    public Bank(ATM atm) {
        this.atm = atm;
        System.out.println("Bank has an ATM.");
    }

    public void checkATMBalance() {
        atm.checkBalance();
    }

    public void withdrawFromATM(double amount) {
        atm.withdraw(amount);
    }

    public void depositToATM(double amount) {
        atm.deposit(amount);
    }
}

public class AtmMain {
    public static void main(String[] args) {
        ATM atm = new ATM(12345678, 5000.0);

        Bank bank = new Bank(atm);

        bank.checkATMBalance();  

        bank.withdrawFromATM(1000.0);  
        bank.depositToATM(2000.0);     

        bank.checkATMBalance();  
    }
}
