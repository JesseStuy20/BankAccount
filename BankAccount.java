public class BankAccount {
  private double balance ;
  private int accountID ;
  private String password ;

  public BankAccount(int ID, String pass) {
    accountID = ID ;
    password = pass ;
    balance = 0.00 ;
  }

  public double getBalance() {
    return balance ;
  }

  public int getAccountID() {
    return accountID ;
  }

  public boolean deposit(double amount) {
    if (amount > 0) balance = balance + amount;
    if (amount > 0) return true;
    else return false;
  }

  public boolean withdraw(double amount) {
    if ((amount > 0) && (balance >= amount)) balance = balance - amount;
    if ((amount > 0) && (balance >= amount)) return true;
    else return false;
  }

}
