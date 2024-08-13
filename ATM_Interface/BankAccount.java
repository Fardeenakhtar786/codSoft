public class BankAccount 
{
    private double balance;

    public BankAccount(double initialBalance) 
    {
        if (initialBalance >= 0)
            this.balance = initialBalance; 
	else 
	{
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Balance set to 0.");
        }
    }


    public void deposit(double amount) 
    {
        if (amount > 0) 
	{
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } 
	else 
	{
            System.out.println("Deposit amount must be positive.");
        }
    }


    public boolean withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
	{
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
            return true;
        } 
	else if (amount > balance) 
	{
            System.out.println("Insufficient balance.");
            return false;
        } 
	else 
	{
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
    }


    public double checkBalance()
    { 
        return balance;
    }
}
