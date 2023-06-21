package PracticePrograms;

class Account {

  public long accountNumber;
  public double balance;

  Account() {
    accountNumber = 0;
    balance = 0;
  }

  public void deposit(double amount) {
    if (amount < 0) {
      System.out.println("Amount cannot be negetive");
    } else {
      balance += amount;
    }
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

public class BankingSystem {

  public static void main(String[] args) {}
}
