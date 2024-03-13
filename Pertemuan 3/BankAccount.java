public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal
  
    public BankAccount(double initialBalance) {
      this.balance = initialBalance;
    }
  
    public void deposit(double amount) {
      balance += amount;
      System.out.println("Deposited: $" + amount);
    }
  
    public void withdraw(double amount) {
      /* TODO: buatlah logic yang memenuhi persyaratan diatas 
         dengan menggunakan exception */
      try{
        if(amount>this.balance){
          throw new InsufficientFundsException("Insufficent funds. Minimum balance required: $"+this.MIN_BALANCE);
        }
        this.balance = balance-amount;
        System.out.println("Withdrawn: $"+amount);
      }
      catch(InsufficientFundsException ex){
        System.out.println(ex.getMessage());
      }
    }
  
    public double getBalance() {
      return balance;
    }
  }
  
