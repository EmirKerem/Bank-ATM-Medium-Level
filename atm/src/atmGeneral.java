
import java.util.Scanner;

public class atmGeneral {
    public void run(Account account) {
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to our Bank");
        
        System.out.println("**********************");
        System.out.println("User Login");
        System.out.println("**********************");
        
        int loginAttempts = 3;
        while (true) {
            if (login.login(account)) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Unsuccessful Login Attempt");
                loginAttempts--;
                System.out.println("Remaining Login Attempts: " + loginAttempts);
            }
            if (loginAttempts == 0) {
                System.out.println("No Remaining Login Attempts");
                
                return;
            }
        }
        
        System.out.println("***************************");
        String operations = "1. View Balance\n" 
                          + "2. Deposit Money\n" 
                          + "3. Withdraw Money\n" 
                          + "4. Press Q to Exit";
        System.out.println(operations);
        System.out.println("****************************");
        
        while (true) {
            System.out.println("Select an Action");
            String operation = scanner.nextLine();
            
            if (operation.equals("q")) {
                break;
            } else if (operation.equals("1")) {
                System.out.println("Your Balance: " + account.getBalance());
            } else if (operation.equals("2")) {
                System.out.println("Enter the Amount to Deposit");
                double amountToDeposit = scanner.nextDouble();
                scanner.nextLine();
                account.deposit(amountToDeposit);
            } else if (operation.equals("3")) {
                System.out.println("Enter the Amount to Withdraw");
                double amountToWithdraw = scanner.nextDouble();
                scanner.nextLine();
                account.withdraw(amountToWithdraw);
            } else {
                System.out.println("Invalid Action");
            }
        }
    }
}


