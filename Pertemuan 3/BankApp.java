public class BankApp {
    public static void main(String[] args) {
      /* TODO: buatlah main yang akan melakukan operasi transaksi
         dan akan menampilkan pesan bila terjadi kesalahan
  
         skenario bebas berkreasi, tidak harus sama seperti contoh dibawah
  
         BankAccount account = new BankAccount(500.0);
  
         // skenario saldo mencukupi
         account.withdraw(200.0);
         System.out.println("Saldo saat ini: $" + account.getBalance());
  
         // skenario saldo tidak mencukupi
         account.withdraw(400.0);
      */
      BankAccount account = new BankAccount(500.0);
  
      // skenario saldo mencukupi
      account.withdraw(200.0);
      System.out.println("Saldo saat ini: $" + account.getBalance());

      // skenario saldo tidak mencukupi
      account.withdraw(400.0);

      //Isi saldo
      account.deposit(1000);
      System.out.println("Saldo saat ini: $" + account.getBalance());
    }
  }
  