
public class Account {
	private double balance;
	
	public Account(double initialBalance)
	{
		if (initialBalance > 0.0)
			balance = initialBalance;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	public double getmoney()
	{
		return balance;
	}
}
