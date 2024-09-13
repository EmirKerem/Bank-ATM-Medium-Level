public class Account {
   private String username;
   private String password;
   private double balance;
   
   public Account(String username, String password, double balance) {
       this.username = username;
       this.password = password;
       this.balance = balance;
   }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Your New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient Balance");
        }
        if (amount > 1500) {
            System.out.println("You Cannot Withdraw More Than Your Daily Limit");
        }
        else {
            balance -= amount;  // You might want to actually deduct the amount

        }
    }
}