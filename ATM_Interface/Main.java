public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(0);
        ATM atm = new ATM(myAccount);
        atm.start();
    }
}
