import java.util.Scanner;

public class Login {
    public boolean login(Account account) {
        
        Scanner scanner = new Scanner(System.in);
        
        String username1;
        String password1;
        
        System.out.print("Your Username: ");
        username1 = scanner.nextLine();
            
        System.out.print("Password: ");
        password1 = scanner.nextLine();
            
        if (account.getUsername().equals(username1) && account.getPassword().equals(password1)) {
            return true;
        } else {
            return false;
        }
    }
}

