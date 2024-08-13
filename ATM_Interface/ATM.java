import java.util.Scanner;

public class ATM 
{
    private BankAccount account;
    public ATM(BankAccount account) 
    {
        this.account = account;
    }
    public void start() 
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) 
	{
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) 
	    {
                case 1:
                    System.out.println("Your current balance is: " + account.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
