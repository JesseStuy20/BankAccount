public class BankTester {
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(415624, "password123") ;
    System.out.println(b1.getBalance()) ;
    System.out.println(b1.getAccountID()) ;
    System.out.println("password tests") ;
    System.out.println(b1.getPassword()) ;
    b1.setPassword("newPassword123") ;
    System.out.println(b1.getPassword()) ;
    System.out.println("deposit tests") ;
    System.out.println(b1.deposit(513.20)) ;
    System.out.println(b1.deposit(-956.50)) ;
    System.out.println(b1.getBalance()) ;
    System.out.println("withdraw tests") ;
    System.out.println(b1.withdraw(612.79)) ;
    System.out.println(b1.withdraw(41.50)) ;
    System.out.println(b1.getBalance()) ;
    System.out.println("toString test") ;
    System.out.println(b1.toString()) ;
    System.out.println(b1.authenticate("newPassword123")) ;
    System.out.println(b1.authenticate("Password123")) ;
    BankAccount b2 = new BankAccount(743735, "password456") ;
    System.out.println(b2.getBalance()) ;
    System.out.println(b1.transferTo(b2, 145.21, "newPassword123")) ;
    System.out.println(b2.getBalance()) ;
  }

}
