public class BankAccount {
  private double balance ;
  private int accountID ;
  private String password ;

  public BankAccount(int accountID, String password) {
    this.accountID = accountID ;
    this.password = password ;
    this.balance = 0.0 ;
  }

  public double getBalance() {
    return balance ;
  }

  public int getAccountID() {
    return accountID ;
  }

  public void setPassword(String newPassword) {
    password = newPassword ;
  }

  public String getPassword() {
    return password ;
  }

  public boolean deposit(double amount) {
    if (amount > 0) balance = balance + amount;
    if (amount > 0) return true;
    else return false;
  }

  public boolean withdraw(double amount) {
    if ((amount > 0) && (balance >= amount)) balance = (balance - amount);
    if ((amount > 0) && (balance >= amount)) return true;
    else return false;
  }

  public String toString() {
    return "#" + accountID + "\t" + "$" + balance ;
  }

  public boolean authenticate(String password) {
    return (password.equals(this.password)) ;
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if (authenticate(password) && deposit(amount)) {
      other.deposit(amount) ;
      return true ;
  }
    else return false ;
  }

}
