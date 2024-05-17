package com.day1;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Current balance after deposit: " + balance);
    }

   public void withdrawAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("You have withdrawal [" + amount +"] successfully now current balance is: " + balance);
        } else {
            System.out.println("You cant withdrawal due to insufficient funds i.e. ["+balance+"]");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account Number is: " + accountNumber);
        System.out.println("Account Holder name is: " + accountHolderName);
        System.out.println("Current Balance is: " + balance);
    }

    
    public static void main(String[] args) {
        Account account1 = new Account("2562428", "Avnish Athe", 5000.0);

        System.out.println("Account Details:");
        account1.printAccountDetails();

        account1.depositAmount(1500.0);
        account1.withdrawAmount(2000.0);

        System.out.println("Account Details after transactions:");
        account1.printAccountDetails();
        
        Account account2 = new Account("2324245", "Ishita Athe", 10000.0);

        System.out.println("Account Details:");
        account2.printAccountDetails();

        account2.withdrawAmount(12000.0);

        System.out.println("Account Details after transactions:");
        account2.printAccountDetails();
    }
}

