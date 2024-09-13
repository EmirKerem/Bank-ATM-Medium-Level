public class Main {
    public static void main(String[] args) {
   
        atmGeneral atm = new atmGeneral();
        
        Account account = new Account("Aiden", "123456", 2000);
        
        atm.run(account);
        System.out.println("Exiting the System...");
    }
}
