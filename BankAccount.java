public class BankAccount {
  private double balance ;
  private int accountID ;
  private String password ;

  public BankAccount(int accountID, String password) {
    double balance = 0.0 ;
  }

  public double getBalance() {
    return balance ;
  }

  public double getAccountID() {
    return accountID ;
  }

  public boolean deposit(double amount) {
    if (amount > 0) balance = balance + amount;
    if (amount > 0) return true;
    else return false;
  }

}
