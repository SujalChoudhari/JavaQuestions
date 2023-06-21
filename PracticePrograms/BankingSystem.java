package PracticePrograms;

class Account {

  public long accountNumber;
  public double balance;

  Account() {
    accountNumber = 0;
    balance = 0;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    if (amount > balance) {
      System.out.println("Amount cannot be greater than balance");
    }
  }

  public void displayAccountInfo() {
    System.out.println("Account: " + accountNumber + ": " + balance);
  }
}

class SavingsAccount extends Account {

  public float interestRate;

  SavingsAccount(float interestRate) {
    this.interestRate = interestRate;
  }

  public void calculateInterest() {
    double interest = balance * interestRate;
    System.out.println("Your interest is:" + interest);
  }
}

class CurrentAccount extends Account {

  public double overdraftLimit;

  CurrentAccount(double overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }

  public void checkOverdraft() {
    if (balance < 0) {
      System.out.println("You have exceeded your overdraft limit");
    }
  }
}

public class BankingSystem {

  public static void main(String[] args) {
    // Demonstrate inheritance using banking system
    SavingsAccount savingsAccount = new SavingsAccount(0.05f);
    savingsAccount.accountNumber = 123456789;
    savingsAccount.balance = 1000;

    CurrentAccount currentAccount = new CurrentAccount(1000);
    currentAccount.accountNumber = 987654321;
    currentAccount.balance = -30;

    currentAccount.checkOverdraft();

    savingsAccount.calculateInterest();
  }
}
